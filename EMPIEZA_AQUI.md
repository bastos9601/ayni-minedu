# 🚀 EMPIEZA AQUÍ - Ayni MINEDU App

## 👋 Bienvenido

Has creado exitosamente un proyecto completo de React Native + Expo para convertir el portal de Ayni MINEDU en una aplicación Android.

## ⚡ Inicio Rápido (3 pasos)

### 1️⃣ Crear los Iconos

**Tienes un archivo `icono.jpg` en tu carpeta. Necesitas convertirlo a PNG:**

**Opción A - Manual (Más Rápido)**:
1. Abre `icono.jpg` con Paint o cualquier editor
2. Redimensiona a 1024x1024
3. Guarda como `assets\icon.png`
4. Redimensiona a 1284x2778
5. Guarda como `assets\splash.png`

**Opción B - Descarga Temporales**:
1. Abre navegador: https://via.placeholder.com/1024x1024/0066cc/ffffff?text=AYNI
2. Guardar como `assets\icon.png`
3. Abre navegador: https://via.placeholder.com/1284x2778/ffffff/0066cc?text=Ayni+MINEDU
4. Guardar como `assets\splash.png`

**Opción C - Leer la guía**:
- Abre: `CREAR_ICONOS_MANUAL.md`

### 2️⃣ Instalar Dependencias

Abre PowerShell o CMD en esta carpeta y ejecuta:

```bash
npm install
npx expo install react-native-webview
npm install -g eas-cli
```

### 3️⃣ Seguir la Guía Completa

Abre el archivo: **`GUIA_GITHUB_ACTIONS.md`**

Este archivo contiene instrucciones paso a paso para:
- Configurar Expo
- Crear cuenta
- Configurar GitHub
- Generar el APK
- Instalarlo en Android

## 📚 Archivos Importantes

### 🎯 Para Empezar
- **GUIA_GITHUB_ACTIONS.md** ⭐ - Guía completa paso a paso
- **CREAR_ICONOS_MANUAL.md** - Cómo crear los iconos
- **RESUMEN_PROYECTO.md** - Qué incluye el proyecto

### 📖 Referencias
- **README.md** - Documentación completa
- **COMANDOS.md** - Lista de comandos útiles
- **CHECKLIST.md** - Lista de verificación

### 🆘 Ayuda
- **SOLUCION_PROBLEMAS.md** - Problemas comunes
- **ESTRUCTURA.md** - Explicación de archivos

### ⚡ Opcionales
- **INICIO_RAPIDO.md** - Versión resumida
- **LICENSE** - Licencia del proyecto

## 🎯 Tu Objetivo

Generar un archivo **APK** instalable en Android que:
- ✅ Cargue el portal de Ayni MINEDU
- ✅ Permita navegación completa
- ✅ Mantenga la sesión del usuario
- ✅ No abra navegadores externos
- ✅ Sea seguro (solo HTTPS)

## ⏱️ Tiempo Estimado

- **Primera vez**: 45-60 minutos
- **Builds siguientes**: 15-20 minutos

## 🔍 Estado Actual

### ✅ Completado
- [x] Estructura del proyecto creada
- [x] Código de la aplicación listo
- [x] Configuración de Expo lista
- [x] GitHub Actions configurado
- [x] Documentación completa

### 📝 Por Hacer (Tú)
- [ ] Crear iconos (icon.png y splash.png)
- [ ] Instalar dependencias
- [ ] Configurar cuenta Expo
- [ ] Configurar GitHub
- [ ] Generar el APK
- [ ] Instalar en Android

## 🎨 Sobre los Iconos

**¿Ya tienes `icono.jpg`?** ¡Perfecto!

Necesitas:
1. **icon.png** (1024x1024) - Icono de la app
2. **splash.png** (1284x2778) - Pantalla de carga

**Usa tu icono.jpg**:
- Conviértelo con Paint/GIMP/Canva
- O usa un servicio online: https://www.simpleimageresizer.com/

**O usa temporales**:
- Descárgalos desde los enlaces arriba
- Reemplázalos después con diseños finales

## 📱 Resultado Final

Al completar la guía tendrás:

```
📱 Ayni MINEDU.apk (50-70 MB)
   ↓
🔽 Descargas desde expo.dev
   ↓
📲 Instalar en Android
   ↓
✨ App funcionando
```

## 🚦 Próximos Pasos

### Ahora Mismo:
1. ✅ Lee este archivo (lo estás haciendo)
2. 🎨 Crea los iconos → `CREAR_ICONOS_MANUAL.md`
3. 📦 Instala dependencias → Comandos arriba
4. 📖 Sigue la guía → `GUIA_GITHUB_ACTIONS.md`

### Después del Primer Build:
1. Probar la app extensivamente
2. Reemplazar iconos con diseños finales
3. Personalizar colores si lo deseas
4. Distribuir el APK a usuarios

## 💡 Tips Importantes

### ⚠️ Cosas a Recordar
- Los iconos son **OBLIGATORIOS** para hacer el build
- Sin `icon.png` y `splash.png`, el build fallará
- Puedes usar temporales y cambiarlos después
- GitHub Actions requiere el token `EXPO_TOKEN`
- El build toma ~15 minutos en la nube

### ✅ Consejos
- Sigue la guía paso a paso
- No te saltes pasos
- Si algo falla, revisa `SOLUCION_PROBLEMAS.md`
- Guarda tu EXPO_TOKEN en un lugar seguro
- Haz commits frecuentes a Git

## 🆘 ¿Tienes Problemas?

### Paso 1: Busca en la Documentación
1. `SOLUCION_PROBLEMAS.md` - Problemas comunes
2. `GUIA_GITHUB_ACTIONS.md` - Revisa que seguiste todos los pasos
3. `COMANDOS.md` - Verifica que usaste los comandos correctos

### Paso 2: Verifica Prerequisitos
```bash
node --version    # Debe ser v16 o superior
npm --version     # Debe mostrar una versión
git --version     # Debe estar instalado
```

### Paso 3: Revisa los Archivos
```bash
# ¿Existen los iconos?
dir assets\icon.png
dir assets\splash.png

# ¿Se instalaron las dependencias?
dir node_modules
```

### Paso 4: Busca Ayuda Online
- [Expo Forums](https://forums.expo.dev/)
- [Expo Discord](https://chat.expo.dev/)
- [Stack Overflow](https://stackoverflow.com/questions/tagged/expo)

## 🎓 Aprende Más

### Si Quieres Entender el Proyecto:
- Lee `ESTRUCTURA.md` - Explica cada archivo
- Lee `README.md` - Documentación completa
- Lee el código en `App.js` - Está bien comentado

### Si Quieres Modificar la App:
- El código principal está en `App.js`
- La configuración está en `app.json`
- Los estilos están en `App.js` (StyleSheet)

### Si Quieres Automatizar Más:
- El workflow está en `.github/workflows/build-apk.yml`
- Se ejecuta automáticamente en cada push a `main`

## 📞 Información del Proyecto

- **Nombre**: Ayni MINEDU
- **Tipo**: Aplicación Android (APK)
- **Tecnología**: React Native + Expo
- **URL**: https://servicios-ayni.minedu.gob.pe/ayni/inicio
- **Identificador**: com.ayni.minedu
- **Versión**: 1.0.0

## ✨ Características

- ✅ WebView nativo completo
- ✅ Sin navegadores externos
- ✅ Sesión persistente
- ✅ Autenticación funcional
- ✅ Botón Atrás de Android
- ✅ Pantalla de carga
- ✅ Manejo de errores
- ✅ Solo HTTPS (seguro)
- ✅ Build automatizado

## 🎉 ¡Estás Listo!

**Tu siguiente acción**: 

1. Si **NO tienes los iconos** → Abre `CREAR_ICONOS_MANUAL.md`
2. Si **YA tienes los iconos** → Abre `GUIA_GITHUB_ACTIONS.md`

---

## 📋 Checklist Rápido

Marca lo que ya completaste:

- [ ] Leí este archivo
- [ ] Creé icon.png (1024x1024)
- [ ] Creé splash.png (1284x2778)
- [ ] Ejecuté `npm install`
- [ ] Ejecuté `npx expo install react-native-webview`
- [ ] Instalé EAS CLI
- [ ] Abrí `GUIA_GITHUB_ACTIONS.md`

---

**¡Éxito con tu aplicación Ayni MINEDU! 🚀📱**

**Empieza con**: `GUIA_GITHUB_ACTIONS.md`
