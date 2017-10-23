package org.usfirst.frc.team4.robot.subsystems;

import org.usfirst.frc.team4.robot.RobotMap;

import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Climber extends Subsystem {
	
	private VictorSP motorFront;
	private VictorSP motorRear;
	
    public Climber() {
    	motorFront = new VictorSP(RobotMap.CLIMBER_MOTOR_FRONT);
    	motorRear = new VictorSP(RobotMap.CLIMBER_MOTOR_FRONT);
   
    }

    public void initDefaultCommand() {
    	//setDefaultCommand(new MySpecialCommand());
    }
    public void winchForward(){
    	motorFront.set(-0.75);
    	motorRear.set(-0.75);
    }
    public void winchReverse(){
    	motorFront.set(0.75);
    	motorRear.set(0.75);
    }
    public void winchOff(){
    	motorFront.set(0);
    	motorRear.set(0);
    }
}