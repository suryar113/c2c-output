# Generated FTC robot code

Plain FTC SDK v12 Java. No extra libraries.

- config: one Constants class per mechanism with hardware-map labels, directions and powers/positions.
- hardware/subsystems: one class per mechanism. Construct it with the HardwareMap and call its named actions.
- robots/Robot.java: builds every subsystem. Use `new Robot(hardwareMap)` in your OpMode and call `stop()` when done.

Copy src/main/java into TeamCode, then edit the Constants files so labels match your robot configuration and the powers, velocities and servo positions match your robot. The defaults are starting points, not tuned values.

## Mechanisms

- Drivetrain: hardware/subsystems/Drivetrain.java
- Intake: hardware/subsystems/Intake.java
- Feeder: hardware/subsystems/Feeder.java
- Pollen pusher: hardware/subsystems/PollenPusher.java
- Shooter: hardware/subsystems/Shooter.java
