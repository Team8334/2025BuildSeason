package frc.robot.Subsystems;


public class ExampleSubsystem implements Subsystem {

    private static ExampleSubsystem instance = null;
    
    public static ExampleSubsystem getInstance() {
        if (instance == null) {
            instance = new ExampleSubsystem();
        }
        return instance;
    }

    public ExampleSubsystem() {
        
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
