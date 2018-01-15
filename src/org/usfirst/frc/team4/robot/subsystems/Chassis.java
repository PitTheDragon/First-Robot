 package org.usfirst.frc.team4.robot.subsystems;

import org.usfirst.frc.team4.robot.RobotMap;
import org.usfirst.frc.team4.robot.commands.Drive;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj.command.Subsystem;


public class Chassis extends Subsystem {
	private VictorSP leftFrontMotor;
	private VictorSP leftBackMotor;
	private VictorSP rightFrontMotor;
	private VictorSP rightBackMotor;
	
	
	RobotDrive driveController;
  
	
	public boolean isArcadeDrive = true;
    
	@SuppressWarnings("deprecation")
	public Chassis() {
		leftFrontMotor = new VictorSP(RobotMap.CHASSIS_MOTOR_LEFT_FRONT);
		leftBackMotor = new VictorSP(RobotMap.CHASSIS_MOTOR_LEFT_REAR);
		rightFrontMotor = new VictorSP(RobotMap.CHASSIS_MOTOR_RIGHT_FRONT);
		rightBackMotor = new VictorSP(RobotMap.CHASSIS_MOTOR_RIGHT_REAR);
		
		driveController = new RobotDrive(leftFrontMotor, leftBackMotor, rightFrontMotor, rightBackMotor);
	}
	@SuppressWarnings("deprecation")
	public void initDefaultCommand() {
        setDefaultCommand(new Drive());
        driveController = new RobotDrive(leftFrontMotor, leftBackMotor, rightFrontMotor, rightBackMotor);
   
	}
	public void tankDrive(double left, double right) {
		driveController.tankDrive(left, right, true);
	}
	public void arcadeDrive(double moveValue, double rotateValue) {
		driveController.arcadeDrive(moveValue, (-rotateValue * .85), true);
	}
}

