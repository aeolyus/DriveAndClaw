package org.usfirst.frc.team2854.robot.subsystems;

import org.usfirst.frc.team2854.robot.commands.Grab;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Claw extends Subsystem {
	private DoubleSolenoid s;
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	
	private DoubleSolenoid punch;
	
	public Claw(DoubleSolenoid tempS, DoubleSolenoid punch) {
		s=tempS;
		this.punch = punch;
	}
	
	public void open() {
		System.out.println("Opening claw");
		s.set(DoubleSolenoid.Value.kForward);
	}
	
	public void close() {
		System.out.println("Closing claw");
		s.set(DoubleSolenoid.Value.kReverse);
	}
	
	public void toggleClaw() {
		if(s.get() == Value.kForward) {
			s.set(Value.kReverse);
		} else {
			s.set(Value.kForward);
		}
	}
	
	public void togglePunch() {
		if(punch.get() == Value.kForward) {
			punch.set(Value.kReverse);
		} else {
			punch.set(Value.kForward);
		}
	}

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
       // setDefaultCommand(new Grab());
    }
}

