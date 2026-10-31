package org.firstinspires.ftc.teamcode.config;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;

public class IntakeConstants {
    private String actuatorLabel = "intake actuator";
    private DcMotorSimple.Direction actuatorDirection = DcMotorSimple.Direction.FORWARD;
    private DcMotor.ZeroPowerBehavior actuatorZeroPowerBehavior = DcMotor.ZeroPowerBehavior.BRAKE;
    private double power = 0.8;

    public String getActuatorLabel() {
        return actuatorLabel;
    }

    public DcMotorSimple.Direction getActuatorDirection() {
        return actuatorDirection;
    }

    public DcMotor.ZeroPowerBehavior getActuatorZeroPowerBehavior() {
        return actuatorZeroPowerBehavior;
    }

    public double getPower() {
        return power;
    }
}
