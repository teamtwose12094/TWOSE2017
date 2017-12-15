package org.firstinspires.ftc.teamcode;

/**
 * Created by student on 10/26/2017.
 */

@com.qualcomm.robotcore.eventloop.opmode.Autonomous(name = "MissionUnloadRedRight", group = "Autonomous")
public class MissionUnloadRedRight extends Autonomous {
    @Override
    public void runPath() {
        moveColourSensor(90);
        pivot(-90, 0.7);
        move(19, 0.7);
        pivot(-90, 0.7);
        move(5, 0.7);
        release();
    }

}


