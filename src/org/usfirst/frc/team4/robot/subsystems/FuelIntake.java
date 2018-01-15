package org.usfirst.frc.team4.robot.subsystems;

import org.usfirst.frc.team4.robot.RobotMap;

import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class FuelIntake extends Subsystem {

   public VictorSP motor;
   
   public FuelIntake() {
	   motor = new VictorSP(RobotMap.FUEL_MOTOR_INTAKE);
   }

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    public void motorsOn() {
    	motor.set(1);
    }
    public void motorOff() {
    	motor.disable();
    }
}

