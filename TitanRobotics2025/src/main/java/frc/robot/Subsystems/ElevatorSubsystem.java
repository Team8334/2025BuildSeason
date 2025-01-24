package frc.robot.Subsystems;

import edu.wpi.first.wpilibj.simulation.ElevatorSim;
import edu.wpi.first.wpilibj.simulation.BatterySim;
import edu.wpi.first.wpilibj.simulation.EncoderSim;
import edu.wpi.first.wpilibj.simulation.PWMSim;
import edu.wpi.first.wpilibj.simulation.RoboRioSim;

import edu.wpi.first.math.controller.ElevatorFeedforward;
import edu.wpi.first.math.controller.ProfiledPIDController;
import edu.wpi.first.math.system.plant.DCMotor;
import edu.wpi.first.math.trajectory.TrapezoidProfile;

import frc.robot.Constants;

public class ElevatorSubsystem implements Subsystem {

    private static ElevatorSubsystem instance = null;
    private final DCMotor m_elevatorGearbox = DCMotor.getVex775Pro(4);


    private final ElevatorSim mElevatorSim = 
          new ElevatorSim(
          m_elevatorGearbox,
          Constants.kElevatorGearing,
          Constants.kCarriageMass,
          Constants.kElevatorDrumRadius,
          Constants.kMinElevatorHeightMeters,
          Constants.kMaxElevatorHeightMeters,
          true,
          0,
          0.01,
          0.0);

    private final ProfiledPIDController


    public static ElevatorSubsystem getInstance() {
        if (instance == null) {
            instance = new ElevatorSubsystem();
        }
        return instance;
    }

    public ElevatorSubsystem() {
        
    }

/**
 * Initializes the ExampleSubsystem. This method should set up any necessary
 * resources or configurations required for the subsystem to function properly.
 * It is called once when the subsystem is first instantiated.
 */

    public void initialize() {
        
    }

/**
 * Updates the state of the ExampleSubsystem. This method should be called
 * periodically to ensure that the subsystem maintains its desired state and
 * responds to changes in input or environment.
 */

    public void update() {
        
    }

    public void log() {
        
    }

/**
 * This method checks if the subsystem is currently enabled.
 */

    /**
     * This method checks if the subsystem is currently enabled.
     * 
     * @return A boolean indicating whether the subsystem is enabled
     */
    public boolean isEnabled() {
        return true;
    }

    public String getName() {
        return "ExampleSubsystem";
    }
}

