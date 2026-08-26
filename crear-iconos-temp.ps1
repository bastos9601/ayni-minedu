# Script de PowerShell para descargar iconos temporales
# Para Windows - Ayni MINEDU

Write-Host "==========================================" -ForegroundColor Cyan
Write-Host "  Creador de Iconos Temporales" -ForegroundColor Cyan
Write-Host "  Ayni MINEDU App" -ForegroundColor Cyan
Write-Host "==========================================" -ForegroundColor Cyan
Write-Host ""

# Crear carpeta assets si no existe
if (-not (Test-Path "assets")) {
    New-Item -ItemType Directory -Path "assets" | Out-Null
    Write-Host "[OK] Carpeta 'assets' creada" -ForegroundColor Green
} else {
    Write-Host "[OK] Carpeta 'assets' ya existe" -ForegroundColor Yellow
}

Write-Host ""
Write-Host "Descargando iconos temporales..." -ForegroundColor Cyan
Write-Host ""

# Descargar icon.png
try {
    $iconUrl = "https://via.placeholder.com/1024x1024/0066cc/ffffff?text=AYNI+MINEDU"
    $iconPath = "assets\icon.png"
    
    Write-Host "Descargando icon.png (1024x1024)..." -ForegroundColor Yellow
    Invoke-WebRequest -Uri $iconUrl -OutFile $iconPath -UseBasicParsing
    
    if (Test-Path $iconPath) {
        $iconSize = (Get-Item $iconPath).Length / 1KB
        Write-Host "[OK] icon.png descargado ($([math]::Round($iconSize, 2)) KB)" -ForegroundColor Green
    }
} catch {
    Write-Host "[ERROR] No se pudo descargar icon.png" -ForegroundColor Red
    Write-Host "Error: $_" -ForegroundColor Red
}

Write-Host ""

# Descargar splash.png
try {
    $splashUrl = "https://via.placeholder.com/1284x2778/ffffff/0066cc?text=Ayni+MINEDU"
    $splashPath = "assets\splash.png"
    
    Write-Host "Descargando splash.png (1284x2778)..." -ForegroundColor Yellow
    Invoke-WebRequest -Uri $splashUrl -OutFile $splashPath -UseBasicParsing
    
    if (Test-Path $splashPath) {
        $splashSize = (Get-Item $splashPath).Length / 1KB
        Write-Host "[OK] splash.png descargado ($([math]::Round($splashSize, 2)) KB)" -ForegroundColor Green
    }
} catch {
    Write-Host "[ERROR] No se pudo descargar splash.png" -ForegroundColor Red
    Write-Host "Error: $_" -ForegroundColor Red
}

Write-Host ""
Write-Host "==========================================" -ForegroundColor Cyan

# Verificar que los archivos existan
$allGood = $true

if (Test-Path "assets\icon.png") {
    Write-Host "[OK] assets\icon.png existe" -ForegroundColor Green
} else {
    Write-Host "[X] assets\icon.png NO existe" -ForegroundColor Red
    $allGood = $false
}

if (Test-Path "assets\splash.png") {
    Write-Host "[OK] assets\splash.png existe" -ForegroundColor Green
} else {
    Write-Host "[X] assets\splash.png NO existe" -ForegroundColor Red
    $allGood = $false
}

Write-Host "==========================================" -ForegroundColor Cyan
Write-Host ""

if ($allGood) {
    Write-Host "Iconos temporales creados exitosamente!" -ForegroundColor Green
    Write-Host ""
    Write-Host "NOTA: Estos son iconos de prueba (placeholder)." -ForegroundColor Yellow
    Write-Host "Puedes reemplazarlos con tus propios disenos mas adelante." -ForegroundColor Yellow
    Write-Host ""
    Write-Host "Proximos pasos:" -ForegroundColor Cyan
    Write-Host "1. Ejecutar: npm install" -ForegroundColor White
    Write-Host "2. Ejecutar: npx expo install react-native-webview" -ForegroundColor White
    Write-Host "3. Ejecutar: npm install -g eas-cli" -ForegroundColor White
    Write-Host "4. Seguir la guia: GUIA_GITHUB_ACTIONS.md" -ForegroundColor White
} else {
    Write-Host "Hubo problemas al crear los iconos." -ForegroundColor Red
    Write-Host "Puedes descargarlos manualmente desde:" -ForegroundColor Yellow
    Write-Host "icon.png: https://via.placeholder.com/1024x1024/0066cc/ffffff?text=AYNI" -ForegroundColor White
    Write-Host "splash.png: https://via.placeholder.com/1284x2778/ffffff/0066cc?text=Ayni+MINEDU" -ForegroundColor White
}

Write-Host ""
Write-Host "Presiona cualquier tecla para salir..." -ForegroundColor Gray
$null = $Host.UI.RawUI.ReadKey("NoEcho,IncludeKeyDown")
