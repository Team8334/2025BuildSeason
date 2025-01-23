package frc.robot.Devices;

import edu.wpi.first.wpilibj.DigitalInput;
import frc.robot.Data.PortMap;
import frc.robot.Interfaces.Devices;

public class LimitSwitch implements Devices {

  private DigitalInput limitswitch;

  public LimitSwitch(int port) {
    super();
    // TODO Auto-generated constructor stub

    try {
      limitswitch = new DigitalInput(PortMap.LIMITSWITCH);
    } catch (Exception e) {

      limitswitch = null;
    }
  }

  public boolean isSwitchPressed() {
    return limitswitch.get();
  }

  public boolean isOperational() {
    if (limitswitch == null) {
      return false;
    } else {
      return true;
    }
  }

  public String getName() {
    return "limit switch";
  }
}
