package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.ColorSensor;
import com.qualcomm.robotcore.hardware.I2cAddr;

/**
 * Created by student on 10/26/2017.
 */

@com.qualcomm.robotcore.eventloop.opmode.Autonomous(name = "MissionUnloadBlueLeft", group = "Autonomous")
public abstract class MissionUnloadBlueLeft extends Autonomous implements ColorSensor {
    @Override
    public void runPath() {
        moveColourSensor(90);
        /*ColorSensor ColourSensor = new ColorSensor() {
            @Override
            public int red() {
                return 0;
            }

            @Override
            public int green() {
                return 0;
            }

            @Override
            public int blue() {
                return 0;
            }

            @Override
            public int alpha() {
                return 0;
            }

            @Override
            public int argb() {
                return 0;
            }

            @Override
            public void enableLed(boolean enable) {

            }

            @Override
            public void setI2cAddress(I2cAddr newAddress) {

            }

            @Override
            public I2cAddr getI2cAddress() {
                return null;
            }

            @Override
            public Manufacturer getManufacturer() {
                return null;
            }

            @Override
            public String getDeviceName() {
                return null;
            }

            @Override
            public String getConnectionInfo() {
                return null;
            }

            @Override
            public int getVersion() {
                return 0;
            }

            @Override
            public void resetDeviceConfigurationForOpMode() {

            }

            @Override
            public void close() {

            }
        };
        if (ColourSensor.blue() > 80) {
            pivot(90, 0.7);
        }*/
        detectColour();
        moveColourSensor(90);
        move(3, 0.7);
        pivot(90, 0.7);
        move(19, 0.7);
        pivot(90, 0.7);
        move(5, 0.7);
        release();
    }

}


