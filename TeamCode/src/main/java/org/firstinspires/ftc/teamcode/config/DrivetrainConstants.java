package org.firstinspires.ftc.teamcode.config;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;

public class DrivetrainConstants {
    private String leftDriveLabel = "left drive";
    private DcMotorSimple.Direction leftDriveDirection = DcMotorSimple.Direction.FORWARD;
    private DcMotor.ZeroPowerBehavior leftDriveZeroPowerBehavior = DcMotor.ZeroPowerBehavior.BRAKE;
    private String rightDriveLabel = "right drive";
    private DcMotorSimple.Direction rightDriveDirection = DcMotorSimple.Direction.FORWARD;
    private DcMotor.ZeroPowerBehavior rightDriveZeroPowerBehavior = DcMotor.ZeroPowerBehavior.BRAKE;
    private double drivePower = 1.0;

    public String getLeftDriveLabel() {
        return leftDriveLabel;
    }

    public DcMotorSimple.Direction getLeftDriveDirection() {
        return leftDriveDirection;
    }

    public DcMotor.ZeroPowerBehavior getLeftDriveZeroPowerBehavior() {
        return leftDriveZeroPowerBehavior;
    }

    public String getRightDriveLabel() {
        return rightDriveLabel;
    }

    public DcMotorSimple.Direction getRightDriveDirection() {
        return rightDriveDirection;
    }

    public DcMotor.ZeroPowerBehavior getRightDriveZeroPowerBehavior() {
        return rightDriveZeroPowerBehavior;
    }

    public double getDrivePower() {
        return drivePower;
    }
}
