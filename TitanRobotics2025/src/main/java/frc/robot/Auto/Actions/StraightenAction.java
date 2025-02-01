package frc.robot.Auto.Actions;

import frc.robot.Subsystems.Mecanum;
import frc.robot.Subsystems.Gyro;
import frc.robot.Subsystems.PositionEstimation;

import javax.swing.text.Position;

import edu.wpi.first.math.controller.PIDController;
import edu.wpi.first.wpilibj.SPI;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;


/* NEED TO TEST
 * could be useful
 * was used last year in the two note mission
*/
public class StraightenAction implements Actions{
    Timer timer;
    private double currentDegrees = 0;
    private double desiredDegrees;
    private double targetDegrees;
    private double turn;
    private double toleranceDegrees = 0.0025;
    private double endAfterSeconds;

    private Mecanum mecanum;
    private Gyro gyro;
    private PositionEstimation position;

    private PIDController PID;
    private final double kp = 0.02;
    private final double ki = 0.013;
    private final double kd = 0.002;
    /**
     * plus is left
     * 
     */
    public StraightenAction(double degrees, double seconds) 
    {
        mecanum = Mecanum.getInstance();
        position = PositionEstimation.getInstance();
        endAfterSeconds = seconds;
        desiredDegrees = degrees - position.initialAngle;
        PID = new PIDController(kp, ki, kd);
        PID.enableContinuousInput(-180, 180);
        

    }

    @Override
    public void start()
    {
        timer = new Timer();
        timer.start();
        PID.setSetpoint(desiredDegrees);
        PID.setTolerance(toleranceDegrees);
       SmartDashboard.putString( "Current Action", "StraightenAction Started");
    }

 

    @Override
    public void update()
    {
        turn = PID.calculate(position.getAngle());
        mecanum.drive(0, 0, turn);
        SmartDashboard.putNumber("targetDegreesS", desiredDegrees);
        SmartDashboard.putNumber("turnS", turn);
        
    }

    @Override
    public boolean isFinished()
    {
        return (timer.get() >= endAfterSeconds);
    }
    

    @Override
    public void done()
    {
        SmartDashboard.putString( "Current Action", "TurnDegreesAction Ended");
        mecanum.drive(0, 0, 0);
    }
}
