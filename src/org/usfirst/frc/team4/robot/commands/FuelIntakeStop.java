package org.usfirst.frc.team4.robot.commands;

import org.usfirst.frc.team4.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class FuelIntakeStop extends Command {

    public FuelIntakeStop() {
        requires(Robot.fuelintake);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	Robot.fuelintake.motorOff();
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.fuelintake.motorOff();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	Robot.fuelintake.motorOff();
    }
}
