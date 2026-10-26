# Gym Tracker — generar APK

Este proyecto Android contiene la aplicación Gym Tracker en `app/src/main/assets/index.html`.

## Generar el APK con GitHub Actions

Se incluye el flujo `.github/workflows/build-apk.yml`, que compila automáticamente un APK de depuración y lo publica como artefacto descargable.

1. Crea un repositorio en GitHub y sube el contenido de esta carpeta (no el ZIP dentro de otra carpeta).
2. Abre la pestaña **Actions** del repositorio y habilita los flujos si GitHub lo solicita.
3. En **Actions**, ejecuta **Build GymTracker APK** con **Run workflow**.
4. Cuando termine correctamente, abre esa ejecución y descarga el artefacto **GymTracker-debug-apk**.
5. Descomprime el artefacto y copia `app-debug.apk` al móvil Android.
6. Abre el APK y, si Android lo solicita, permite instalar aplicaciones desde esa fuente.

## Requisitos y notas

- El flujo compila `assembleDebug` con Java 17 y Android SDK.
- El APK de depuración sirve para instalar y probar la app; no es una publicación firmada para Google Play.
- La interfaz usa bibliotecas CDN (React, Babel y Tailwind), por lo que necesita conexión a Internet al abrir la aplicación.
- Los datos de entrenamiento se guardan en `localStorage` del WebView de ese dispositivo. Desinstalar o borrar los datos de la aplicación puede eliminarlos.
