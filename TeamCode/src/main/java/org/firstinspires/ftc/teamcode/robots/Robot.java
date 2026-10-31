package org.firstinspires.ftc.teamcode.robots;

import com.qualcomm.robotcore.hardware.HardwareMap;

import org.firstinspires.ftc.teamcode.hardware.subsystems.Drivetrain;
import org.firstinspires.ftc.teamcode.hardware.subsystems.Intake;
import org.firstinspires.ftc.teamcode.hardware.subsystems.Feeder;
import org.firstinspires.ftc.teamcode.hardware.subsystems.PollenPusher;
import org.firstinspires.ftc.teamcode.hardware.subsystems.Shooter;

public class Robot {
    private Drivetrain drivetrain;
    private Intake intake;
    private Feeder feeder;
    private PollenPusher pollenPusher;
    private Shooter shooter;

    public Robot(HardwareMap hardwareMap) {
        this.drivetrain = new Drivetrain(hardwareMap);
        this.intake = new Intake(hardwareMap);
        this.feeder = new Feeder(hardwareMap);
        this.pollenPusher = new PollenPusher(hardwareMap);
        this.shooter = new Shooter(hardwareMap);
    }

    public Drivetrain getDrivetrain() {
        return drivetrain;
    }

    public Intake getIntake() {
        return intake;
    }

    public Feeder getFeeder() {
        return feeder;
    }

    public PollenPusher getPollenPusher() {
        return pollenPusher;
    }

    public Shooter getShooter() {
        return shooter;
    }

    public void stop() {
        drivetrain.stop();
        intake.stop();
        feeder.stop();
        pollenPusher.stop();
        shooter.stop();
    }
}
