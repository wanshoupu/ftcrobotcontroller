package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp
public class HelloSamWorld extends OpMode {
    @Override
    public void init() {
        telemetry.addData("Hello","world");
    }

    @Override
    public void loop() {

    }
}
