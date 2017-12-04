package org.usfirst.frc.team5822.robot.commands;


import org.usfirst.frc.team5822.robot.Robot;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class JBDrive extends Command 
{

	
	Timer timer;
	
    public JBDrive() 
    {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    		requires(Robot.hiih);
    		timer = new Timer();
    }

    // Called just before this Command runs the first time
    protected void initialize() 
    {
    		timer.start();
    		System.out.println("DriveForward");
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() 
    {
    		Robot.hiih.driveForward();
    		
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() 
    {
    		if(timer.get()<1)
    		{
    			return false;
    		}
    		else
    		{
    			return true;
    		}
        
        
    }

    // Called once after isFinished returns true
    protected void end() 
    {
    		
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() 
    {
    		
    }
}
