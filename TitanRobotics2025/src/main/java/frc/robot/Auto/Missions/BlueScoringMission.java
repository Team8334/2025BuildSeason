package frc.robot.Auto.Missions;

import frc.robot.Auto.AutoMissionChooser;
import frc.robot.Auto.AutoMissionEndedException;

// imported actions
import frc.robot.Auto.Actions.DriveForTimeAction;

/*
 * This mission scores...
 * 
 * 
 */

public class BlueScoringMission extends MissionBase{
    @Override
    protected void routine() throws AutoMissionEndedException {
       runAction(new DriveForTimeAction(0, 0, 0));
    }
}
