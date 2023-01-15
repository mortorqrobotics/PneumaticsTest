package frc.robot.subsystems;

import edu.wpi.first.wpilibj.PneumaticsModuleType;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import frc.robot.Constants;

public class Piston extends SubsystemBase {
    DoubleSolenoid m_piston;
    public boolean extended = false;

    public Piston(int reverseID, int forwardID) {
        this.m_piston = new DoubleSolenoid(Constants.PCM_ID, PneumaticsModuleType.CTREPCM, forwardID, reverseID);
        this.m_piston.set(Value.kReverse);
    }

    public void extend() {
        if(!extended) {
            m_piston.set(Value.kForward);
        }
        extended = true;
    }

    public void retract() {
        if(extended) {
            m_piston.set(Value.kReverse);
        }
        extended = false;
    }

    public void off() {
        m_piston.set(Value.kOff);
    }

    public void toggle() {
        if(extended) {
            m_piston.set(Value.kReverse);
        }
        else {
            m_piston.set(Value.kForward);
        }
        extended = !extended;
    }
}
