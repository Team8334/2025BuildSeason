package frc.robot.Devices;

import com.revrobotics.spark.SparkLowLevel.MotorType;
import com.revrobotics.spark.SparkMax;
import frc.robot.Interfaces.Devices;

public class NEOSparkMax implements Devices {

  private SparkMax m_motor;
  private int CANID;
  private boolean isInverted;

  public NEOSparkMax(int CANID) {

    this.CANID = CANID;
    try {
      m_motor = new SparkMax(CANID, MotorType.kBrushless);
    } catch (Exception e) {
      m_motor = null;
      System.out.println("SparkMax not found: " + CANID);
    }
  }

  @Override
  public boolean isOperational() {
    if (m_motor == null) {
      return false;
    } else {
      return true;
    }
  }

  public void set(double speed) {
    m_motor.set(speed);
  }

  @Override
  public String getName() {
    return "SparkMax CAN ID:" + CANID;
  }
}
