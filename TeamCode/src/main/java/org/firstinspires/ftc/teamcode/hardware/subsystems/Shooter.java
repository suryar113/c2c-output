package org.firstinspires.ftc.teamcode.hardware.subsystems;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorEx;
import com.qualcomm.robotcore.hardware.HardwareMap;

import org.firstinspires.ftc.teamcode.config.ShooterConstants;

public class Shooter {
    private ShooterConstants constants;
    private DcMotorEx actuator;

    public Shooter(HardwareMap hardwareMap) {
        this.constants = new ShooterConstants();
        this.actuator = hardwareMap.get(DcMotorEx.class, constants.getActuatorLabel());
        actuator.setDirection(constants.getActuatorDirection());
        actuator.setZeroPowerBehavior(constants.getActuatorZeroPowerBehavior());
        actuator.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
    }

    public void setVelocity(double ticksPerSecond) {
        actuator.setVelocity(ticksPerSecond);
    }

    public void spinUp() {
        setVelocity(constants.getTargetVelocity());
    }

    public boolean isAtSpeed() {
        return Math.abs(actuator.getVelocity() - constants.getTargetVelocity()) <= constants.getVelocityTolerance();
    }

    public double getVelocity() {
        return actuator.getVelocity();
    }

    public void stop() {
        actuator.setPower(0);
    }
}
