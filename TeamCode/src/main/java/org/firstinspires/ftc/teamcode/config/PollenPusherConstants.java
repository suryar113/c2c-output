package org.firstinspires.ftc.teamcode.config;

import com.qualcomm.robotcore.hardware.DcMotorSimple;

public class PollenPusherConstants {
    private String actuatorLabel = "pollen pusher actuator";
    private DcMotorSimple.Direction actuatorDirection = DcMotorSimple.Direction.FORWARD;
    private double extendPosition = 1.0;
    private double retractPosition = 0.0;

    public String getActuatorLabel() {
        return actuatorLabel;
    }

    public DcMotorSimple.Direction getActuatorDirection() {
        return actuatorDirection;
    }

    public double getExtendPosition() {
        return extendPosition;
    }

    public double getRetractPosition() {
        return retractPosition;
    }
}
