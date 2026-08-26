# 🎨 Crear Iconos Manualmente - Guía Rápida

Ya que el script automático no funcionó, aquí tienes formas fáciles de crear los iconos.

## 🚀 Método Más Rápido (5 minutos)

### Paso 1: Descargar Iconos Temporales

Abre tu navegador y descarga estos dos archivos:

**Icon.png (1024x1024)**:
1. Copia este enlace: https://via.placeholder.com/1024x1024/0066cc/ffffff?text=AYNI
2. Pégalo en tu navegador
3. Clic derecho en la imagen → "Guardar imagen como..."
4. Guárdala como: `icon.png` en la carpeta `assets\`

**Splash.png (1284x2778)**:
1. Copia este enlace: https://via.placeholder.com/1284x2778/ffffff/0066cc?text=Ayni+MINEDU
2. Pégalo en tu navegador
3. Clic derecho en la imagen → "Guardar imagen como..."
4. Guárdala como: `splash.png` en la carpeta `assets\`

### Paso 2: Verificar

Abre la carpeta `assets` y verifica que tengas:
- ✅ `icon.png`
- ✅ `splash.png`

## 🎨 Método Alternativo: Usar un Generador Online

### Opción 1: Canva (Gratis)

1. Ve a https://www.canva.com/
2. Crear diseño → Personalizado → 1024 x 1024
3. Diseña tu icono (puedes buscar "app icon" en templates)
4. Descarga como PNG → `icon.png`
5. Repite para splash: 1284 x 2778 → `splash.png`

### Opción 2: Figma (Gratis)

1. Ve a https://www.figma.com/
2. Crear nuevo diseño
3. Frame de 1024x1024
4. Diseña el icono
5. Export → PNG → `icon.png`
6. Repite para splash: 1284x2778 → `splash.png`

### Opción 3: Paint (Windows)

**Para icon.png**:
1. Abre Paint
2. Inicio → Redimensionar → Píxeles → 1024 x 1024
3. Dibuja un fondo azul (#0066cc)
4. Escribe "AYNI" con texto blanco
5. Guarda como PNG → `assets\icon.png`

**Para splash.png**:
1. Nuevo documento en Paint
2. Redimensionar → 1284 x 2778
3. Fondo blanco
4. Escribe "Ayni MINEDU" en el centro
5. Guarda como PNG → `assets\splash.png`

## ⚡ Método Súper Rápido: Copiar desde Internet

1. Busca en Google: "minedu peru logo png"
2. Descarga una imagen de buena calidad
3. Ve a: https://www.simpleimageresizer.com/
4. Sube la imagen
5. Redimensiona a 1024x1024
6. Descarga como `icon.png` → Muévela a `assets\`
7. Repite para 1284x2778 → `splash.png`

## 🔍 Verificar que los Iconos son Correctos

### Usando Propiedades de Windows:

**Para icon.png**:
1. Clic derecho en `assets\icon.png`
2. Propiedades → Detalles
3. Verifica: 1024 píxeles de ancho, 1024 píxeles de alto

**Para splash.png**:
1. Clic derecho en `assets\splash.png`
2. Propiedades → Detalles
3. Verifica: 1284 píxeles de ancho, 2778 píxeles de alto

### Usando comandos:

```bash
# En PowerShell, ejecuta:
Get-ChildItem assets\*.png | ForEach-Object {
    $img = New-Object System.Drawing.Bitmap $_.FullName
    Write-Host "$($_.Name): $($img.Width)x$($img.Height)"
    $img.Dispose()
}
```

Debe mostrar:
- icon.png: 1024x1024
- splash.png: 1284x2778

## ✅ Checklist Final

- [ ] El archivo `assets\icon.png` existe
- [ ] icon.png es 1024x1024 píxeles
- [ ] icon.png es formato PNG
- [ ] El archivo `assets\splash.png` existe
- [ ] splash.png es 1284x2778 píxeles
- [ ] splash.png es formato PNG
- [ ] Ambos archivos se ven bien al abrirlos

## 🎯 Una Vez que Tengas los Iconos

Continúa con los siguientes pasos:

```bash
# 1. Instalar dependencias
npm install

# 2. Instalar WebView
npx expo install react-native-webview

# 3. Instalar EAS CLI
npm install -g eas-cli

# 4. Seguir la guía
# Lee: GUIA_GITHUB_ACTIONS.md
```

## 💡 Tips

### Iconos Temporales vs Finales

**Para empezar (ahora)**:
- Usa iconos simples/temporales
- Lo importante es que tengan el tamaño correcto
- Puedes usar placeholder.com o crear algo básico

**Para producción (después)**:
- Contrata un diseñador en Fiverr ($5-20)
- Usa el logo oficial de MINEDU (si está disponible)
- Crea un diseño profesional en Canva/Figma

### No Necesitas Photoshop

Puedes crear iconos perfectamente funcionales con:
- ✅ Paint (Windows)
- ✅ GIMP (gratuito)
- ✅ Canva (gratuito online)
- ✅ Figma (gratuito online)
- ✅ Generadores online

## 🆘 Si Aún Tienes Problemas

### Opción 1: Usar Iconos Predeterminados de Expo

Temporalmente, puedes comentar las líneas de iconos en `app.json`:

```json
{
  "expo": {
    "name": "Ayni MINEDU",
    // "icon": "./assets/icon.png",  <-- Comentar esta línea
    // ...
  }
}
```

**Nota**: Esto usará el icono predeterminado de Expo, pero al menos podrás hacer el build.

### Opción 2: Pedir Ayuda

Si definitivamente no puedes crear los iconos:
1. Sube el proyecto a GitHub sin los iconos
2. Crea un issue pidiendo que alguien cree los iconos
3. O contrata a alguien en Fiverr para que los cree

## 📁 Ubicación Final

Asegúrate de que la estructura sea:

```
ayni-minedu/
├── assets/
│   ├── icon.png      <-- 1024x1024
│   └── splash.png    <-- 1284x2778
├── App.js
├── app.json
└── ...
```

## 🎉 ¡Listo!

Una vez que tengas ambos iconos en su lugar, estás listo para continuar con el build.

**Siguiente paso**: Lee `GUIA_GITHUB_ACTIONS.md` desde el Paso 2 en adelante.

---

**¿Ya tienes los iconos? ¡Excelente! Ahora a hacer el build. 🚀**
