#!/usr/bin/env python3
"""
Script para crear iconos temporales para la app Ayni MINEDU
Requiere: pip install pillow
"""

from PIL import Image, ImageDraw, ImageFont
import os

# Crear carpeta assets si no existe
os.makedirs('assets', exist_ok=True)

# Crear icon.png (1024x1024)
print("Creando icon.png...")
icon = Image.new('RGB', (1024, 1024), color='#0066cc')
draw = ImageDraw.Draw(icon)

# Intentar usar una fuente, si no usa la predeterminada
try:
    font_large = ImageFont.truetype("arial.ttf", 120)
    font_small = ImageFont.truetype("arial.ttf", 80)
except:
    font_large = ImageFont.load_default()
    font_small = ImageFont.load_default()

# Dibujar texto
draw.text((512, 400), "AYNI", fill='white', font=font_large, anchor='mm')
draw.text((512, 550), "MINEDU", fill='white', font=font_small, anchor='mm')

icon.save('assets/icon.png')
print("✓ icon.png creado (1024x1024)")

# Crear splash.png (1284x2778)
print("Creando splash.png...")
splash = Image.new('RGB', (1284, 2778), color='white')
draw_splash = ImageDraw.Draw(splash)

# Dibujar círculo azul en el centro
center_x, center_y = 642, 1200
radius = 150
draw_splash.ellipse([center_x-radius, center_y-radius, 
                      center_x+radius, center_y+radius], 
                     fill='#0066cc')

# Texto
try:
    font_splash_title = ImageFont.truetype("arial.ttf", 90)
    font_splash_sub = ImageFont.truetype("arial.ttf", 60)
except:
    font_splash_title = ImageFont.load_default()
    font_splash_sub = ImageFont.load_default()

draw_splash.text((642, center_y), "A", fill='white', font=font_splash_title, anchor='mm')
draw_splash.text((642, 1450), "Ayni MINEDU", fill='#0066cc', font=font_splash_title, anchor='mm')
draw_splash.text((642, 1570), "Ministerio de Educación", fill='#666666', font=font_splash_sub, anchor='mm')

splash.save('assets/splash.png')
print("✓ splash.png creado (1284x2778)")

print("\n✅ Iconos temporales creados exitosamente!")
print("Ubicación: assets/icon.png y assets/splash.png")
print("\nNota: Estos son iconos temporales. Puedes reemplazarlos con diseños personalizados más adelante.")
