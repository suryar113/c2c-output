package org.firstinspires.ftc.teamcode.config;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;

public class ShooterConstants {
    private String actuatorLabel = "shooter actuator";
    private DcMotorSimple.Direction actuatorDirection = DcMotorSimple.Direction.FORWARD;
    private DcMotor.ZeroPowerBehavior actuatorZeroPowerBehavior = DcMotor.ZeroPowerBehavior.FLOAT;
    private double targetVelocity = 1500.0;
    private double velocityTolerance = 50.0;

    public String getActuatorLabel() {
        return actuatorLabel;
    }

    public DcMotorSimple.Direction getActuatorDirection() {
        return actuatorDirection;
    }

    public DcMotor.ZeroPowerBehavior getActuatorZeroPowerBehavior() {
        return actuatorZeroPowerBehavior;
    }

    public double getTargetVelocity() {
        return targetVelocity;
    }

    public double getVelocityTolerance() {
        return velocityTolerance;
    }
}
