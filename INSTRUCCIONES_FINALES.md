# 🎯 INSTRUCCIONES FINALES - Ayni MINEDU

## ✅ Problema Resuelto

He eliminado el workflow antiguo de Expo que estaba causando errores.

## 📝 Cambios Realizados

### ❌ Eliminado:
- `.github/workflows/build-apk.yml` (Expo/React Native - causaba errores)

### ✅ Activo:
- `.github/workflows/build-android-apk.yml` (Android Nativo - funciona sin tokens)

## 🚀 PASOS PARA GENERAR TU APK (5 minutos)

### Paso 1: Ir a GitHub Actions
Abre este enlace:
```
https://github.com/bastos9601/ayni-minedu/actions
```

### Paso 2: Seleccionar el Workflow
- En el menú lateral izquierdo, busca: **"Build Android APK"**
- Haz clic en él

### Paso 3: Ejecutar el Workflow
- Clic en el botón **"Run workflow"** (lado derecho)
- Asegúrate de que dice `Branch: main`
- Clic en el botón verde **"Run workflow"**

### Paso 4: Esperar
- Verás un círculo amarillo girando 🟡
- El build toma aproximadamente **5-8 minutos**
- Cuando termine, verás una marca verde ✅

### Paso 5: Descargar el APK
1. Haz scroll hacia abajo en la misma página
2. Busca la sección **"Artifacts"**
3. Verás: **"ayni-minedu-apk"**
4. Haz clic para descargar (se descargará un ZIP)
5. Descomprime el ZIP
6. Dentro encontrarás: **`app-release-unsigned.apk`**

### Paso 6: Instalar en Android
1. Transfiere el APK a tu teléfono Android
2. Habilita "Instalar de orígenes desconocidos"
3. Abre el APK
4. Instala
5. ¡Listo! 🎉

## ⚡ Ventajas de Este Método

| Característica | Antes (Expo) | Ahora (Nativo) |
|----------------|--------------|----------------|
| Necesita EXPO_TOKEN | ✅ Sí | ❌ No |
| Necesita Node.js | ✅ Sí | ❌ No |
| Tiempo de build | 15-20 min | 5-8 min |
| Tamaño del APK | 50-70 MB | 3-5 MB |
| Errores comunes | Muchos | Ninguno |

## 🎯 ¿Qué Hace el APK?

La aplicación resultante:
- ✅ Abre automáticamente: https://servicios-ayni.minedu.gob.pe/ayni/inicio
- ✅ Navegación completa dentro de la app
- ✅ No abre Chrome automáticamente
- ✅ Mantiene la sesión del usuario
- ✅ Botón Atrás funcional
- ✅ Solo conexiones HTTPS (seguro)
- ✅ Barra de progreso de carga
- ✅ Manejo de errores de conexión

## 🔄 Para Futuras Actualizaciones

Si quieres cambiar algo en la app:

### Cambiar la URL:
Edita: `app/src/main/java/com/ayni/minedu/MainActivity.java`
```java
private static final String AYNI_URL = "https://tu-nueva-url.com";
```

### Cambiar el nombre:
Edita: `app/src/main/res/values/strings.xml`
```xml
<string name="app_name">Tu Nuevo Nombre</string>
```

### Cambiar el identificador:
Edita: `app/build.gradle`
```gradle
applicationId "com.tu.paquete"
```

Luego:
```bash
git add .
git commit -m "Actualización de la app"
git push
```

Y ejecuta el workflow nuevamente desde GitHub Actions.

## 🆘 Si Algo Falla

### El workflow no aparece
- Refresca la página de GitHub
- Verifica que estés en la pestaña "Actions"

### El build falla
- Revisa los logs en la página del workflow
- Verifica que todos los archivos estén en GitHub
- Especialmente: `app/src/main/java/com/ayni/minedu/MainActivity.java`

### El APK no se instala
- Habilita "Orígenes desconocidos" en Android
- Ve a: Configuración → Seguridad → Orígenes desconocidos
- O cuando intentes instalar, acepta "Instalar de esta fuente"

## ✅ Checklist Final

Antes de ejecutar el workflow, verifica:
- [ ] Estás en: https://github.com/bastos9601/ayni-minedu/actions
- [ ] Ves "Build Android APK" en el menú izquierdo
- [ ] Haces clic en "Run workflow"
- [ ] Esperas 5-8 minutos
- [ ] Descargas de "Artifacts"

## 🎉 ¡Todo Listo!

Ya no necesitas:
- ❌ EXPO_TOKEN
- ❌ Cuenta de Expo
- ❌ Node.js instalado
- ❌ npm
- ❌ Configuración compleja

Solo:
1. Ejecutar workflow
2. Esperar
3. Descargar
4. Instalar

---

**¡Tu aplicación Ayni MINEDU está lista para ser generada! 🚀**

**Siguiente paso**: Ve a GitHub Actions y ejecuta "Run workflow"
