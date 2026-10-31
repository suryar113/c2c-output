package org.firstinspires.ftc.teamcode.hardware.subsystems;

import com.qualcomm.robotcore.hardware.DcMotorEx;
import com.qualcomm.robotcore.hardware.Gamepad;
import com.qualcomm.robotcore.hardware.HardwareMap;

import org.firstinspires.ftc.teamcode.config.DrivetrainConstants;

public class Drivetrain {
    private DrivetrainConstants constants;
    private DcMotorEx leftDrive;
    private DcMotorEx rightDrive;

    public Drivetrain(HardwareMap hardwareMap) {
        this.constants = new DrivetrainConstants();
        this.leftDrive = hardwareMap.get(DcMotorEx.class, constants.getLeftDriveLabel());
        leftDrive.setDirection(constants.getLeftDriveDirection());
        leftDrive.setZeroPowerBehavior(constants.getLeftDriveZeroPowerBehavior());
        this.rightDrive = hardwareMap.get(DcMotorEx.class, constants.getRightDriveLabel());
        rightDrive.setDirection(constants.getRightDriveDirection());
        rightDrive.setZeroPowerBehavior(constants.getRightDriveZeroPowerBehavior());
    }

    public void drive(double forward, double turn) {
        double scale = Math.max(1.0, Math.abs(forward) + Math.abs(turn));
        double power = constants.getDrivePower() / scale;
        leftDrive.setPower((forward + turn) * power);
        rightDrive.setPower((forward - turn) * power);
    }

    public void drive(Gamepad driver) {
        drive(-driver.left_stick_y, driver.right_stick_x);
    }

    public void stop() {
        leftDrive.setPower(0);
        rightDrive.setPower(0);
    }
}
