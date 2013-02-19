// RobotBuilder Version: 0.0.2
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in th future.
package org.usfirst.frc2130.MockBoard.subsystems;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Relay;
import edu.wpi.first.wpilibj.SpeedController;
import org.usfirst.frc2130.MockBoard.RobotMap;
import org.usfirst.frc2130.MockBoard.commands.*;
import edu.wpi.first.wpilibj.command.Subsystem;
import org.usfirst.frc2130.MockBoard.Robot;
/**
 *
 */
public class ProximitySubsystem extends Subsystem {
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    DigitalInput feederProxDigitalInput = RobotMap.proximitySubsystemfeederProxDigitalInput;
    Relay feederWindowMotorSpike = RobotMap.proximitySubsystemfeederWindowMotorSpike;
    SpeedController frisbeeRetrievalTalon = RobotMap.proximitySubsystemfrisbeeRetrievalTalon;
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    
    SpeedController cannonWheelTalon = RobotMap.cannonWheelPIDSubsystemCannonWheelTalon;
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    public void initDefaultCommand() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND
	
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    public void runFeederWindowMotor() {
        feederWindowMotorSpike.set(Relay.Value.kForward);
    }
    public void stopFeederWindowMotor() {
        feederWindowMotorSpike.set(Relay.Value.kOff);
    }
    public boolean feederProxActive() {
        return !feederProxDigitalInput.get();
    }
    public void runFrisbeeRetrieval() {
        frisbeeRetrievalTalon.set(.5);
    }
    public void runFrisbeeRetrievalReverse() {
        frisbeeRetrievalTalon.set(-0.5);
    }
    public void stopFrisbeeRetrieval() {
        frisbeeRetrievalTalon.disable();
    }
    public boolean returnDriveStick1TriggerInverse() {
        return !Robot.oi.driveStick1.getTrigger();
    }
    public boolean returnDriveStick2TriggerInverse() {
        return !Robot.oi.driveStick2.getTrigger();
    }
    public boolean returnGameControllerButton5Inverse() {
        return !Robot.oi.gameController.getRawButton(5);
    }
}
