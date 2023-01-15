package frc.robot.commands;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Piston;

public class ExtendPiston extends CommandBase {
    Piston piston;

    public ExtendPiston(Piston piston) {
        this.piston = piston;
    }

    @Override
    public void execute() {
        SmartDashboard.putString("extended", "YES");
        System.out.println("extended");
        piston.extend();
    }

    @Override
    public boolean isFinished() {
        return true;
    }
}
