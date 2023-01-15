// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.Commands;
import frc.robot.commands.TogglePiston;
import frc.robot.subsystems.Piston;

public class RobotContainer {
  public Piston m_piston;
  public Piston s_piston;

  public RobotContainer() {
    m_piston = new Piston(Constants.PISTON_REVERSE_ID, Constants.PISTON_FORWARD_ID);
    s_piston = new Piston(Constants.SECOND_PISTON_REVERSE_ID, Constants.SECOND_PISTON_FORWARD_ID);

    configureBindings();
  }

  private void configureBindings() {
    SmartDashboard.putData("1st toggle", new TogglePiston(m_piston));
    SmartDashboard.putData("2nd toggle", new TogglePiston(s_piston));
  }

  public Command getAutonomousCommand() {
    return Commands.print("No auto command");
  }
}
