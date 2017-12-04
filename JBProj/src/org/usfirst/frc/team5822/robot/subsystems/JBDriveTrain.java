package org.usfirst.frc.team5822.robot.subsystems;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class JBDriveTrain extends Subsystem 
{
	public static RobotDrive jack; 
	/*CANTalon motor1;
	CANTalon motor2;
	CANTalon motor3;
	CANTalon motor4;*/
		
	

	
	public JBDriveTrain()
	{
		jack = new RobotDrive(0, 1, 2, 3);
		/*motor1 = new CANTalon(0);
		motor2 = new CANTalon(1);
		motor3 = new CANTalon(2);
		motor4 = new CANTalon(3);*/
	}
	
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() 
    {
    		
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public void driveForward()
    {
    		jack.drive(0.15, 0);
    }
    
    public void turnLeft()
    {
    		jack.setLeftRightMotorOutputs(-0.22, 0.22);
    }
    
}

