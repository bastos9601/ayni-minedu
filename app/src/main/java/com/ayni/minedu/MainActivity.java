package com.ayni.minedu;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.webkit.WebSettings;
import android.webkit.WebChromeClient;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ProgressBar;
import android.graphics.Bitmap;
import android.net.http.SslError;
import android.webkit.SslErrorHandler;

public class MainActivity extends Activity {

    private WebView webView;
    private ProgressBar progressBar;
    private static final String AYNI_URL = "https://servicios-ayni.minedu.gob.pe/ayni/inicio";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Inicializar vistas
        webView = findViewById(R.id.webview);
        progressBar = findViewById(R.id.progressBar);

        // Configurar WebView
        configurarWebView();

        // Cargar URL
        webView.loadUrl(AYNI_URL);
    }

    private void configurarWebView() {
        WebSettings webSettings = webView.getSettings();
        
        // Habilitar JavaScript
        webSettings.setJavaScriptEnabled(true);
        
        // Habilitar DOM Storage
        webSettings.setDomStorageEnabled(true);
        
        // Habilitar cookies
        webSettings.setMixedContentMode(WebSettings.MIXED_CONTENT_NEVER_ALLOW);
        
        // Habilitar caché
        webSettings.setCacheMode(WebSettings.LOAD_DEFAULT);
        // Nota: setAppCacheEnabled() fue removido en APIs modernas de Android
        
        // Configuración de zoom
        webSettings.setSupportZoom(true);
        webSettings.setBuiltInZoomControls(false);
        webSettings.setDisplayZoomControls(false);
        
        // Configuración adicional
        webSettings.setLoadWithOverviewMode(true);
        webSettings.setUseWideViewPort(true);
        webSettings.setLoadsImagesAutomatically(true);
        webSettings.setJavaScriptCanOpenWindowsAutomatically(true);
        webSettings.setSupportMultipleWindows(true); // Cambiar a true para manejar popups
        
        // Permitir acceso a archivos y contenido
        webSettings.setAllowFileAccess(true);
        webSettings.setAllowContentAccess(true);
        
        // Deshabilitar safe browsing que puede bloquear algunos enlaces
        webSettings.setSafeBrowsingEnabled(false);
        
        // User Agent (mantener el predeterminado)
        webSettings.setUserAgentString(webSettings.getUserAgentString());
        
        // WebViewClient para controlar la navegación
        webView.setWebViewClient(new WebViewClient() {
            
            @Override
            public void onPageStarted(WebView view, String url, Bitmap favicon) {
                super.onPageStarted(view, url, favicon);
                progressBar.setVisibility(View.VISIBLE);
            }

            @Override
            public void onPageFinished(WebView view, String url) {
                super.onPageFinished(view, url);
                progressBar.setVisibility(View.GONE);
                
                // Inyectar JavaScript para interceptar TODOS los métodos de navegación
                String jsCode = "javascript:(function() { " +
                        // Remover target="_blank" de todos los enlaces
                        "var links = document.getElementsByTagName('a'); " +
                        "for(var i = 0; i < links.length; i++) { " +
                        "    links[i].removeAttribute('target'); " +
                        "} " +
                        // Interceptar window.open y redirigir en la misma ventana
                        "window.open = function(url, target, features) { " +
                        "    window.location.href = url; " +
                        "    return window; " +
                        "}; " +
                        "})()";
                view.loadUrl(jsCode);
            }

            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                // FORZAR que TODO se abra dentro del WebView
                // No importa qué URL sea, si es HTTPS, se abre aquí
                if (url.startsWith("https://") || url.startsWith("http://")) {
                    view.loadUrl(url);
                    return true; // Indica que manejamos la navegación
                }
                // Para cualquier otro esquema (tel:, mailto:, etc)
                return false;
            }

            @Override
            public void onReceivedError(WebView view, int errorCode, String description, String failingUrl) {
                super.onReceivedError(view, errorCode, description, failingUrl);
                // Cargar página de error local
                String errorHtml = "<html><body style='text-align:center; padding:50px; font-family:Arial;'>" +
                        "<h2>Error de Conexión</h2>" +
                        "<p>No se pudo cargar el sitio de Ayni MINEDU.</p>" +
                        "<p>Por favor, verifica tu conexión a Internet.</p>" +
                        "<button onclick='window.location.reload()' style='padding:10px 20px; font-size:16px;'>Reintentar</button>" +
                        "</body></html>";
                view.loadData(errorHtml, "text/html", "UTF-8");
            }

            @Override
            public void onReceivedSslError(WebView view, SslErrorHandler handler, SslError error) {
                // NO aceptar certificados inválidos por seguridad
                handler.cancel();
            }
        });

        // WebChromeClient para mejor manejo de JavaScript y progreso
        webView.setWebChromeClient(new WebChromeClient() {
            @Override
            public void onProgressChanged(WebView view, int newProgress) {
                progressBar.setProgress(newProgress);
            }
            
            @Override
            public boolean onCreateWindow(WebView view, boolean isDialog, boolean isUserGesture, android.os.Message resultMsg) {
                // Cuando el sitio intenta abrir una nueva ventana (popup)
                // Lo abrimos en el mismo WebView en lugar de crear una nueva ventana
                WebView.HitTestResult result = view.getHitTestResult();
                String data = result.getExtra();
                if (data != null) {
                    view.loadUrl(data);
                }
                return true;
            }
        });
    }

    // Manejar el botón Atrás para navegar en el WebView
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK && webView.canGoBack()) {
            webView.goBack();
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }

    @Override
    protected void onDestroy() {
        if (webView != null) {
            webView.destroy();
        }
        super.onDestroy();
    }
}
