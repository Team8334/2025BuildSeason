package frc.robot;

import frc.robot.Devices.Controller;
import frc.robot.Data.PortMap;

public class Teleop {
    
Controller driverController;

    public Teleop() {
        driverController = new Controller(PortMap.DRIVER_CONTROLLER);
        if(!driverController.isOperational()) {
            System.out.println("404 Controller not found :(");
        }
    }

    public void teleopPeriodic() {

    }

    public void driveBaseControl() {

    }

    public void manipulatorControl() {

    }

}
