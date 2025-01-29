package frc.robot.Subsystems;

import frc.robot.Data.Settings;

public class Mecanum implements Subsystem {

  private static Mecanum instance = null;

  public static Mecanum getInstance() {
    if (instance == null) {
      instance = new Mecanum();
    }
    return instance;
  }

  public Mecanum() {
    if (Settings.ENABLE_MECANUM_DRIVE) {
      SubsystemManager.registerSubsystem(this);
    }
  }

  public void initialize() {}

  public void drive(double forward, double strafe, double rotation) {
    // TODO implement driving.
  }

  public void update() {}

  public void log() {}

  public boolean isEnabled() {
    return true;
  }

  public String getName() {
    return "Mecanum";
  }
}
