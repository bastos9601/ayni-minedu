# 🚀 Guía Completa: GitHub Actions para Ayni MINEDU

Paso a paso para generar tu APK usando GitHub Actions.

## 📋 Prerequisitos

Antes de empezar, necesitas:
- [ ] Cuenta de GitHub (gratis en https://github.com)
- [ ] Cuenta de Expo (gratis en https://expo.dev)
- [ ] Node.js instalado localmente
- [ ] Git instalado

## 🎨 Paso 1: Crear los Iconos (5 minutos)

### Opción A: Usar el script de Python

Si tienes Python instalado:

```bash
# Instalar Pillow
pip install pillow

# Ejecutar el script
python crear-iconos-temp.py
```

### Opción B: Descargar iconos temporales

Usa estos enlaces y guárdalos en la carpeta `assets/`:

1. **icon.png**: https://via.placeholder.com/1024x1024/0066cc/ffffff?text=AYNI
   - Clic derecho → Guardar como → `assets/icon.png`

2. **splash.png**: https://via.placeholder.com/1284x2778/ffffff/0066cc?text=Ayni+MINEDU
   - Clic derecho → Guardar como → `assets/splash.png`

### Opción C: Crear manualmente

Usa cualquier editor de imágenes y crea:
- `assets/icon.png` (1024x1024)
- `assets/splash.png` (1284x2778)

**Verifica que los archivos existan**:
```bash
dir assets
# Debe mostrar: icon.png y splash.png
```

## 📦 Paso 2: Instalar Dependencias Localmente (3 minutos)

```bash
# Instalar dependencias del proyecto
npm install

# Instalar react-native-webview
npx expo install react-native-webview

# Instalar EAS CLI globalmente
npm install -g eas-cli
```

**Verifica la instalación**:
```bash
node --version    # Debe mostrar v16 o superior
npm --version     # Debe mostrar una versión
eas --version     # Debe mostrar una versión
```

## 🔐 Paso 3: Crear y Configurar Cuenta Expo (5 minutos)

### 3.1 Crear cuenta

1. Ve a https://expo.dev
2. Clic en "Sign Up"
3. Registra con tu email
4. Verifica tu email

### 3.2 Iniciar sesión localmente

```bash
eas login
```

Ingresa:
- Email de Expo
- Contraseña de Expo

**Verifica**:
```bash
eas whoami
# Debe mostrar tu nombre de usuario
```

### 3.3 Configurar el proyecto

```bash
eas build:configure
```

Este comando:
- Vincula tu proyecto con Expo
- Puede pedirte crear un proyecto nuevo (di que sí)
- Generará/verificará `eas.json`

## 🔑 Paso 4: Obtener el EXPO_TOKEN (3 minutos)

### 4.1 Generar token

1. Ve a: https://expo.dev/accounts/[tu-usuario]/settings/access-tokens
   - O desde expo.dev → Tu perfil → Settings → Access Tokens

2. Clic en "Create Token" o "New Token"

3. Dale un nombre: `GitHub Actions - Ayni MINEDU`

4. Selecciona permisos (deja los predeterminados o selecciona todos)

5. Clic en "Create"

6. **¡IMPORTANTE!** Copia el token inmediatamente
   - Solo se mostrará una vez
   - Guárdalo en un archivo temporal (NotePad)

Ejemplo de token:
```
expo_xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx
```

## 🐙 Paso 5: Crear Repositorio en GitHub (5 minutos)

### 5.1 Crear el repositorio

1. Ve a https://github.com
2. Clic en el botón "+" (esquina superior derecha)
3. Selecciona "New repository"

Configuración:
- **Repository name**: `ayni-minedu-app` (o el nombre que prefieras)
- **Description**: "Aplicación Android para Ayni MINEDU"
- **Visibilidad**: 
  - ✅ Público: Cualquiera puede ver (recomendado para proyectos open source)
  - ✅ Privado: Solo tú puedes ver (recomendado para proyectos personales)
- **NO marques** "Initialize with README" (ya tienes archivos)
- Clic en "Create repository"

### 5.2 Guardar la URL

Copia la URL del repositorio, se verá así:
```
https://github.com/TU_USUARIO/ayni-minedu-app.git
```

## 🔒 Paso 6: Configurar EXPO_TOKEN en GitHub (2 minutos)

1. En tu repositorio recién creado, clic en "Settings"

2. En el menú lateral izquierdo:
   - Clic en "Secrets and variables"
   - Clic en "Actions"

3. Clic en el botón verde "New repository secret"

4. Llena el formulario:
   - **Name**: `EXPO_TOKEN` (exactamente así, en mayúsculas)
   - **Secret**: Pega el token que copiaste antes

5. Clic en "Add secret"

6. **Verifica**: Debes ver "EXPO_TOKEN" en la lista de secrets

## 📤 Paso 7: Subir el Código a GitHub (5 minutos)

Abre la terminal en la carpeta del proyecto y ejecuta:

```bash
# Inicializar Git (si no lo has hecho)
git init

# Ver qué archivos se subirán
git status

# Agregar todos los archivos
git add .

# Verificar que se agregaron correctamente
git status

# Crear el primer commit
git commit -m "Proyecto inicial Ayni MINEDU"

# Renombrar la rama a 'main'
git branch -M main

# Conectar con el repositorio remoto
git remote add origin https://github.com/TU_USUARIO/ayni-minedu-app.git

# Subir el código
git push -u origin main
```

**Si te pide autenticación**:
- Usuario: Tu nombre de usuario de GitHub
- Contraseña: Tu token personal de GitHub (no tu contraseña)
  - Crea uno en: https://github.com/settings/tokens

**Verifica**:
- Refresca la página de tu repositorio en GitHub
- Debes ver todos los archivos del proyecto

## 🏗️ Paso 8: Ejecutar GitHub Actions (2 minutos)

### 8.1 Verificar que el workflow existe

1. En tu repositorio, clic en la pestaña "Actions"
2. Debes ver el workflow "Build Android APK"

### 8.2 Ejecutar manualmente el workflow

1. En la pestaña "Actions"
2. Clic en "Build Android APK" (lateral izquierdo)
3. Clic en "Run workflow" (botón azul, lado derecho)
4. Selecciona la rama "main"
5. Clic en "Run workflow" (el botón verde)

### 8.3 Monitorear el progreso

1. Verás aparecer un nuevo workflow en ejecución (círculo amarillo)
2. Clic en él para ver los detalles
3. Clic en "build" para ver los logs en tiempo real

**Estados**:
- 🟡 Amarillo (en progreso): El workflow está ejecutándose
- 🟢 Verde (success): Completado exitosamente
- 🔴 Rojo (failed): Hubo un error

El workflow toma aproximadamente 2-3 minutos en ejecutarse.

## ⏰ Paso 9: Esperar el Build (15 minutos)

### 9.1 Entender el proceso

El workflow de GitHub Actions:
1. ✅ Prepara el entorno (1-2 min)
2. ✅ Instala dependencias (1 min)
3. ✅ Inicia el build en Expo (30 seg)
4. ⏳ Expo compila tu app en la nube (10-15 min)

### 9.2 Verificar el build en Expo

1. Ve a https://expo.dev
2. Inicia sesión
3. Clic en tu proyecto "ayni-minedu" (o el nombre que le diste)
4. Clic en "Builds" en el menú lateral

Verás el build con estados:
- **In Queue**: En cola, esperando (0-5 min)
- **Building**: Compilando (10-15 min)
- **Finished**: ✅ Completado (listo para descargar)
- **Failed**: ❌ Error (revisar logs)

### 9.3 Notificaciones

Expo puede enviarte un email cuando el build esté listo.

## 📥 Paso 10: Descargar el APK (2 minutos)

### 10.1 Localizar el build

1. En https://expo.dev
2. Tu proyecto → Builds
3. Busca el build más reciente con estado "Finished"

### 10.2 Descargar

1. Clic en el build
2. Verás los detalles del build
3. Clic en el botón "Download" o "Install"
4. El APK se descargará a tu computadora

**Tamaño**: ~50-70 MB

**Alternativa**: Escanea el QR code con tu teléfono Android para descargar directamente.

## 📱 Paso 11: Instalar en Android (5 minutos)

### 11.1 Transferir el APK al teléfono

**Opción A**: Descarga directa en el teléfono
- Abre expo.dev en el navegador del teléfono
- Descarga el APK directamente

**Opción B**: Desde la computadora
- Conecta el teléfono por USB
- Copia el APK a la carpeta de Descargas del teléfono
- O envíalo por WhatsApp/Telegram/Email a ti mismo

### 11.2 Habilitar instalación de orígenes desconocidos

**Android 8.0+**:
1. Cuando intentes instalar, aparecerá un mensaje
2. Toca "Configuración"
3. Habilita "Permitir de esta fuente"

**Android anterior**:
1. Configuración → Seguridad
2. Activa "Orígenes desconocidos"

### 11.3 Instalar

1. Abre el archivo APK (desde Descargas o tu gestor de archivos)
2. Toca "Instalar"
3. Espera unos segundos
4. Toca "Abrir"

### 11.4 Play Protect

Si Google Play Protect muestra una advertencia:
1. Toca "Más información"
2. Toca "Instalar de todas formas"

Esto es normal para APKs que no están en Google Play Store.

## ✅ Paso 12: Verificar que Funciona

### 12.1 Abrir la aplicación

1. Busca "Ayni MINEDU" en tus apps
2. Toca para abrir

### 12.2 Probar funcionalidades

- [ ] La app abre sin errores
- [ ] Aparece pantalla de carga
- [ ] Se carga el sitio de Ayni MINEDU
- [ ] Puedes navegar por el sitio
- [ ] Los enlaces funcionan
- [ ] Puedes iniciar sesión (si tienes cuenta)
- [ ] El botón Atrás funciona
- [ ] No se abre Chrome

## 🎉 ¡Listo!

Tu aplicación Ayni MINEDU está instalada y funcionando.

## 🔄 Hacer Cambios Futuros

Si quieres actualizar la aplicación:

```bash
# 1. Hacer cambios en el código (por ejemplo, en App.js)

# 2. Actualizar la versión en app.json
# Cambiar "version": "1.0.0" a "version": "1.0.1"

# 3. Subir cambios
git add .
git commit -m "Actualización de la app"
git push

# 4. GitHub Actions se ejecutará automáticamente
# O puedes ejecutarlo manualmente desde la pestaña Actions

# 5. Descargar el nuevo APK desde Expo

# 6. Instalar en el teléfono (reemplazará la versión anterior)
```

## 🆘 Problemas Comunes

### El workflow falla en GitHub Actions

**Revisa**:
- ¿El secret EXPO_TOKEN está bien configurado?
- ¿Los iconos existen en assets/?
- Revisa los logs en la pestaña Actions

### El build falla en Expo

**Revisa**:
- Los logs en expo.dev
- Que app.json sea JSON válido
- Que los iconos tengan los tamaños correctos

### El APK no se instala

**Revisa**:
- Que "Orígenes desconocidos" esté habilitado
- Que el APK se descargó completo
- Espacio suficiente en el teléfono

Para más ayuda, revisa: `SOLUCION_PROBLEMAS.md`

## 📊 Resumen de Tiempos

| Paso | Tiempo |
|------|--------|
| 1. Crear iconos | 5 min |
| 2. Instalar dependencias | 3 min |
| 3. Cuenta Expo | 5 min |
| 4. Obtener token | 3 min |
| 5. Crear repo GitHub | 5 min |
| 6. Configurar secret | 2 min |
| 7. Subir código | 5 min |
| 8. Ejecutar workflow | 2 min |
| 9. Esperar build | 15 min |
| 10. Descargar APK | 2 min |
| 11. Instalar en teléfono | 5 min |
| **TOTAL** | **~50 min** |

## 🔗 Enlaces Útiles

- **Tu repositorio**: https://github.com/TU_USUARIO/ayni-minedu-app
- **Expo dashboard**: https://expo.dev
- **GitHub Actions**: https://github.com/TU_USUARIO/ayni-minedu-app/actions
- **Tus builds**: https://expo.dev/accounts/[usuario]/projects/ayni-minedu/builds

---

**¡Éxito con tu aplicación! 🚀**
