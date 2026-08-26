# 📝 Comandos Útiles - Ayni MINEDU

Lista de comandos más utilizados durante el desarrollo y despliegue.

## 🔧 Instalación Inicial

```bash
# Instalar dependencias del proyecto
npm install

# Instalar react-native-webview
npx expo install react-native-webview

# Instalar EAS CLI globalmente
npm install -g eas-cli

# Actualizar EAS CLI
npm update -g eas-cli
```

## 👤 Autenticación Expo

```bash
# Iniciar sesión
eas login

# Ver usuario actual
eas whoami

# Cerrar sesión
eas logout
```

## 🏗️ Configuración del Proyecto

```bash
# Configurar EAS Build
eas build:configure

# Ver configuración del proyecto
eas project:info
```

## 📱 Generar APK

```bash
# Build APK (perfil preview)
eas build --platform android --profile preview

# Build APK sin esperar (no interactivo)
eas build --platform android --profile preview --non-interactive --no-wait

# Build APK (perfil production)
eas build --platform android --profile production

# Ver lista de builds
eas build:list

# Ver detalles de un build específico
eas build:view [BUILD_ID]

# Cancelar un build en progreso
eas build:cancel [BUILD_ID]
```

## 🧪 Desarrollo Local

```bash
# Iniciar servidor de desarrollo
expo start

# Iniciar con caché limpio
expo start --clear

# Ver en Android (requiere emulador o dispositivo)
expo start --android

# Ver logs más detallados
expo start --dev-client
```

## 📦 Gestión de Dependencias

```bash
# Instalar una dependencia
npm install [paquete]

# Instalar dependencia de desarrollo
npm install --save-dev [paquete]

# Actualizar dependencias
npm update

# Verificar versiones desactualizadas
npm outdated

# Limpiar caché de npm
npm cache clean --force

# Reinstalar todo desde cero
rm -rf node_modules package-lock.json
npm install
```

## 🔍 Diagnóstico

```bash
# Ver información del proyecto Expo
npx expo-env-info

# Verificar configuración de EAS
eas config

# Ver credenciales Android
eas credentials

# Limpiar caché de Expo
expo start --clear
```

## 🔐 Gestión de Credenciales

```bash
# Ver credenciales del proyecto
eas credentials

# Configurar credenciales Android
eas credentials --platform android
```

## 📤 Git (Control de Versiones)

```bash
# Inicializar repositorio
git init

# Ver estado
git status

# Agregar archivos
git add .

# Hacer commit
git commit -m "Descripción de cambios"

# Crear rama principal
git branch -M main

# Agregar repositorio remoto
git remote add origin <URL>

# Subir cambios
git push -u origin main

# Subir cambios (después del primer push)
git push

# Ver historial
git log --oneline

# Ver cambios no guardados
git diff
```

## 🌐 GitHub Actions

```bash
# Ver workflows
gh workflow list

# Ejecutar workflow manualmente
gh workflow run "Build Android APK"

# Ver ejecuciones recientes
gh run list

# Ver detalles de una ejecución
gh run view [RUN_ID]
```

## 🧹 Limpieza

```bash
# Limpiar caché de Expo
expo start --clear

# Eliminar node_modules
rm -rf node_modules

# Eliminar carpeta de build
rm -rf .expo

# Limpiar todo y reinstalar
rm -rf node_modules .expo package-lock.json
npm install
```

## 🔄 Actualizar Proyecto

```bash
# Ver versión actual de Expo
expo --version

# Actualizar Expo CLI
npm install -g expo-cli

# Actualizar SDK de Expo (seguir asistente)
npx expo upgrade

# Actualizar EAS CLI
npm update -g eas-cli
```

## 📊 Útiles para Debugging

```bash
# Ver información del entorno
npx expo-env-info

# Verificar paquetes de Expo instalados
npx expo install --check

# Corregir dependencias de Expo
npx expo install --fix
```

## 🎯 Comandos Específicos del Proyecto

```bash
# Iniciar proyecto
npm start

# Build APK rápido
eas build -p android --profile preview

# Ver builds recientes
eas build:list --limit 5

# Descargar APK del último build
# (ir a https://expo.dev y descargarlo manualmente)
```

## ⚡ Atajos Útiles

```bash
# Instalación completa desde cero
npm install && npx expo install react-native-webview

# Build completo no interactivo
eas build -p android --profile preview --non-interactive

# Ver info completa del proyecto
eas project:info && eas build:list --limit 3
```

## 🆘 Solución de Problemas

```bash
# Si "expo command not found"
npm install -g expo-cli

# Si "eas command not found"
npm install -g eas-cli

# Si hay errores de dependencias
rm -rf node_modules package-lock.json
npm install
npx expo install --check

# Si el build falla por caché
expo start --clear
rm -rf .expo

# Si hay problemas con EAS
eas logout
eas login
```

## 📝 Notas

- Usa `npx` antes de comandos de Expo si no has instalado expo-cli globalmente
- Los builds de EAS se ejecutan en la nube, no en tu computadora
- El perfil "preview" genera APK, el perfil "production" puede generar AAB
- GitHub Actions usa el token `EXPO_TOKEN` para autenticarse

## 🔗 Recursos

- [Documentación de EAS Build](https://docs.expo.dev/build/introduction/)
- [Documentación de Expo CLI](https://docs.expo.dev/workflow/expo-cli/)
- [EAS CLI Reference](https://docs.expo.dev/eas/cli/)
