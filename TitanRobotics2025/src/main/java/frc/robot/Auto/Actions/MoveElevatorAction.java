package frc.robot.Auto.Actions;

import frc.robot.Subsystems.Elevators;//change elevators possibly
import frc.robot.Auto.Actions.WaitAction;
import edu.wpi.first.wpilibj.Timer;

/* NEEDS WORK AND ELEVATOR SUBSYSTEM
 * This action can move the elevator up and down in a 
 * certain number of seconds
*/

public class MoveElevatorAction implements Actions {
    private double seconds;
    Timer timer;

    public void WaitAction(double seconds) {
        this.seconds = seconds;
    }

    @Override
    public void start() {
        timer = new Timer();
        timer.start();
    }

    @Override
    public void update() {}

    @Override
    public boolean isFinished() {
        return timer.get() >= seconds;
    }

    @Override
    public void done() {
        timer.stop();
    }
}
