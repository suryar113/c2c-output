# FTC SDK project with generated subsystems

Open this folder in Android Studio. This is the official FTC SDK v12.0 at commit e14c2aeb33e84d4ea21697beeea9ac49557be870, with the exact software-checked generated files installed under TeamCode/src/main/java.

1. Let Gradle sync and install the requested Android SDK tools.
2. Read TeamCode/README.md and robot-config.json for this robot’s hardware names and required configuration.
3. Configure wiring, motor directions, servo travel, measurements and driver bindings before using the controllers. No built robot was tested by this app.
4. Check cad-to-code/coverage.json for included, passive and unresolved source groups. Only included controllers are implemented.

Build: ./gradlew :TeamCode:assembleDebug (Windows: gradlew.bat :TeamCode:assembleDebug).

Software-preview exports also contain UNVERIFIED-PREVIEW.md and verification evidence. They require hardware configuration; downloading them does not confirm physical operation.
