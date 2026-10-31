package org.firstinspires.ftc.teamcode.hardware.subsystems;

import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;

import org.firstinspires.ftc.teamcode.config.PollenPusherConstants;

public class PollenPusher {
    private PollenPusherConstants constants;
    private Servo actuator;

    public PollenPusher(HardwareMap hardwareMap) {
        this.constants = new PollenPusherConstants();
        this.actuator = hardwareMap.get(Servo.class, constants.getActuatorLabel());
        actuator.setDirection(constants.getActuatorDirection() == DcMotorSimple.Direction.FORWARD ? Servo.Direction.FORWARD : Servo.Direction.REVERSE);
    }

    public void setPosition(double position) {
        actuator.setPosition(position);
    }

    public void extend() {
        setPosition(constants.getExtendPosition());
    }

    public void retract() {
        setPosition(constants.getRetractPosition());
    }

    public void stop() {
        // Positional servos hold their last position.
    }
}
