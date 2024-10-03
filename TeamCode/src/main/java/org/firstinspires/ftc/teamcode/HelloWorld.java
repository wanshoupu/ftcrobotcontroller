package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp(name = "HelloWorld", group = "Empty")
public class HelloWorld extends OpMode {
    @Override
    public void init() {
        telemetry.addData("Hello","world");
    }

    @Override
    public void loop() {
        telemetry.addData("EventLoop",3.14159);

    }
}
