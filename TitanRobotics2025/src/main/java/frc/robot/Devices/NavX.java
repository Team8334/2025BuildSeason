package frc.robot.Devices;

import com.kauailabs.navx.frc.AHRS;
import frc.robot.Interfaces.Gyro;

public class NavX implements Gyro {

    private AHRS gyro;

    public NavX(){

        

    }
    @Override
    public void calibrate() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'calibrate'");
    }

    @Override
    public double getAngle() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAngle'");
    }

    @Override
    public boolean isOperational() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'isOperational'");
    }

    @Override
    public String getName() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getName'");
    }
    
}
