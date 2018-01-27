package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.ColorSensor;

/**
 * Created by student on 1/20/2017.
 */

@com.qualcomm.robotcore.eventloop.opmode.Autonomous(name = "ColourSensorStuff", group = "Autonomous")
public class ColourSensorStuff extends Autonomous {
    @Override
    public void runPath() {

        moveColorSensor(1);

        while (opModeIsActive()) {
        if (isBlue() == true){

            move(-3, 0.7);
        }
        else if (isRed() == true){
            move(3, 0.7);
        }
    }

}}



