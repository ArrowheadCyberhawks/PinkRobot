package frc.robot.subsystems;

import edu.wpi.first.cameraserver.CameraServer;
import edu.wpi.first.cscore.UsbCamera;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public final class CameraDaemon extends SubsystemBase {
    public static UsbCamera cam1;
    public static UsbCamera cam2;

    
    public static void robotInit() {
        //cam1 = CameraServer.startAutomaticCapture(0);
        //cam2 = CameraServer.startAutomaticCapture(1);
      }
	public void initDefaultCommand() {
	}

	public void periodic() {
        //Add stuff for manipulating cameras here
	}

}
