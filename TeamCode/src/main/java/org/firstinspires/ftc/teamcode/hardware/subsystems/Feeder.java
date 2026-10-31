package org.firstinspires.ftc.teamcode.hardware.subsystems;

import com.qualcomm.robotcore.hardware.CRServo;
import com.qualcomm.robotcore.hardware.HardwareMap;

import org.firstinspires.ftc.teamcode.config.FeederConstants;

public class Feeder {
    private FeederConstants constants;
    private CRServo actuator;

    public Feeder(HardwareMap hardwareMap) {
        this.constants = new FeederConstants();
        this.actuator = hardwareMap.get(CRServo.class, constants.getActuatorLabel());
        actuator.setDirection(constants.getActuatorDirection());
    }

    public void setPower(double power) {
        actuator.setPower(power);
    }

    public void feed() {
        setPower(constants.getPower());
    }

    public void reverse() {
        setPower(-constants.getPower());
    }

    public void stop() {
        actuator.setPower(0);
    }
}
