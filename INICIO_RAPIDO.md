# 🚀 Inicio Rápido - Ayni MINEDU

Guía resumida para generar tu APK en menos de 30 minutos.

## ✅ Prerequisitos

- Node.js instalado (versión 16 o superior)
- Cuenta de GitHub
- Cuenta de Expo (crear gratis en https://expo.dev)

## 📋 Pasos Rápidos

### 1. Preparar iconos (5 minutos)

Coloca estos archivos en la carpeta `assets/`:
- `icon.png` (1024x1024)
- `splash.png` (1284x2778)

**Tip**: Usa https://appicon.co/ para generarlos rápidamente.

### 2. Instalar dependencias (3 minutos)

```bash
npm install
npx expo install react-native-webview
npm install -g eas-cli
```

### 3. Configurar Expo (5 minutos)

```bash
# Iniciar sesión
eas login

# Configurar proyecto
eas build:configure
```

### 4. Obtener token para GitHub (2 minutos)

1. Ve a: https://expo.dev/accounts/[tu-usuario]/settings/access-tokens
2. Crea un nuevo token
3. Cópialo (lo necesitarás luego)

### 5. Subir a GitHub (5 minutos)

```bash
# Crear repositorio en GitHub primero, luego:
git init
git add .
git commit -m "Proyecto inicial"
git branch -M main
git remote add origin <URL_DE_TU_REPO>
git push -u origin main
```

### 6. Configurar GitHub Secret (2 minutos)

1. Ve a tu repo → Settings → Secrets and variables → Actions
2. New repository secret
3. Nombre: `EXPO_TOKEN`
4. Valor: Pega el token de Expo
5. Add secret

### 7. Generar APK (15 minutos de espera)

#### Opción A: Desde GitHub Actions
1. Ve a la pestaña "Actions" en tu repositorio
2. Selecciona "Build Android APK"
3. Clic en "Run workflow"
4. Espera ~15 minutos

#### Opción B: Desde tu computadora
```bash
eas build --platform android --profile preview
```

### 8. Descargar APK

1. Ve a https://expo.dev
2. Tu proyecto → Builds
3. Encuentra el build completado
4. Download

### 9. Instalar en Android

1. Habilita "Instalar de orígenes desconocidos"
2. Abre el APK
3. Instalar
4. ¡Listo!

## 🆘 Problemas Comunes

### "No se encuentra expo"
```bash
npm install -g expo-cli
```

### "No se encuentra eas"
```bash
npm install -g eas-cli
```

### Build falla
- Verifica el token EXPO_TOKEN
- Revisa los logs en Actions
- Asegúrate de haber hecho `eas login`

### APK no se instala
- Habilita "Orígenes desconocidos" en Configuración
- Verifica que el APK se descargó completo

## 📞 Necesitas más ayuda?

Lee el README.md completo para instrucciones detalladas.

## ⏱️ Tiempos Aproximados

- Configuración inicial: 15 minutos
- Build del APK: 10-15 minutos
- **Total**: ~30 minutos

---

**¡Éxito con tu aplicación Ayni MINEDU! 🎉**
