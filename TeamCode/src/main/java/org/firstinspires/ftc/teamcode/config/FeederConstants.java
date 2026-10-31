package org.firstinspires.ftc.teamcode.config;

import com.qualcomm.robotcore.hardware.DcMotorSimple;

public class FeederConstants {
    private String actuatorLabel = "feeder actuator";
    private DcMotorSimple.Direction actuatorDirection = DcMotorSimple.Direction.FORWARD;
    private double power = 0.8;

    public String getActuatorLabel() {
        return actuatorLabel;
    }

    public DcMotorSimple.Direction getActuatorDirection() {
        return actuatorDirection;
    }

    public double getPower() {
        return power;
    }
}
