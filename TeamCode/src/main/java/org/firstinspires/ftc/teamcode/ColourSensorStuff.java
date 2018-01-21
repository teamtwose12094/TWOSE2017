package org.firstinspires.ftc.teamcode;
import com.qualcomm.robotcore.eventloop.opmode.*;
import com.qualcomm.robotcore.hardware.ColorSensor;
import com.qualcomm.robotcore.hardware.HardwareMap;

/**
 * Created by Instructor on 1/20/2018.
 */

public class ColourSensorStuff extends HardwareK9bot{

    ColorSensor color_sensor;

    public void init() {

    color_sensor = hwMap.colorSensor.get("color");

// ...
        color_sensor.red(); // Red channel value
        color_sensor.green(); // Green channel value
        color_sensor.blue();// Blue channel value
        color_sensor.alpha(); // Total luminosity
        color_sensor.argb();// Combined color value

        color_sensor.enableLed(true);// Turn the LED on
        color_sensor.enableLed(false); // Turn the LED off



}}
