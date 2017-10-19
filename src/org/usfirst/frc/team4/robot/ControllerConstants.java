package org.usfirst.frc.team4.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

public class ControllerConstants {
	public static final int CONTROL_DRIVE = 0;
	public static final int CONTROL_OPERATOR = 1;

	public static final int BUTTON_A = 1;
	public static final int BUTTON_B = 2;
	public static final int BUTTON_Y = 4;
	public static final int BUTTON_X = 3;

	public static final int BUMPER_RIGHT = 6;
	public static final int BUMPER_LEFT = 5;

	public static final int TRIGGER_RIGHT = 3;
	public static final int TRIGGER_LEFT = 2;

	public static final int BUTTON_START = 8;
	public static final int BUTTON_SELECT = 7;

	public static final int BUTTON_STICK_LEFT = 9;
	public static final int BUTTON_STICK_RIGHT = 10;
	
	
	// AXISIES
	public static final int AXIS_LEFT_Y = 1;
	public static final int AXIS_LEFT_X = 0;

	public static final int AXIS_RIGHT_Y = 5;
	public static final int AXIS_RIGHT_X = 4;

	public static final int POV_TOP = 0;
	public static final int POV_BOT = 180;

	public static final int POV_LEFT = 270;
	public static final int POV_RIGHT = 90;

	// Drive
	public static Joystick joystickdrive;

	public static JoystickButton driveA;
	public static JoystickButton driveB;
	public static JoystickButton driveY;
	public static JoystickButton driveX;
	
	public static JoystickButton driveRightBumper;
	public static JoystickButton driveLeftBumper;
	public static JoystickButton driveRightTrigger;
	public static JoystickButton driveLeftTrigger;
	
	public static JoystickButton driveLeftStick;
	public static JoystickButton driveRightStick;
	
	public static JoystickButton driveStart;
	public static JoystickButton driveSelect;
	
	public static JoystickButton drivePovTop;
	public static JoystickButton drivePovBot;
	public static JoystickButton drivePovLeft;
	public static JoystickButton drivePovRight;
	
	//operator
	public static Joystick joystickoperator;

	public static JoystickButton operatorA;
	public static JoystickButton operatorB;
	public static JoystickButton operatorY;
	public static JoystickButton operatorX;
	
	public static JoystickButton operatorRightBumper;
	public static JoystickButton operatorLeftBumper;
	public static JoystickButton operatorRightTrigger;
	public static JoystickButton operatorLeftTrigger;
	
	public static JoystickButton operatorLeftStick;
	public static JoystickButton operatorRightStick;
	
	public static JoystickButton operatorStart;
	public static JoystickButton operatorSelect;
	
	public static JoystickButton operatorPovTop;
	public static JoystickButton operatorPovBot;
	public static JoystickButton operatorPovLeft;
	public static JoystickButton operatorPovRight;
	
	public static void init() {
	//drive controller
		joystickdrive = new Joystick(CONTROL_DRIVE);
		
		driveA = new JoystickButton(joystickdrive, BUTTON_A);
		driveB = new JoystickButton(joystickdrive, BUTTON_B);
		driveY = new JoystickButton(joystickdrive, BUTTON_Y);
		driveX = new JoystickButton(joystickdrive, BUTTON_X);
		
		
		driveRightBumper = new JoystickButton(joystickdrive, BUMPER_RIGHT);
		driveLeftBumper = new JoystickButton(joystickdrive, BUMPER_LEFT);
		driveRightTrigger = new JoystickButton(joystickdrive, BUMPER_RIGHT);
		driveLeftTrigger = new JoystickButton(joystickdrive, BUMPER_LEFT);
		
		driveLeftStick = new JoystickButton(joystickdrive, BUTTON_STICK_LEFT);
		driveRightStick = new JoystickButton(joystickdrive, BUTTON_STICK_RIGHT);
		
		driveStart = new JoystickButton(joystickdrive, BUTTON_START);
		driveSelect = new JoystickButton(joystickdrive, BUTTON_SELECT);
		
		drivePovTop = new JoystickButton(joystickdrive, POV_TOP);
		drivePovBot = new JoystickButton(joystickdrive, POV_BOT);
		drivePovLeft = new JoystickButton(joystickdrive, POV_LEFT);
		drivePovRight = new JoystickButton(joystickdrive, POV_RIGHT);
		
		
		//operator controller
		joystickoperator = new Joystick(CONTROL_OPERATOR);
		
		operatorA = new JoystickButton(joystickoperator, BUTTON_A);
		operatorB = new JoystickButton(joystickoperator, BUTTON_B);
		operatorY = new JoystickButton(joystickoperator, BUTTON_Y);
		operatorX = new JoystickButton(joystickoperator, BUTTON_X);
		
		operatorRightBumper = new JoystickButton(joystickoperator, BUMPER_RIGHT);
		operatorLeftBumper = new JoystickButton(joystickoperator, BUMPER_LEFT);
		operatorRightTrigger = new JoystickButton(joystickoperator, BUMPER_RIGHT);
		operatorLeftTrigger = new JoystickButton(joystickoperator, BUMPER_LEFT);
		
		operatorLeftStick = new JoystickButton(joystickoperator, BUTTON_STICK_LEFT);
		operatorRightStick = new JoystickButton(joystickoperator, BUTTON_STICK_RIGHT);
		
		operatorSelect = new JoystickButton(joystickoperator, BUTTON_SELECT);
		
		operatorPovTop = new JoystickButton(joystickoperator, POV_TOP);
		operatorPovBot = new JoystickButton(joystickoperator, POV_BOT);
		operatorPovLeft = new JoystickButton(joystickoperator, POV_LEFT);
		operatorPovRight = new JoystickButton(joystickoperator, POV_RIGHT);
		
	}
	
}
