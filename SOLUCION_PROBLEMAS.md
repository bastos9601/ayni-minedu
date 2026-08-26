# 🆘 Solución de Problemas - Ayni MINEDU

Guía completa para resolver problemas comunes.

## 📦 Problemas de Instalación

### Error: "node: command not found"

**Causa**: Node.js no está instalado.

**Solución**:
1. Ve a https://nodejs.org/
2. Descarga la versión LTS
3. Instala Node.js
4. Reinicia la terminal
5. Verifica: `node --version`

### Error: "npm: command not found"

**Causa**: npm no está en el PATH.

**Solución**:
- npm se instala con Node.js
- Reinstala Node.js
- En Windows: Reinicia la computadora
- Verifica: `npm --version`

### Error: "expo: command not found"

**Causa**: Expo CLI no está instalado globalmente.

**Solución**:
```bash
npm install -g expo-cli
```

O usa npx:
```bash
npx expo start
```

### Error: "eas: command not found"

**Causa**: EAS CLI no está instalado.

**Solución**:
```bash
npm install -g eas-cli
```

Verifica:
```bash
eas --version
```

### Error al instalar dependencias

**Causa**: Caché corrupto o conflictos.

**Solución**:
```bash
# Limpiar todo
rm -rf node_modules package-lock.json
npm cache clean --force

# Reinstalar
npm install
```

## 🔐 Problemas de Autenticación

### "Authentication failed" en eas login

**Causa**: Credenciales incorrectas o cuenta no verificada.

**Solución**:
1. Verifica tu email y contraseña
2. Verifica tu cuenta de Expo por email
3. Intenta restablecer la contraseña
4. Intenta: `eas logout` y luego `eas login`

### "Invalid token"

**Causa**: Token expirado o incorrecto.

**Solución**:
1. Ve a https://expo.dev/accounts/[usuario]/settings/access-tokens
2. Revoca el token antiguo
3. Crea uno nuevo
4. Actualiza el secret EXPO_TOKEN en GitHub

### "Not logged in"

**Causa**: Sesión expirada.

**Solución**:
```bash
eas whoami  # Ver si estás logueado
eas login   # Iniciar sesión nuevamente
```

## 🏗️ Problemas al Generar el Build

### "Project not configured"

**Causa**: EAS no está configurado.

**Solución**:
```bash
eas build:configure
```

### "No project found"

**Causa**: No estás en el directorio correcto.

**Solución**:
```bash
cd [ruta-al-proyecto]
ls  # Verificar que existan app.json y package.json
```

### Build falla con "Invalid app.json"

**Causa**: Configuración incorrecta en app.json.

**Solución**:
1. Verifica que app.json sea JSON válido
2. Verifica que tengas:
   - "expo.name"
   - "expo.slug"
   - "expo.version"
   - "expo.android.package"
3. Usa un validador JSON online

### Build falla con "Missing icon"

**Causa**: No existen los archivos de assets.

**Solución**:
1. Verifica que exista `assets/icon.png`
2. Verifica que exista `assets/splash.png`
3. Verifica que sean archivos PNG válidos
4. Verifica los tamaños correctos

### "Build failed" sin mensaje claro

**Causa**: Múltiples causas posibles.

**Solución**:
1. Ve a https://expo.dev
2. Encuentra tu build
3. Revisa los logs completos
4. Busca el error específico
5. Googlea el mensaje de error

### Build se queda en "in queue" por mucho tiempo

**Causa**: Muchos builds en la cola.

**Solución**:
- Espera pacientemente (puede tomar 30+ minutos en horas pico)
- Los usuarios gratuitos tienen prioridad más baja
- Considera actualizar a plan de pago para prioridad

## 🐙 Problemas con GitHub

### "Permission denied" al hacer push

**Causa**: Credenciales incorrectas o sin permisos.

**Solución**:
```bash
# Verificar remote
git remote -v

# Si está mal, corregir:
git remote set-url origin [URL_CORRECTA]

# Autenticarse nuevamente
git push
```

### GitHub Actions no se ejecuta

**Causa**: Workflow deshabilitado o sin permisos.

**Solución**:
1. Ve a Settings → Actions → General
2. Verifica que Actions esté habilitado
3. Verifica permisos de workflow

### "Invalid EXPO_TOKEN"

**Causa**: Secret no configurado o incorrecto.

**Solución**:
1. Ve a Settings → Secrets and variables → Actions
2. Verifica que exista `EXPO_TOKEN`
3. El nombre debe ser exactamente `EXPO_TOKEN`
4. Borra y vuelve a crear el secret
5. Usa un token nuevo de Expo

### Workflow falla en "Setup Expo"

**Causa**: Token inválido o conexión.

**Solución**:
1. Regenera el EXPO_TOKEN
2. Actualiza el secret en GitHub
3. Vuelve a ejecutar el workflow

## 📱 Problemas de Instalación del APK

### "App not installed"

**Causa**: Múltiples razones.

**Solución**:
1. Habilita "Orígenes desconocidos"
2. Desinstala versiones anteriores
3. Verifica que el APK esté completo
4. Verifica espacio de almacenamiento
5. Reinicia el teléfono

### "Blocked by Play Protect"

**Causa**: Google Play Protect bloquea apps no firmadas.

**Solución**:
1. Cuando aparezca el mensaje
2. Toca "Más información"
3. Toca "Instalar de todas formas"
4. O desactiva Play Protect temporalmente

### APK no se descarga

**Causa**: Problemas de red o Expo.

**Solución**:
1. Intenta desde otro navegador
2. Intenta desde otro dispositivo
3. Verifica tu conexión a Internet
4. Espera unos minutos y reintenta

### "Parse error" al instalar

**Causa**: APK corrupto o incompatible.

**Solución**:
1. Descarga el APK nuevamente
2. Verifica que la descarga esté completa
3. Verifica la versión de Android (debe ser 5.0+)

## 🌐 Problemas del WebView

### La app abre pero no carga el sitio

**Causa**: Problemas de red o configuración.

**Solución**:
1. Verifica conexión a Internet
2. Prueba abrir el sitio en un navegador
3. Verifica que la URL en App.js sea correcta
4. Revisa los logs de la app

### Los enlaces abren Chrome

**Causa**: Configuración de WebView.

**Solución**:
- Esto es el comportamiento esperado para ciertos enlaces
- Revisa `onShouldStartLoadWithRequest` en App.js
- Algunos enlaces externos necesitan abrirse fuera

### El botón Atrás no funciona

**Causa**: No hay historial de navegación.

**Solución**:
- Es normal si estás en la página inicial
- Si navegaste y no funciona, puede ser un bug
- Revisa la implementación de BackHandler en App.js

### "Error de conexión" constante

**Causa**: El sitio puede estar caído o bloqueado.

**Solución**:
1. Verifica que el sitio esté disponible en navegador
2. Intenta desde otra red WiFi
3. Intenta con datos móviles
4. Contacta al administrador del sitio

### El formulario de login no funciona

**Causa**: Problemas con JavaScript o cookies.

**Solución**:
1. Verifica que `javaScriptEnabled={true}` en WebView
2. Verifica que `domStorageEnabled={true}`
3. Verifica que `thirdPartyCookiesEnabled={true}`
4. Limpia los datos de la app y vuelve a intentar

## 🎨 Problemas de Diseño

### El icono no se ve

**Causa**: Icono no generado correctamente.

**Solución**:
1. Verifica que `assets/icon.png` exista
2. Verifica tamaño: 1024x1024
3. Genera un nuevo build
4. Puede tardar en aparecer en el teléfono

### El splash screen no se ve

**Causa**: Splash no configurado correctamente.

**Solución**:
1. Verifica que `assets/splash.png` exista
2. Verifica tamaño: 1284x2778
3. Verifica configuración en app.json
4. Genera un nuevo build

### La app se ve cortada en los bordes

**Causa**: Problema con SafeAreaView.

**Solución**:
- Revisa el estilo de SafeAreaView en App.js
- Ajusta el paddingTop según tu dispositivo

## 🔄 Problemas de Actualización

### "Cached version" después de cambios

**Causa**: Caché no limpiado.

**Solución**:
```bash
expo start --clear
```

### Los cambios no aparecen en el build

**Causa**: Build antiguo o caché.

**Solución**:
1. Incrementa la versión en app.json
2. Incrementa versionCode en app.json (Android)
3. Genera un nuevo build
4. Desinstala la app antigua del teléfono
5. Instala la nueva versión

## 💾 Problemas de Almacenamiento

### "Out of space" durante el build

**Causa**: Poco espacio en el servidor de Expo.

**Solución**:
- Esto es raro, contacta a soporte de Expo
- Limpia builds antiguos en expo.dev

### "Out of space" en el teléfono

**Causa**: Poco espacio de almacenamiento.

**Solución**:
1. Libera espacio en el teléfono
2. Borra apps no usadas
3. Borra caché de apps
4. Intenta instalar nuevamente

## 🔍 Debugging Avanzado

### Ver logs de la aplicación

**En desarrollo**:
```bash
expo start
# Los logs aparecen en la terminal
```

**En APK instalado**:
```bash
# Conecta el teléfono y ejecuta:
adb logcat | grep -i expo
```

### Ver información de build

```bash
eas build:list
eas build:view [BUILD_ID]
```

### Limpiar completamente el proyecto

```bash
# Borrar todo
rm -rf node_modules .expo package-lock.json

# Reinstalar
npm install
npx expo install react-native-webview

# Nuevo build
eas build --platform android --profile preview --clear-cache
```

## 📞 Dónde Obtener Ayuda

1. **Documentación Oficial**:
   - https://docs.expo.dev/
   - https://docs.expo.dev/build/introduction/

2. **Forums**:
   - https://forums.expo.dev/

3. **Discord de Expo**:
   - https://chat.expo.dev/

4. **Stack Overflow**:
   - Tag: `expo`, `eas-build`, `react-native-webview`

5. **GitHub Issues**:
   - Crea un issue en este repositorio

## 📝 Reportar un Bug

Si encuentras un bug, incluye:
- Descripción del problema
- Pasos para reproducirlo
- Mensajes de error completos
- Versión de Node.js: `node --version`
- Versión de EAS: `eas --version`
- Sistema operativo
- Capturas de pantalla

## ✅ Checklist de Diagnóstico

Antes de pedir ayuda, verifica:
- [ ] Node.js instalado
- [ ] Dependencias instaladas
- [ ] Logueado en Expo
- [ ] EXPO_TOKEN configurado
- [ ] app.json válido
- [ ] Assets existen
- [ ] Internet funcional
- [ ] Build completado exitosamente
- [ ] APK descargado completo

---

**¿Encontraste la solución a tu problema? ¡Genial! 🎉**

**¿Aún tienes problemas? Revisa la documentación oficial o pide ayuda en los foros de Expo.**
