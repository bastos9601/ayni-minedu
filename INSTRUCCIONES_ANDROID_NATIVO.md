# 📱 Ayni MINEDU - Android Nativo (Java)

## ✅ Proyecto Simplificado

Este es un proyecto Android **100% nativo** usando Java y WebView. **No requiere Node.js, npm, ni Expo**.

## 🎯 Ventajas de Este Método

- ✅ **Más simple**: Solo necesitas Android Studio o GitHub Actions
- ✅ **Más rápido**: Builds más rápidos
- ✅ **Sin dependencias**: No requiere Node.js ni npm
- ✅ **Control total**: Código Java puro
- ✅ **Sin tokens**: No necesitas cuenta de Expo

## 📦 Estructura del Proyecto

```
ayni-minedu/
├── app/
│   ├── src/main/
│   │   ├── java/com/ayni/minedu/
│   │   │   └── MainActivity.java          ⭐ Código principal
│   │   ├── res/
│   │   │   ├── layout/
│   │   │   │   └── activity_main.xml      ⭐ Layout UI
│   │   │   ├── values/
│   │   │   │   ├── strings.xml
│   │   │   │   └── themes.xml
│   │   │   └── drawable/
│   │   │       └── progress_bar.xml
│   │   └── AndroidManifest.xml            ⭐ Configuración de la app
│   └── build.gradle                        ⭐ Configuración del módulo
├── build.gradle                            ⭐ Configuración del proyecto
├── settings.gradle
├── gradle.properties
├── gradlew                                 ⭐ Script de Gradle (Linux/Mac)
├── gradlew.bat                             ⭐ Script de Gradle (Windows)
└── .github/workflows/
    └── build-android-apk.yml               ⭐ GitHub Actions
```

## 🚀 Opción 1: Generar APK con GitHub Actions (Más Fácil)

### Paso 1: Subir a GitHub

```bash
git add .
git commit -m "Proyecto Android nativo - Ayni MINEDU"
git push
```

### Paso 2: Ejecutar el Workflow

1. Ve a tu repositorio en GitHub
2. Pestaña "Actions"
3. Selecciona "Build Android APK"
4. Clic en "Run workflow"
5. Espera 5-10 minutos

### Paso 3: Descargar el APK

1. En la misma página de Actions
2. Encuentra el workflow completado (✅)
3. Scroll abajo hasta "Artifacts"
4. Descarga "ayni-minedu-apk"
5. Descomprime el ZIP
6. ¡Instala el APK en tu Android!

## 🛠️ Opción 2: Compilar Localmente con Android Studio

### Prerequisitos

1. **Descargar Android Studio**:
   - https://developer.android.com/studio
   - Instalar Android Studio
   - Instalar SDK de Android (API 34)

### Pasos

1. **Abrir el proyecto**:
   - Android Studio → Open → Selecciona la carpeta del proyecto

2. **Esperar sincronización**:
   - Android Studio descargará Gradle y dependencias
   - Puede tardar 5-10 minutos la primera vez

3. **Generar APK**:
   - Menu: Build → Build Bundle(s) / APK(s) → Build APK(s)
   - O usa: `./gradlew assembleRelease`

4. **Ubicación del APK**:
   - `app/build/outputs/apk/release/app-release-unsigned.apk`

5. **Instalar**:
   - Transfiere el APK a tu teléfono
   - Instálalo

## 💻 Opción 3: Compilar desde Línea de Comandos

### En Windows:

```bash
# Generar APK
gradlew.bat assembleRelease

# APK estará en:
# app\build\outputs\apk\release\app-release-unsigned.apk
```

### En Linux/Mac:

```bash
# Dar permisos
chmod +x gradlew

# Generar APK
./gradlew assembleRelease

# APK estará en:
# app/build/outputs/apk/release/app-release-unsigned.apk
```

## 🎨 Personalización

### Cambiar la URL

Edita `app/src/main/java/com/ayni/minedu/MainActivity.java`:

```java
private static final String AYNI_URL = "https://tu-sitio.com";
```

### Cambiar el nombre de la app

Edita `app/src/main/res/values/strings.xml`:

```xml
<string name="app_name">Tu Nombre</string>
```

### Cambiar el identificador

Edita `app/build.gradle`:

```gradle
defaultConfig {
    applicationId "com.tu.paquete"
    // ...
}
```

### Cambiar colores

Edita `app/src/main/res/values/themes.xml`:

```xml
<item name="android:statusBarColor">#TU_COLOR</item>
```

## 📱 Características Implementadas

- ✅ WebView completo con el portal de Ayni MINEDU
- ✅ JavaScript habilitado
- ✅ Cookies y sesión persistente
- ✅ DOM Storage habilitado
- ✅ Navegación dentro de la app (no abre Chrome)
- ✅ Solo HTTPS (seguro)
- ✅ Botón Atrás funcional
- ✅ Barra de progreso de carga
- ✅ Manejo de errores de conexión
- ✅ Sin validación SSL insegura

## 🔒 Seguridad

- Solo conexiones HTTPS
- No acepta certificados SSL inválidos
- No almacena credenciales
- No intercepta datos
- Solo actúa como navegador WebView

## ⚙️ Requisitos del Sistema

### Para compilar:
- **JDK**: 17 (se descarga automáticamente en GitHub Actions)
- **Android SDK**: API 21-34
- **Gradle**: 8.1.0 (incluido en el proyecto)

### Para instalar la APK:
- **Android**: 5.0 (Lollipop) o superior
- **Espacio**: ~20 MB

## 🆘 Solución de Problemas

### "SDK not found"

Si compiles localmente:
1. Abre Android Studio
2. Tools → SDK Manager
3. Instala Android SDK (API 34)

### "Permission denied: ./gradlew"

```bash
chmod +x gradlew
```

### El APK no se instala

- Habilita "Orígenes desconocidos"
- Verifica que el APK esté completo

### Build falla en GitHub Actions

- Verifica que el código esté completo
- Revisa los logs en la pestaña Actions

## 📊 Comparación con Expo

| Característica | Expo | Android Nativo |
|----------------|------|----------------|
| Configuración | Compleja | Simple |
| Dependencias | Node.js, npm | Solo JDK |
| Tokens/Cuentas | Necesita Expo | No necesita |
| Tiempo de build | 15 min | 5 min |
| Tamaño APK | 50-70 MB | 3-5 MB |
| Control | Limitado | Total |

## ✅ Ventajas de Este Proyecto

1. **No necesitas**:
   - ❌ Node.js
   - ❌ npm
   - ❌ Expo
   - ❌ EXPO_TOKEN
   - ❌ Cuentas externas

2. **Solo necesitas**:
   - ✅ GitHub (para Actions)
   - ✅ O Android Studio (para compilar local)

3. **Resultado**:
   - ✅ APK funcional
   - ✅ Más pequeño
   - ✅ Más rápido

## 🎉 ¡Listo!

Este proyecto está **100% listo para compilar**. Solo:

1. Sube a GitHub
2. Ejecuta Actions
3. Descarga el APK
4. ¡Instala!

---

**¿Prefieres este método más simple? Es mucho más directo y sin complicaciones de Node.js/Expo.**
