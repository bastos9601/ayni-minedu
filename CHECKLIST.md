# ✅ Checklist de Implementación - Ayni MINEDU

Usa esta lista para verificar que todo esté configurado correctamente.

## 📋 Antes de Comenzar

- [ ] Node.js instalado (versión 16+)
  - Verificar: `node --version`
- [ ] npm instalado
  - Verificar: `npm --version`
- [ ] Git instalado
  - Verificar: `git --version`
- [ ] Cuenta de GitHub creada
- [ ] Cuenta de Expo creada (https://expo.dev)

## 📦 Instalación del Proyecto

- [ ] Repositorio clonado o archivos descargados
- [ ] Ejecutado: `npm install`
- [ ] Ejecutado: `npx expo install react-native-webview`
- [ ] Ejecutado: `npm install -g eas-cli`
- [ ] Sin errores en la instalación

## 🎨 Assets Preparados

- [ ] Icono `assets/icon.png` creado (1024x1024)
- [ ] Splash screen `assets/splash.png` creado (1284x2778)
- [ ] Los archivos tienen el formato correcto (PNG)
- [ ] Los archivos no están corruptos

## 🔐 Configuración de Expo

- [ ] Ejecutado: `eas login`
- [ ] Iniciada sesión correctamente
- [ ] Ejecutado: `eas build:configure`
- [ ] Archivo `eas.json` verificado
- [ ] Token de Expo generado
  - URL: https://expo.dev/accounts/[usuario]/settings/access-tokens
- [ ] Token guardado en lugar seguro

## 🐙 Configuración de GitHub

- [ ] Repositorio creado en GitHub
- [ ] Repositorio puede ser privado o público
- [ ] Token EXPO_TOKEN agregado a GitHub Secrets
  - Ruta: Settings → Secrets and variables → Actions
  - Nombre exacto: `EXPO_TOKEN`
- [ ] Secret guardado correctamente

## 📤 Subida del Código

- [ ] Ejecutado: `git init`
- [ ] Ejecutado: `git add .`
- [ ] Ejecutado: `git commit -m "Proyecto inicial"`
- [ ] Ejecutado: `git branch -M main`
- [ ] Ejecutado: `git remote add origin [URL]`
- [ ] Ejecutado: `git push -u origin main`
- [ ] Código visible en GitHub

## 🏗️ Generación del APK

### Opción A: GitHub Actions

- [ ] Workflow visible en pestaña "Actions"
- [ ] Ejecutado "Run workflow"
- [ ] Workflow completado sin errores
- [ ] Build iniciado en Expo

### Opción B: Local

- [ ] Ejecutado: `eas build --platform android --profile preview`
- [ ] Build iniciado correctamente
- [ ] URL de seguimiento recibida

## ⏰ Espera del Build

- [ ] Build en progreso (estado: "in queue" o "building")
- [ ] Tiempo estimado: 10-15 minutos
- [ ] Build completado (estado: "finished")
- [ ] Sin errores en el build

## 📥 Descarga del APK

- [ ] Accedido a https://expo.dev
- [ ] Proyecto localizado
- [ ] Sección "Builds" accedida
- [ ] Build más reciente encontrado
- [ ] APK descargado
- [ ] Archivo descargado completamente (no interrumpido)

## 📱 Instalación en Android

- [ ] APK transferido al teléfono Android
- [ ] "Orígenes desconocidos" habilitado
  - Ruta: Configuración → Seguridad
- [ ] APK instalado correctamente
- [ ] Aplicación visible en el menú de apps
- [ ] Aplicación abre correctamente
- [ ] WebView carga el sitio de Ayni MINEDU

## ✨ Pruebas Funcionales

- [ ] La aplicación abre sin errores
- [ ] Se muestra pantalla de carga inicial
- [ ] Se carga el sitio: https://servicios-ayni.minedu.gob.pe/ayni/inicio
- [ ] El sitio se ve correctamente
- [ ] La navegación funciona dentro de la app
- [ ] Los enlaces se abren dentro de la app (no en Chrome)
- [ ] Los formularios funcionan
- [ ] El botón Atrás de Android funciona
- [ ] La sesión se mantiene al navegar
- [ ] No hay errores visibles

## 🔒 Verificación de Seguridad

- [ ] Solo se usa HTTPS
- [ ] No se modifican certificados SSL
- [ ] No se capturan contraseñas
- [ ] No se interceptan datos
- [ ] La app solo actúa como WebView
- [ ] No se abre Chrome automáticamente

## 📊 Optimizaciones Opcionales

- [ ] Icono personalizado con logo oficial
- [ ] Splash screen con branding
- [ ] Colores ajustados al branding de MINEDU
- [ ] Versión incrementada en app.json
- [ ] README.md personalizado

## 🎉 Proyecto Completado

- [ ] APK instalado y funcionando
- [ ] Sin errores críticos
- [ ] Navegación fluida
- [ ] Autenticación funcional
- [ ] Listo para usar

## 📝 Notas Adicionales

Usa este espacio para anotar cualquier problema encontrado o configuración especial:

```
_______________________________________________
_______________________________________________
_______________________________________________
```

## 🆘 Si Algo Falla

Revisa estos archivos de ayuda:
- `README.md` - Documentación completa
- `INICIO_RAPIDO.md` - Guía rápida
- `COMANDOS.md` - Lista de comandos
- `SOLUCION_PROBLEMAS.md` - Problemas comunes

## ⏱️ Tiempo Total Estimado

- Configuración inicial: 15-20 minutos
- Build del APK: 10-15 minutos
- Instalación y pruebas: 5-10 minutos
- **Total**: 30-45 minutos

---

**¡Marca cada ítem conforme lo completes! 🎯**
