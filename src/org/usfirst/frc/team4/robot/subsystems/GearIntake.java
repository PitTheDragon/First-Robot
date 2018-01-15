package org.usfirst.frc.team4.robot.subsystems;

import org.usfirst.frc.team4.robot.RobotMap;
import org.usfirst.frc.team4.robot.commands.GearRollerAndArms;

import edu.wpi.first.wpilibj.AnalogPotentiometer;
import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 */
public class GearIntake extends Subsystem {

    public VictorSP armMotor;
    public VictorSP rollerMotor;
    
    public boolean autoIsIntakeUp = true;
    
    private AnalogPotentiometer armPot;
    
    public boolean areIntakeArmsUp = false;
    
    public GearIntake() {
    	armMotor = new VictorSP(RobotMap.GEAR_MOTOR_INTAKE_ARM);
    	rollerMotor = new VictorSP(RobotMap.GEAR_MOTOR_INTAKE_ROLLER);
    	
    	armPot = new AnalogPotentiometer(RobotMap.GEAR_MOTOR_INTAKE_ARM, 10);
    }
    

    public void initDefaultCommand() {
        setDefaultCommand(new GearRollerAndArms());
    }
    public void setArm(double speed) {
    	armMotor.set(speed);
    }
    public void setRollerSpeed(double speed) {
    	rollerMotor.set(speed);
    }
    public double getAngle() {
    	return armPot.get();
    }
    public void rollerStop() {
    	rollerMotor.disable();
    }
    public void armStop() {
    	armMotor.disable();
    }
    public double getArmPot() {
    	return armPot.get();
    }
    public void log() {
    	SmartDashboard.putNumber("IntakePot", getArmPot());
    }
}

