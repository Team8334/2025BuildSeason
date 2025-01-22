package frc.robot.Interfaces;

import com.kauailabs.navx.frc.AHRS;

public interface Gyro {

    void calibrate();

    double getAngle();
    
    boolean isOperational();

    default void logData() {

    }

    String getName();
}
