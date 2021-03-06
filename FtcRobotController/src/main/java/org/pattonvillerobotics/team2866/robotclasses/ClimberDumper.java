package org.pattonvillerobotics.team2866.robotclasses;

import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;

/**
 * Created by Nathan Skelton on 10/25/15.
 * <p/>
 */
public class ClimberDumper {

    private static final double UP = 0.5;
    private static final double DOWN = 1;
    public Servo servoDumper;
    private HardwareMap hardwareMap;

    public ClimberDumper(HardwareMap hardwareMap) {
        this.hardwareMap = hardwareMap;
        this.servoDumper = this.hardwareMap.servo.get(Config.SERVO_DUMPER);

    }

    public void move(DirectionEnum direction) {
        switch (direction) {
            case UP:
                servoDumper.setPosition(UP);
                break;
            case DOWN:
                servoDumper.setPosition(DOWN);
                break;
        }
    }
}