package frc.robot;

// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.


import edu.wpi.first.wpilibj.TimedRobot;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.cameraserver.CameraServer;
import edu.wpi.first.cscore.UsbCamera;
import edu.wpi.first.cscore.VideoMode;
import edu.wpi.first.networktables.NetworkTable;
import edu.wpi.first.wpilibj.DriverStation;
import edu.wpi.first.wpilibj.SerialPort;
//color stuff
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.CommandScheduler;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.util.Color;
import frc.robot.commands.Drive;
import frc.robot.commands.LimelightTrack;
import frc.robot.subsystems.CameraDaemon;


public class Robot extends TimedRobot {

	public static boolean emergencyDisabled = false;

	Command autonomousCommand;
	SendableChooser<Command> chooser = new SendableChooser<>();


	public static NetworkTable limelightTable;
	
	
	public static boolean auto;
	public static DriverStation driverStation;
	public static TalonSRX _talon;
	public static Color detectColor;

	public static IO io;

	public static Drive teleCommand;
	public static LimelightTrack autoCommand;

	@Override
	public void robotInit() {
		System.out.println("Started");
		Components.init();
		io = new IO();
		CameraDaemon.robotInit();
		teleCommand = new Drive();
		autoCommand = new LimelightTrack();
	}
	public void disabledInit() {

	}

	public void disabledPeriodic() {
		CommandScheduler.getInstance().run();
	}

	public void autonomousInit() {
		autoCommand.schedule();
	}

	public void autonomousPeriodic() {
		CommandScheduler.getInstance().run();
	}

	public void teleopInit() {
		teleCommand.schedule();
	}

	public void teleopPeriodic() {
		CommandScheduler.getInstance().run();	
	}

}