package org.usfirst.frc.team2854.robot.commands;

import org.usfirst.frc.team2854.robot.Robot;
import org.usfirst.frc.team2854.robot.oi.Button;
import org.usfirst.frc.team2854.robot.subsystems.Claw;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class Grab extends Command {

	private Claw claw;
	private Button button;
	private boolean flag;
    public Grab() {

    	flag=true;
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(Robot.getClaw());
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	claw = Robot.getClaw();

    	claw.toggleClaw();
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() { 	
//    	boolean toggle=true;
//    	boolean grab = false;
//    	if(toggle&&button.get()) {//execute once per button push
//    		toggle=false;//prevents code from being called again until button is released and pressed again
//    		if(grab){
//    			grab=false;
//    			claw.open();
//    		}else {
//    			grab=true;
//    			claw.close();
//    		}
//    	}else if(!button.get()) {
//    		toggle=true;//button has been released
//    	}
    	System.out.println("running grab");
    	//claw.close();
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return true;
    }

    // Called once after isFinished returns true
    protected void end() {
    	//claw.close();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	claw.close();
    }
}
