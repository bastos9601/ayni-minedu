# 📁 Estructura del Proyecto - Ayni MINEDU

Explicación detallada de cada archivo y carpeta del proyecto.

## 🌳 Árbol de Archivos

```
ayni-minedu/
├── .expo/                      # Caché de Expo (generado automáticamente)
│   └── README.md              # Información sobre esta carpeta
│
├── .github/                    # Configuración de GitHub
│   └── workflows/             
│       └── build-apk.yml      # ⭐ Workflow para generar APK automáticamente
│
├── assets/                     # Recursos gráficos
│   ├── icon.png               # ⭐ Icono de la app (1024x1024)
│   ├── splash.png             # ⭐ Pantalla de carga (1284x2778)
│   └── README.md              # Guía para crear los iconos
│
├── node_modules/               # Dependencias instaladas (no subir a Git)
│
├── .gitignore                  # Archivos ignorados por Git
├── App.js                      # ⭐ Código principal de la aplicación
├── app.json                    # ⭐ Configuración de Expo
├── CHECKLIST.md                # Lista de verificación paso a paso
├── COMANDOS.md                 # Comandos útiles del proyecto
├── eas.json                    # ⭐ Configuración de EAS Build
├── ESTRUCTURA.md               # 📄 Este archivo
├── INICIO_RAPIDO.md            # Guía rápida de inicio
├── package.json                # ⭐ Dependencias y scripts del proyecto
├── package-lock.json           # Versiones exactas de dependencias (generado)
├── README.md                   # 📖 Documentación principal
└── SOLUCION_PROBLEMAS.md       # Guía de solución de problemas
```

## 📄 Descripción de Archivos Clave

### ⭐ App.js

**Propósito**: Código principal de la aplicación React Native.

**Contiene**:
- Configuración del WebView
- URL del portal Ayni MINEDU
- Manejo del botón Atrás de Android
- Pantalla de carga
- Manejo de errores de conexión
- Control de navegación (qué enlaces abrir dentro/fuera)
- Configuración de seguridad (HTTPS, cookies, JavaScript)

**Modificaciones comunes**:
- Cambiar la URL principal
- Ajustar colores de la pantalla de carga
- Modificar el manejo de enlaces externos
- Personalizar mensajes de error

### ⭐ app.json

**Propósito**: Configuración del proyecto Expo.

**Contiene**:
- Nombre de la aplicación: "Ayni MINEDU"
- Identificador del paquete: "com.ayni.minedu"
- Versión de la app
- Orientación (vertical)
- Referencias a iconos y splash screen
- Configuración específica de Android
- Permisos de la aplicación

**Modificaciones comunes**:
- Incrementar la versión
- Cambiar nombre o slug
- Ajustar colores del splash screen
- Modificar permisos de Android

### ⭐ eas.json

**Propósito**: Configuración de EAS Build.

**Contiene**:
- Perfil "preview": Genera APK directamente
- Perfil "production": Para producción
- Configuración de distribución

**Importante**:
- El perfil "preview" genera APK (instalable directamente)
- El perfil "production" puede generar AAB (para Google Play Store)

### ⭐ package.json

**Propósito**: Define las dependencias del proyecto.

**Dependencias principales**:
- `expo`: Framework principal (~50.0.0)
- `react`: Librería de UI (18.2.0)
- `react-native`: Framework móvil (0.73.0)
- `react-native-webview`: Componente WebView (13.6.4)
- `expo-status-bar`: Barra de estado

**Scripts disponibles**:
- `npm start`: Inicia servidor de desarrollo
- `npm run android`: Abre en emulador Android

### ⭐ .github/workflows/build-apk.yml

**Propósito**: Automatización con GitHub Actions.

**Proceso**:
1. Se activa al hacer push a "main" o manualmente
2. Instala Node.js
3. Instala dependencias (npm ci)
4. Configura Expo y EAS
5. Autentica con EXPO_TOKEN
6. Inicia el build de Android
7. Muestra información para descargar el APK

**Ventajas**:
- No requiere configurar nada local
- Build en la nube
- Totalmente automatizado

## 📂 Descripción de Carpetas

### .expo/

**Generada automáticamente por Expo.**

Contiene:
- Caché de builds
- Configuración temporal
- Tokens de sesión

**No subir a Git** (incluida en .gitignore)

Puedes borrarla de forma segura:
```bash
rm -rf .expo
```

Expo la recreará automáticamente.

### .github/workflows/

**Configuración de GitHub Actions.**

Contiene:
- `build-apk.yml`: Workflow para generar APK automáticamente

**Cómo funciona**:
- GitHub detecta archivos en esta carpeta
- Los ejecuta cuando ocurren ciertos eventos (push, manual)
- Proporciona logs detallados de cada paso

### assets/

**Recursos gráficos de la aplicación.**

Archivos requeridos:
- `icon.png` (1024x1024): Icono de la app
- `splash.png` (1284x2778): Pantalla de carga

**Importante**:
- Sin estos archivos, el build fallará
- Deben ser PNG válidos
- Deben tener los tamaños exactos

### node_modules/

**Dependencias instaladas del proyecto.**

- Generada por `npm install`
- **No subir a Git** (puede pesar >200 MB)
- Se puede regenerar con `npm install`

## 📚 Archivos de Documentación

### README.md
- Documentación completa del proyecto
- Guía paso a paso
- Explicación de características
- Comandos e instrucciones

### INICIO_RAPIDO.md
- Guía resumida
- Para empezar rápidamente
- Pasos esenciales en ~30 minutos

### COMANDOS.md
- Lista de comandos útiles
- Organizados por categoría
- Copiar y pegar directamente

### SOLUCION_PROBLEMAS.md
- Problemas comunes
- Soluciones paso a paso
- Tips de debugging

### CHECKLIST.md
- Lista de verificación
- Para no olvidar ningún paso
- Marcar conforme avanzas

### ESTRUCTURA.md
- Este archivo
- Explica la organización del proyecto

## 🔧 Archivos de Configuración

### .gitignore
**Archivos ignorados por Git**:
- node_modules/
- .expo/
- *.log
- .env
- Archivos temporales

### package-lock.json
- Generado automáticamente por npm
- Fija las versiones exactas de las dependencias
- Asegura builds reproducibles
- **Sí subir a Git**

## 🎯 Archivos que NO debes modificar

A menos que sepas lo que haces:
- `package-lock.json` (generado automáticamente)
- `.expo/` (generado automáticamente)
- `node_modules/` (generado automáticamente)

## ✏️ Archivos que SÍ puedes modificar

Personalizaciones comunes:

**App.js**:
- URL del sitio
- Colores de carga
- Manejo de errores
- Estilos visuales

**app.json**:
- Nombre de la app
- Versión
- Colores del splash
- Orientación

**README.md**:
- Agregar información específica
- Personalizar instrucciones

**assets/**:
- Cambiar iconos
- Actualizar splash screen

## 🆕 Archivos que puedes agregar

Opcionales:
- `.env`: Variables de entorno
- `app.config.js`: Configuración dinámica (en lugar de app.json)
- `metro.config.js`: Configuración de Metro bundler
- `babel.config.js`: Configuración de Babel
- Carpetas adicionales: `src/`, `components/`, `screens/`

## 📏 Tamaño del Proyecto

Aproximado:
- Proyecto base (sin node_modules): ~50 KB
- Con assets (iconos): ~500 KB - 2 MB
- Con node_modules instalado: ~200-300 MB
- APK final generado: ~50-70 MB

## 🔄 Flujo de Trabajo

1. **Desarrollo**:
   - Modifica `App.js` o configuración
   - Prueba con `expo start`

2. **Commit**:
   - `git add .`
   - `git commit -m "Mensaje"`
   - `git push`

3. **Build**:
   - GitHub Actions detecta el push
   - Ejecuta el workflow automáticamente
   - O ejecuta manualmente desde Actions

4. **Descarga**:
   - Ve a expo.dev
   - Descarga el APK
   - Instala en Android

## 💡 Tips de Organización

### Para proyectos pequeños (actual):
✅ Todo en la raíz está bien
✅ App.js es suficiente

### Para proyectos más grandes:
```
src/
├── components/      # Componentes reutilizables
├── screens/         # Pantallas de la app
├── navigation/      # Configuración de navegación
├── utils/           # Funciones auxiliares
└── constants/       # Constantes (URLs, colores)
```

## 🎓 Recursos para Aprender Más

- **Expo Docs**: https://docs.expo.dev/
- **React Native Docs**: https://reactnative.dev/
- **WebView Docs**: https://github.com/react-native-webview/react-native-webview

---

**¿Dudas sobre algún archivo? Revisa el README.md o pregunta en los foros de Expo.**
