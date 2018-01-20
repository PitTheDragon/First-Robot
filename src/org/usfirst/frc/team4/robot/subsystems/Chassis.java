 package org.usfirst.frc.team4.robot.subsystems;

import org.usfirst.frc.team4.robot.RobotMap;
import org.usfirst.frc.team4.robot.commands.Drive;

import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;


public class Chassis extends Subsystem {
	private VictorSP leftFrontMotor;
	private VictorSP leftBackMotor;
	private VictorSP rightFrontMotor;
	private VictorSP rightBackMotor;
	
	
	DifferentialDrive driveController;
  
	SpeedControllerGroup leftMotors;
	SpeedControllerGroup rightMotors;
	
	public boolean isArcadeDrive = true;
    
	@SuppressWarnings("deprecation")
	public Chassis() {
		leftFrontMotor = new VictorSP(RobotMap.CHASSIS_MOTOR_LEFT_FRONT);
		leftBackMotor = new VictorSP(RobotMap.CHASSIS_MOTOR_LEFT_REAR);
		rightFrontMotor = new VictorSP(RobotMap.CHASSIS_MOTOR_RIGHT_FRONT);
		rightBackMotor = new VictorSP(RobotMap.CHASSIS_MOTOR_RIGHT_REAR);
		leftMotors = new SpeedControllerGroup(leftFrontMotor, leftBackMotor);
		rightMotors = new SpeedControllerGroup(rightFrontMotor, rightBackMotor);
		
		
		driveController = new DifferentialDrive(leftMotors, rightMotors);
	
		
	}
	public void initDefaultCommand() {
        setDefaultCommand(new Drive());
        driveController = new DifferentialDrive(leftMotors, rightMotors);
   
	}
	public void tankDrive(double left, double right) {
		driveController.tankDrive(left, right, true);
	}
	public void arcadeDrive(double moveValue, double rotateValue) {
		driveController.arcadeDrive(moveValue, (-rotateValue * .85), true);
	}
}

