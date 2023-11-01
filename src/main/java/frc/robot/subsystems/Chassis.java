package frc.robot.subsystems;

import com.kauailabs.navx.frc.AHRS;

import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Components;
import frc.robot.Robot;


public class Chassis extends SubsystemBase {


	
	public void initDefaultCommand() {
	}

	int valuesAdded = 0;
	double gyroTotal = 0;
	int totalValues = 10;
	
	public double extendOffset = 0;
    public double rotationOffset = 0;

	public void periodic() {
			
	}
 
	public double previousAngle = 0;

	public void zeroAllMotors() {

	}
	public void Drive(double leftSpeed, double rightSpeed) {
		
	}

	public void ShootyShoot(double leftSpeed, double rightSpeed){

	}
}
