package frc.robot.Auto.Missions;

import frc.robot.Auto.Actions.WaitAction;
import frc.robot.Auto.AutoMissionChooser;
import frc.robot.Auto.AutoMissionEndedException;

public class ExampleMission extends MissionBase {
  @Override
  protected void routine() throws AutoMissionEndedException {
    runAction(new WaitAction(AutoMissionChooser.delay));
    // runAction(new TurnDegreesAction(90, 3.0)); //plus is left

    // runAction(new DriveForTimeAction (1.0, 0.7));
    // runAction(new ScoringSystemStateAction(2.0, "intaking"));
    // runAction(new FrontPickupNoteAction(0.7, 5.0));
  }
}
