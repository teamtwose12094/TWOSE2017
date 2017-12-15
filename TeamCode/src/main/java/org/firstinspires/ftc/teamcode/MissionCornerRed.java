package org.firstinspires.ftc.teamcode;

/**
 * Created by student on 2/3/2017.
 */

@com.qualcomm.robotcore.eventloop.opmode.Autonomous(name = "MissionCornerRed", group = "Autonomous")
public class MissionCornerRed extends Autonomous {
    @Override
    public void runPath() {
        move(19, 0.7);
        pivot(-115, 0.7);
        move(15, 0.7);
        move(10, 0.7);
        spin(3000, -0.7);
        move(4, 0.7);
    }
}
