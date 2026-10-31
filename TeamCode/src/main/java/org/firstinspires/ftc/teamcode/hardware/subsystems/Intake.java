package org.firstinspires.ftc.teamcode.hardware.subsystems;

import com.qualcomm.robotcore.hardware.DcMotorEx;
import com.qualcomm.robotcore.hardware.HardwareMap;

import org.firstinspires.ftc.teamcode.config.IntakeConstants;

public class Intake {
    private IntakeConstants constants;
    private DcMotorEx actuator;

    public Intake(HardwareMap hardwareMap) {
        this.constants = new IntakeConstants();
        this.actuator = hardwareMap.get(DcMotorEx.class, constants.getActuatorLabel());
        actuator.setDirection(constants.getActuatorDirection());
        actuator.setZeroPowerBehavior(constants.getActuatorZeroPowerBehavior());
    }

    public void setPower(double power) {
        actuator.setPower(power);
    }

    public void start() {
        setPower(constants.getPower());
    }

    public void clear() {
        setPower(-constants.getPower());
    }

    public void stop() {
        actuator.setPower(0);
    }
}
