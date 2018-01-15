package org.usfirst.frc.team4.robot.commands;

import org.usfirst.frc.team4.robot.ControllerConstants;
import org.usfirst.frc.team4.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class Drive extends Command {

    public Drive() {
        requires(Robot.chassis);
       
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }
   
    
    protected void execute() {
    if(Robot.chassis.isArcadeDrive) {
    	Robot.chassis.arcadeDrive(
    							 -Robot.oi.driveLeftY(ControllerConstants.joystickdrive),
    							 Robot.oi.driveRightX(ControllerConstants.joystickdrive));
    }else {
    	Robot.chassis.tankDrive(
    							 Robot.oi.driveLeftY(ControllerConstants.joystickdrive),
    							 Robot.oi.driveRightY(ControllerConstants.joystickdrive));
    }
    	
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
