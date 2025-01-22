package frc.robot.Devices;

import edu.wpi.first.wpilibj.CAN;
import edu.wpi.first.wpilibj.motorcontrol.MotorController;
import com.revrobotics.spark.*;
import com.revrobotics.spark.SparkLowLevel.MotorType;

public  class NEOSparkMaxMotor {
    // REV robotics changed "CANSparkMax" to "SparkMax"

    private SparkMax m_motor;
    private int CANID;
    private boolean isInverted;

    public NEOSparkMaxMotor(int CANID){
        
        this.CANID = CANID;
        try {
            m_motor = new SparkMax(CANID,MotorType.kBrushless);
        }
        catch(Exception e) {
            m_motor = null;
            System.out.println("SparkMax not found: " + CANID);
        }
    }
    public String getName(){
        return "SparkMax CAN ID:" + CANID;
    }
    public boolean isOperational(){
       if (m_motor == null){
        return false;
       }
       else {
        return true;
       }
    }
    public void set(double speed){
       
        if (isInverted){
            speed*=-1;
        }
        m_motor.set(speed);
    }
    public void setInverted(boolean isInverted){
        this.isInverted = isInverted;
        
    }

    
}
