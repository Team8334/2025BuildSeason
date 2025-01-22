package frc.robot.Subsystems;

import frc.robot.Data.PortMap;
import frc.robot.Data.Settings;
import frc.robot.Devices.NEOSparkMaxMotor;

public class Mecanum implements Subsystem {
    
    private static Mecanum instance = null;

  private NEOSparkMaxMotor rearLeftMotor;
  private NEOSparkMaxMotor frontRightMotor;
  private NEOSparkMaxMotor rearRightMotor;
  private NEOSparkMaxMotor frontLeftMotor;

    public static Mecanum getInstance() {
        if (instance == null) {
            instance = new Mecanum();
        }
        return instance;
    }

    public Mecanum() {
        if (Settings.ENABLE_MECANUM_DRIVE){
            SubsystemManager.registerSubsystem(this);
        }
    }

    public void initialize() {
    this.frontLeftMotor = new NEOSparkMaxMotor(PortMap.MECANUM_FRONT_RIGHT.portNumber);
    this.rearLeftMotor = new NEOSparkMaxMotor(PortMap.MECANUM_FRONT_LEFT.portNumber);
    this.frontRightMotor = new NEOSparkMaxMotor(PortMap.MECANUM_BACK_RIGHT.portNumber);
    this.rearRightMotor = new NEOSparkMaxMotor(PortMap.MECANUM_BACK_LEFT.portNumber);
    }

    public void drive(double forward, double strafe, double rotation) {
        // TODO implement driving. 
    }

    public void update() {

    }

    public void log() {

    }

    public boolean isEnabled() {
        return true;
    }

    public String getName() {
        return "Mecanum";
    }
}
