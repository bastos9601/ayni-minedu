import React, { useState, useRef } from 'react';
import {
  StyleSheet,
  View,
  ActivityIndicator,
  BackHandler,
  Alert,
  SafeAreaView,
  Platform,
  StatusBar
} from 'react-native';
import { WebView } from 'react-native-webview';
import { StatusBar as ExpoStatusBar } from 'expo-status-bar';

const AYNI_URL = 'https://servicios-ayni.minedu.gob.pe/ayni/inicio';

export default function App() {
  const [loading, setLoading] = useState(true);
  const [error, setError] = useState(false);
  const webViewRef = useRef(null);

  // Manejar el botón Atrás de Android
  React.useEffect(() => {
    const backAction = () => {
      if (webViewRef.current) {
        webViewRef.current.goBack();
        return true; // Prevenir el comportamiento por defecto
      }
      return false;
    };

    const backHandler = BackHandler.addEventListener(
      'hardwareBackPress',
      backAction
    );

    return () => backHandler.remove();
  }, []);

  // Manejar el estado de navegación del WebView
  const handleNavigationStateChange = (navState) => {
    // Permite al botón Atrás funcionar correctamente
    if (!navState.canGoBack) {
      BackHandler.exitApp();
    }
  };

  // Manejar errores de carga
  const handleError = () => {
    setError(true);
    setLoading(false);
    Alert.alert(
      'Error de Conexión',
      'No se pudo cargar el sitio de Ayni MINEDU. Por favor, verifica tu conexión a Internet e intenta nuevamente.',
      [
        {
          text: 'Reintentar',
          onPress: () => {
            setError(false);
            setLoading(true);
            if (webViewRef.current) {
              webViewRef.current.reload();
            }
          }
        }
      ]
    );
  };

  // Controlar qué enlaces deben abrirse en el WebView
  const handleShouldStartLoadWithRequest = (request) => {
    const url = request.url;

    // Permitir solo HTTPS
    if (!url.startsWith('https://')) {
      return false;
    }

    // Mantener dentro del WebView todos los enlaces de:
    // - servicios-ayni.minedu.gob.pe
    // - Otros dominios de MINEDU que puedan ser parte del sistema
    if (
      url.includes('minedu.gob.pe') ||
      url.includes('servicios-ayni.minedu.gob.pe')
    ) {
      return true;
    }

    // Para cualquier otro dominio externo, mantenerlo dentro del WebView
    // Esto evita que se abra Chrome automáticamente
    // Si el usuario necesita abrir un enlace externo específico,
    // puede copiar la URL manualmente desde el WebView
    return true;
  };

  return (
    <SafeAreaView style={styles.container}>
      <ExpoStatusBar style="dark" />
      
      <WebView
        ref={webViewRef}
        source={{ uri: AYNI_URL }}
        style={styles.webview}
        
        // Configuración de JavaScript y DOM
        javaScriptEnabled={true}
        domStorageEnabled={true}
        
        // Configuración de cookies y caché
        thirdPartyCookiesEnabled={true}
        sharedCookiesEnabled={true}
        cacheEnabled={true}
        
        // Permitir archivos y formularios
        allowFileAccess={true}
        allowFileAccessFromFileURLs={false}
        allowUniversalAccessFromFileURLs={false}
        mixedContentMode="never"
        
        // Configuración de navegación
        onNavigationStateChange={handleNavigationStateChange}
        onShouldStartLoadWithRequest={handleShouldStartLoadWithRequest}
        
        // Manejo de carga y errores
        onLoadStart={() => setLoading(true)}
        onLoadEnd={() => setLoading(false)}
        onError={handleError}
        onHttpError={handleError}
        
        // Renderizado
        startInLoadingState={true}
        renderLoading={() => (
          <View style={styles.loadingContainer}>
            <ActivityIndicator size="large" color="#0066cc" />
          </View>
        )}
        
        // Configuración adicional de seguridad
        injectedJavaScript=""
        
        // Permitir ventanas emergentes (popups) si son necesarias
        setSupportMultipleWindows={false}
        
        // User Agent (mantener el predeterminado)
        userAgent={undefined}
        
        // Configuración de zoom
        scalesPageToFit={true}
        
        // Otros ajustes
        bounces={false}
        scrollEnabled={true}
        showsHorizontalScrollIndicator={false}
        showsVerticalScrollIndicator={false}
        
        // Configuración específica de Android
        androidLayerType="hardware"
        androidHardwareAccelerationDisabled={false}
      />

      {loading && !error && (
        <View style={styles.loadingOverlay}>
          <ActivityIndicator size="large" color="#0066cc" />
        </View>
      )}
    </SafeAreaView>
  );
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    backgroundColor: '#ffffff',
    paddingTop: Platform.OS === 'android' ? StatusBar.currentHeight : 0,
  },
  webview: {
    flex: 1,
  },
  loadingContainer: {
    position: 'absolute',
    top: 0,
    left: 0,
    right: 0,
    bottom: 0,
    justifyContent: 'center',
    alignItems: 'center',
    backgroundColor: '#ffffff',
  },
  loadingOverlay: {
    position: 'absolute',
    top: 0,
    left: 0,
    right: 0,
    bottom: 0,
    justifyContent: 'center',
    alignItems: 'center',
    backgroundColor: 'rgba(255, 255, 255, 0.9)',
  },
});
