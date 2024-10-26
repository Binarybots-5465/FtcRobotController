package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

@Autonomous(name="Move Robot Forward 2 Feet")
public class MoveRobotForward2Feet extends LinearOpMode {


    @Override
    public void runOpMode() throws InterruptedException {
        E e = new E(this);
        e.moveRobotForwardInches(24);
    }
}
