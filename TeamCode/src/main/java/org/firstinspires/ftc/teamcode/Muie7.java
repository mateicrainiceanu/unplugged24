package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;

@TeleOp(name = "muie7 (Blocks to Java)")
public class Muie7 extends LinearOpMode {

    private DcMotor motor;
    private DcMotor motor2;

//    private Servo servo;


    /**
     * This function is executed when this Op Mode is selected from the Driver Station.
     */
    @Override
    public void runOpMode() {
        motor2 = hardwareMap.get(DcMotor.class, "motor2");
        motor = hardwareMap.get(DcMotor.class, "motor");
//        servo = hardwareMap.get(Servo.class, "servo");

        // Put initialization blocks here.
        waitForStart();
        if (opModeIsActive()) {
            // Put run blocks here.
            while (opModeIsActive()) {
                // Put loop blocks here.
                telemetry.update();
                motor.setPower(0.1);
                motor2.setPower(-0.1);
            }
        }
    }
}