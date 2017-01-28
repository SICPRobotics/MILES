package org.usfirst.frc.team5822.robot.subsystems;

import org.usfirst.frc.team5822.robot.commands.DriveForTime;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class DriveTrain extends Subsystem 
{

	private static RobotDrive drive;

	public DriveTrain()
	{
		drive = new RobotDrive(0,1,2,3);
	}
	
    public void initDefaultCommand() 
    {
    	setDefaultCommand(new DriveForTime());
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public static void drive()
    {
    	drive.drive(-0.15, 0);
    }
}

