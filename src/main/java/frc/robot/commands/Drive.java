package frc.robot.commands;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

import com.ctre.phoenix.motorcontrol.ControlMode;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Components;
import frc.robot.Constants;
import frc.robot.IO;


public class Drive extends CommandBase {
	DatagramPacket dataPacket;
	DatagramSocket dataSocket;
	
	boolean reverse = false;

	public Drive() {
		addRequirements(Components.chassis);
	}

	public void execute(){
	
		double leftPower;
		double rightPower;

		double xboxLX = Math.abs(IO.xboxDrive.getLeftX()) * IO.xboxDrive.getLeftX();
		double xboxRightTrigger = Math.abs(IO.xboxDrive.getRightTriggerAxis()) * IO.xboxDrive.getRightTriggerAxis();
		double xboxLeftTrigger = Math.abs(IO.xboxDrive.getLeftTriggerAxis()) * IO.xboxDrive.getLeftTriggerAxis();
			
		rightPower = xboxRightTrigger - xboxLeftTrigger - xboxLX;
		leftPower = xboxRightTrigger - xboxLeftTrigger + xboxLX;

		Components.motorR1.set(ControlMode.PercentOutput, Constants.Drive.slowModifier*rightPower);
		Components.motorR2.set(ControlMode.PercentOutput, Constants.Drive.slowModifier*rightPower);
		Components.motorR3.set(ControlMode.PercentOutput, Constants.Drive.slowModifier*rightPower);
		Components.motorL1.set(ControlMode.PercentOutput, Constants.Drive.slowModifier*leftPower);
		Components.motorL2.set(ControlMode.PercentOutput, Constants.Drive.slowModifier*leftPower);
		Components.motorL3.set(ControlMode.PercentOutput, Constants.Drive.slowModifier*leftPower);

		}
	@Override
	public void initialize() {
	}
	@Override
	public boolean isFinished() {
		return false;
	}

	protected void end() {
	}

	protected void interrupted() {
	}
}
