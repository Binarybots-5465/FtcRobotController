package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
@Autonomous(name="Mecanum Autonomous")
public class MechanumAutonomous extends LinearOpMode{



    @Override
    public void runOpMode() throws InterruptedException {
        MechanumDrive e = new MechanumDrive(this);
        e.MoveRobotForwardInches(24);
    }
}
