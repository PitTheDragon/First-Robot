package org.usfirst.frc.team4.robot;

import org.usfirst.frc.team4.robot.commands.ClimbForward;
import org.usfirst.frc.team4.robot.commands.ConveyorForward;
import org.usfirst.frc.team4.robot.commands.ConveyorReverse;
import org.usfirst.frc.team4.robot.commands.FuelIntakeForward;
import org.usfirst.frc.team4.robot.commands.ToggleDrive;
import org.usfirst.frc.team4.robot.commands.ToggleGearArm;

import edu.wpi.first.wpilibj.Joystick;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
	public OI() {
		ControllerConstants.driveA.whenPressed(new ToggleDrive());
		
		ControllerConstants.operatorLeftTrigger.whileHeld(new ConveyorForward());
		ControllerConstants.operatorRightTrigger.whileHeld(new ConveyorReverse());
		ControllerConstants.driveA.toggleWhenPressed(new FuelIntakeForward());
		
		ControllerConstants.operatorB.toggleWhenPressed(new FuelIntakeForward());
		ControllerConstants.operatorY.whenPressed(new ToggleGearArm());
		ControllerConstants.operatorStart.whileHeld(new ClimbForward());
	}
	public double driveLeftX(Joystick cont) {
		return cont.getRawAxis(ControllerConstants.AXIS_LEFT_X);
	}
	public double driveLeftY(Joystick cont) {
		return cont.getRawAxis(ControllerConstants.AXIS_LEFT_Y);
	}
	public double driveRightX(Joystick cont) {
		return cont.getRawAxis(ControllerConstants.AXIS_RIGHT_X);
	}
	public double driveRightY(Joystick cont) {
		return cont.getRawAxis(ControllerConstants.AXIS_RIGHT_Y);
	}
}
