package frc.robot.Devices;

import edu.wpi.first.wpilibj.CAN;
import edu.wpi.first.wpilibj.drive.RobotDriveBase.MotorType;
import edu.wpi.first.wpilibj.motorcontrol.MotorController;
import com.revrobotics.spark.*;

public  class NEOSparkMaxMotor {

    private CANSparkMax m_motor;
    private static int portNumber;

    public NEOSparkMaxMotor(){
        m_motor = new CANSparkMax(portNumber, MotorType.kBrushless);
    }
    public String getName(){
        return "";
    }
    public boolean isOperational(){
       return ;
    }
    public double set(double speed){
        return speed;
    }
    public void setInverted(boolean isInverted){
        
    }

    
}
