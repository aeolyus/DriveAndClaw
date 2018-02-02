package org.usfirst.frc.team2854.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

import org.usfirst.frc.team2854.robot.commands.Grab;
import org.usfirst.frc.team2854.robot.commands.Open;
import org.usfirst.frc.team2854.robot.commands.Punch;
import org.usfirst.frc.team2854.robot.oi.Controller;


public class OI{
  public final Controller controller0;
  public final Controller controller1;

  public OI(){
    controller0 = new Controller(new Joystick(0), 0.05);
    controller1 = new Controller(new Joystick(1), 0.05);
    
    JoystickButton b = new JoystickButton(controller0.joystick, 2);
    JoystickButton a = new JoystickButton(controller0.joystick, 1);

    b.whenPressed(new Grab());
    a.whenPressed(new Punch());
  }
}