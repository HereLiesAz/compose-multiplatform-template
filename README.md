# Compose Multiplatform Template

Compose Multiplatform application starter using the current AGP 9 project structure.

## Modules

- `shared` — common Compose UI, Android KMP library target, and desktop JVM target
- `androidApp` — Android application entry point
- `desktopApp` — desktop application entry point and native packaging

## Stack

- Android Gradle Plugin 9.4.1
- Kotlin 2.4.20
- Compose Multiplatform 1.12.0
- Android API 37 / minSdk 28

Rename the `com.hereliesaz.templatempp` namespaces before shipping.

## Workflows

Select central automation in `.github/workflow-request.yml`. New workflow implementations must be generalized and submitted to `HereLiesAz/workflows`.
