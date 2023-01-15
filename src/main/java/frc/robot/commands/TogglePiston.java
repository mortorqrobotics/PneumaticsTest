package frc.robot.commands;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Piston;

public class TogglePiston extends CommandBase {
    Piston piston;

    public TogglePiston(Piston piston) {
        this.piston = piston;
    }

    @Override
    public void execute() {
        piston.toggle();
        SmartDashboard.putString("extended", String.valueOf(piston.extended));
    }

    @Override
    public boolean isFinished() {
        return true;
    }
}
