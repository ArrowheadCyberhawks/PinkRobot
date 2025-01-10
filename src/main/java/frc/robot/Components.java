package frc.robot;

import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj.motorcontrol.Spark;
import frc.robot.commands.Drive;
import frc.robot.commands.LimelightTrack;



public class Components {

    public static Drive drive;
	public static LimelightTrack limelightTrack;
    public static TalonSRX motorR1;
    public static TalonSRX motorR2;
    public static TalonSRX motorR3;
    public static TalonSRX motorL1;
    public static TalonSRX motorL2;
    public static TalonSRX motorL3;

    public static void init(){
        motorL1 = new TalonSRX(7);
        motorL2 = new TalonSRX(6);
        motorL3 = new TalonSRX(2);
        motorR1 = new TalonSRX(9);
        motorR2 = new TalonSRX(10);
        motorR3 = new TalonSRX(11);
        motorR1.setInverted(true);
        motorR2.setInverted(true);
        motorR3.setInverted(true);
    } 
    

}
