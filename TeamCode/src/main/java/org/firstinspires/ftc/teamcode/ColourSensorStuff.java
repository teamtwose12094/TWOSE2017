package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.ColorSensor;

/**
 * Created by student on 1/20/2017.
 */

@com.qualcomm.robotcore.eventloop.opmode.Autonomous(name = "ColourSensorStuff", group = "Autonomous")
public class ColourSensorStuff extends Autonomous {
    @Override
    public void runPath() {

        moveColorSensor(0);

        while (opModeIsActive()) {
        if (isBlue() == true){

            move(-5, 0.7);
        }
        else if (isBlue() == false){
            move(0, 0.7);
        }
    }

}}



