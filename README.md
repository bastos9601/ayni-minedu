# Ayni MINEDU - Aplicación Android

Aplicación móvil Android que integra el portal web de Ayni MINEDU en un WebView nativo.

## 📋 Descripción

Esta aplicación convierte el sitio web de Ayni MINEDU (https://servicios-ayni.minedu.gob.pe/ayni/inicio) en una aplicación Android instalable mediante un APK. Utiliza React Native con Expo y react-native-webview para proporcionar una experiencia de navegación fluida y segura.

## ⚡ Características

- ✅ Carga automática del portal Ayni MINEDU
- ✅ Navegación completa dentro de la aplicación
- ✅ Soporte para JavaScript, cookies y sesiones
- ✅ Formularios y autenticación funcionales
- ✅ Redirecciones HTTPS permitidas
- ✅ Botón Atrás de Android funcional
- ✅ Pantalla de carga y manejo de errores
- ✅ Conexión segura (solo HTTPS)
- ✅ No requiere navegadores externos

## 🛠️ Tecnologías

- React Native
- Expo (~50.0.0)
- react-native-webview (13.6.4)
- EAS Build
- GitHub Actions

## 📦 Instalación del Proyecto

### 1. Clonar el repositorio

```bash
git clone <URL_DE_TU_REPOSITORIO>
cd ayni-minedu
```

### 2. Instalar dependencias

```bash
npm install
```

### 3. Instalar react-native-webview

```bash
npx expo install react-native-webview
```

## 🚀 Configuración para Generar el APK

### Paso 1: Crear una cuenta en Expo

1. Ve a https://expo.dev
2. Haz clic en "Sign Up" (Registrarse)
3. Crea una cuenta gratuita con tu email
4. Verifica tu correo electrónico

### Paso 2: Instalar EAS CLI

```bash
npm install -g eas-cli
```

### Paso 3: Iniciar sesión en EAS

```bash
eas login
```

Ingresa tu email y contraseña de Expo.

### Paso 4: Configurar el proyecto en EAS

```bash
eas build:configure
```

Este comando creará automáticamente el archivo `eas.json` si no existe.

### Paso 5: Obtener el EXPO_TOKEN

Para GitHub Actions necesitas un token de acceso:

```bash
eas whoami
```

Luego genera un token:

1. Ve a https://expo.dev/accounts/[tu-usuario]/settings/access-tokens
2. Haz clic en "Create Token"
3. Dale un nombre descriptivo (ejemplo: "GitHub Actions")
4. Copia el token generado (guárdalo en un lugar seguro)

### Paso 6: Agregar EXPO_TOKEN a GitHub

1. Ve a tu repositorio en GitHub
2. Haz clic en "Settings" (Configuración)
3. En el menú lateral, selecciona "Secrets and variables" → "Actions"
4. Haz clic en "New repository secret"
5. Nombre: `EXPO_TOKEN`
6. Valor: Pega el token que copiaste
7. Haz clic en "Add secret"

## 🏗️ Generar el APK

### Opción 1: Localmente

Para generar el APK desde tu computadora:

```bash
eas build --platform android --profile preview
```

Este comando:
- Subirá tu código a los servidores de Expo
- Compilará la aplicación en la nube
- Te proporcionará un enlace para descargar el APK

El proceso toma aproximadamente 10-15 minutos.

### Opción 2: Con GitHub Actions (Recomendado)

#### Crear el repositorio en GitHub

1. Ve a https://github.com
2. Haz clic en "New repository"
3. Nombre: `ayni-minedu`
4. Descripción: "Aplicación Android para Ayni MINEDU"
5. Marca como privado o público según prefieras
6. Haz clic en "Create repository"

#### Subir los archivos

```bash
git init
git add .
git commit -m "Proyecto inicial Ayni MINEDU"
git branch -M main
git remote add origin <URL_DE_TU_REPOSITORIO>
git push -u origin main
```

#### Ejecutar GitHub Actions manualmente

1. Ve a tu repositorio en GitHub
2. Haz clic en la pestaña "Actions"
3. Selecciona el workflow "Build Android APK"
4. Haz clic en "Run workflow"
5. Selecciona la rama "main"
6. Haz clic en "Run workflow"

El workflow se ejecutará automáticamente y:
- Instalará las dependencias
- Configurará Expo y EAS
- Iniciará el build del APK

#### Ejecución automática

El workflow también se ejecuta automáticamente cada vez que hagas push a la rama `main`:

```bash
git add .
git commit -m "Cambios realizados"
git push
```

## 📱 Descargar e Instalar el APK

### Encontrar el APK

1. Ve a https://expo.dev
2. Inicia sesión con tu cuenta
3. Haz clic en tu perfil (esquina superior derecha)
4. Selecciona tu proyecto "ayni-minedu"
5. Ve a la sección "Builds"
6. Encuentra el build más reciente
7. Espera a que el estado cambie a "Finished" (puede tomar 10-15 minutos)
8. Haz clic en el botón "Download" para descargar el APK

### Instalar en Android

#### Desde el teléfono:

1. Descarga el APK desde el enlace de Expo en tu teléfono
2. Ve a "Configuración" → "Seguridad"
3. Habilita "Orígenes desconocidos" o "Instalar aplicaciones desconocidas"
4. Abre el archivo APK descargado
5. Toca "Instalar"
6. Espera a que termine la instalación
7. Toca "Abrir" para iniciar la aplicación

#### Desde la computadora:

1. Descarga el APK desde Expo en tu computadora
2. Conecta tu teléfono Android mediante USB
3. Habilita "Depuración USB" en tu teléfono:
   - Ve a "Configuración" → "Acerca del teléfono"
   - Toca 7 veces en "Número de compilación"
   - Regresa a Configuración → "Opciones de desarrollador"
   - Activa "Depuración USB"
4. Copia el APK a tu teléfono
5. En el teléfono, abre el explorador de archivos
6. Busca el archivo APK
7. Toca para instalar

## 🔒 Seguridad

Esta aplicación implementa las siguientes medidas de seguridad:

- ✅ Solo conexiones HTTPS
- ✅ No desactiva validación SSL
- ✅ No acepta certificados inválidos
- ✅ No intercepta contraseñas
- ✅ No almacena credenciales
- ✅ No modifica contenido del portal
- ✅ Actúa solo como cliente WebView

## 📝 Estructura del Proyecto

```
ayni-minedu/
├── .github/
│   └── workflows/
│       └── build-apk.yml       # Configuración de GitHub Actions
├── assets/
│   ├── icon.png                # Icono de la aplicación (1024x1024)
│   └── splash.png              # Pantalla de bienvenida (1284x2778)
├── App.js                      # Componente principal con WebView
├── app.json                    # Configuración de Expo
├── eas.json                    # Configuración de EAS Build
├── package.json                # Dependencias del proyecto
├── .gitignore                  # Archivos ignorados por Git
└── README.md                   # Este archivo
```

## 🎨 Personalizar Iconos

### Icono de la aplicación (icon.png)

- Tamaño: 1024x1024 píxeles
- Formato: PNG con transparencia
- Ubicación: `assets/icon.png`

### Splash screen (splash.png)

- Tamaño: 1284x2778 píxeles (iPhone 14 Pro Max)
- Formato: PNG
- Ubicación: `assets/splash.png`

Puedes crear estos iconos usando herramientas como:
- Figma
- Adobe Illustrator
- Canva
- GIMP (gratuito)

## 🐛 Solución de Problemas

### El build falla en GitHub Actions

- Verifica que el `EXPO_TOKEN` esté configurado correctamente en GitHub Secrets
- Asegúrate de que tu cuenta Expo esté activa
- Revisa los logs del workflow en la pestaña "Actions"

### El APK no se instala

- Verifica que "Orígenes desconocidos" esté habilitado
- Asegúrate de descargar el APK completo (no cancelar la descarga)
- Intenta desinstalar versiones anteriores antes de instalar

### La aplicación no carga el sitio

- Verifica tu conexión a Internet
- Asegúrate de que el sitio de Ayni MINEDU esté disponible
- Prueba abrir la URL en un navegador web

### El botón Atrás no funciona

- Esto es el comportamiento esperado cuando no hay historial
- Si hay páginas anteriores, el botón debería funcionar correctamente

## 📄 Licencia

Este proyecto es una aplicación cliente que accede al portal oficial de Ayni MINEDU. No modifica ni almacena contenido del portal. Todos los derechos del portal y su contenido pertenecen al Ministerio de Educación del Perú (MINEDU).

## 🤝 Contribuciones

Si encuentras algún problema o tienes sugerencias:

1. Crea un "Issue" en GitHub
2. Describe el problema o sugerencia
3. Si es posible, proporciona capturas de pantalla

## 📞 Soporte

Para problemas relacionados con:
- **La aplicación**: Crea un issue en este repositorio
- **El portal Ayni MINEDU**: Contacta directamente con MINEDU
- **Expo/EAS Build**: Consulta la documentación de Expo

## 🔗 Enlaces Útiles

- [Documentación de Expo](https://docs.expo.dev/)
- [Documentación de EAS Build](https://docs.expo.dev/build/introduction/)
- [react-native-webview](https://github.com/react-native-webview/react-native-webview)
- [Portal Ayni MINEDU](https://servicios-ayni.minedu.gob.pe/ayni/inicio)

---

**Nota**: Esta aplicación es un proyecto independiente y no está oficialmente afiliada con el Ministerio de Educación del Perú (MINEDU).
