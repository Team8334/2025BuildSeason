package frc.robot;

import frc.robot.Devices.Controller;
import frc.robot.Data.PortMap;
import frc.robot.Subsystems.Mecanum;

public class Teleop {
    
Controller driverController;

    Mecanum mecanum;

    public Teleop() {
        driverController = new Controller(PortMap.DRIVER_CONTROLLER);
        if(!driverController.isOperational()) {
            System.out.println("404 Controller not found :(");
        }

        mecanum = new Mecanum();
    }

    public void teleopPeriodic() {

    }

    public void driveBaseControl() {
       double forward = driverController.getLeftY();
       double strafe = driverController.getLeftX();
       double rotate = driverController.getRightX();
       mecanum.drive(forward, strafe, rotate);
    }

    public void manipulatorControl() {

    }

}
