package org.firstinspires.ftc.teamcode;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

import org.firstinspires.ftc.teamcode.MechanumDrive;

@Autonomous(name="Mecanum Autonomous Without Parking")
public class AutonomousWithoutParking extends LinearOpMode{



    @Override
    public void runOpMode() throws InterruptedException {
        MechanumDrive e = new MechanumDrive(this);
        e.MakeRobotStrafeLeft(48);
        e.MakeRobotStrafeRight(18);
        e.MoveRobotForwardInches(58);
        e.MakeRobotStrafeLeft(14);
        e.MoveRobotBackwardsInches(48);
        e.MakeRobotStrafeRight(12);
        e.MoveRobotBackwardsInches(12);
        e.MakeRobotStrafeLeft(24);
        e.MakeRobotStrafeRight(18);
        e.MoveRobotForwardInches(58);
        e.MakeRobotStrafeLeft(20);
        e.MoveRobotBackwardsInches(54);


    }
}
