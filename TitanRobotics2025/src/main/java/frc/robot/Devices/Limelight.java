package frc.robot.Devices;

import frc.robot.Interfaces.Vision;
import frc.robot.Interfaces.Devices;
import edu.wpi.first.networktables.NetworkTable;
import frc.robot.Data.ExternalLibraries.LimelightHelpers;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class Limelight extends LimelightHelpers implements Vision, Devices{

    int pipeline;
    String limelightName;
    int ID;

    // how many degrees back is your limelight rotated from perfectly vertical? NEED VALUE FOR ROBOT
    protected double limelightMountAngleDegrees = 0; 

    // distance from the center of the Limelight lens to the floor NEED VALUE FOR ROBOT
    protected double limelightLensHeightMeters = 20.0; 
    
    // distance from the target to the floor, depends on target
    private double goalHeightMeters; 

	private String alliance;
    
    public Limelight(String limelightName, int port, String tableName, int ID){
        this.limelightName = limelightName;
        this.ID = ID;
    }
    
    
    public String getName() {
        return "Limelight" + ID;
    }

    public int getPipeline()
    {
        return pipeline;
    }

    public void setAlliance(String alliance)
    {
        this.alliance = alliance;
    }
    
    public boolean isOperational(){
        return true; //placeholder, figure out way to check if it's working
    }

    public void logtoSmartDashboard() {
        SmartDashboard.putNumber("Limelight" + ID +"/Target X", LimelightHelpers.getTX(limelightName));
        SmartDashboard.putNumber("Limelight" + ID +"/Target Y", LimelightHelpers.getTY(limelightName));
        SmartDashboard.putNumber("Limelight" + ID +"/Target Area", LimelightHelpers.getTA(limelightName));
        SmartDashboard.putNumber("Limelight" + ID +"/Latency", LimelightHelpers.getLatency_Capture(limelightName));
        SmartDashboard.putNumber("Limelight" + ID +"/Robot Pose X", LimelightHelpers.getBotPose2d(limelightName).getX());
        SmartDashboard.putNumber("Limelight" + ID +"/Robot Pose Y", LimelightHelpers.getBotPose2d(limelightName).getY());
        
        
    }

}
