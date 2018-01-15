package org.usfirst.frc.team4.robot.subsystems;

import org.usfirst.frc.team4.robot.RobotMap;
import org.usfirst.frc.team4.robot.commands.ConveyorStop;

import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Conveyor extends Subsystem {

    private VictorSP motorUpper;
    private VictorSP motorLower;

    public boolean isConveyorRunning = false;
    
    public Conveyor() {
    	motorUpper = new VictorSP(RobotMap.CONVEYOR_MOTOR_UPPER);
    	motorLower = new VictorSP(RobotMap.CONVEYOR_MOTOR_LOWER);
    	
    	motorUpper.setInverted(true);
    	motorLower.setInverted(true);
    }
    
    public void initDefaultCommand() {
    	setDefaultCommand(new ConveyorStop()); 
    }
    public void upperForward() {
    	motorUpper.set(.8);
	}
    public void lowerForward() {
    	motorLower.set(.8);
    }
    public void upperReverse() {
    	motorUpper.set(-.8);
    }
    public void lowerReverse() {
    	motorLower.set(-1);
    }
    public void forward() {
    	upperForward();
    	lowerForward();
    }
    public void reverse() {
    	upperReverse();
    	lowerReverse();
    }
    public void upperStop() {
    	motorUpper.set(0);
    }
    public void lowerStop() {
    	motorLower.set(0);
    }
    public void stop() {
    	upperStop();
    	lowerStop();
    }
}

