package frc.robot.commands;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Piston;

public class RetractPiston extends CommandBase {
    Piston piston;

    public RetractPiston(Piston piston) {
        this.piston = piston;
    }

    @Override
    public void execute() {
        SmartDashboard.putString("extended", "NO");
        piston.retract();
    }

    @Override
    public boolean isFinished() {
        return true;
    }
}
