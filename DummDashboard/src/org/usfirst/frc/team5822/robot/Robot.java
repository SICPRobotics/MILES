package org.usfirst.frc.team5822.robot;



import edu.wpi.first.wpilibj.ADXRS450_Gyro;

import edu.wpi.first.wpilibj.AnalogInput;

import edu.wpi.first.wpilibj.IterativeRobot;

import edu.wpi.first.wpilibj.Joystick;

import edu.wpi.first.wpilibj.RobotDrive;

import edu.wpi.first.wpilibj.Timer;

import edu.wpi.first.wpilibj.livewindow.LiveWindow;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

import edu.wpi.cscore.UsbCamera;

import edu.wpi.cscore.VideoSource;

import edu.wpi.first.wpilibj.CameraServer;

/**

 * The VM is configured to automatically run this class, and to call the

 * functions corresponding to each mode, as described in the IterativeRobot

 * documentation. If you change the name of this class or the package after

 * creating this project, you must also update the manifest file in the resource

 * directory.

 */

public class Robot extends IterativeRobot {

RobotDrive myRobot = new RobotDrive(0, 1);

Joystick stick = new Joystick(0);

Timer timer = new Timer();

SmartDashboard smartMiles= new SmartDashboard();

ADXRS450_Gyro fireball = new ADXRS450_Gyro();

AnalogInput angelogBOO = new AnalogInput(1);

double chuurgge; //Distance From Gear

double angleOff; // Angle Off Gear

Boolean goodShotVD = false; //Good shooting position of vision is disabled

Boolean goodShotD = false; //Good shooting position using distance




/**

* This function is run when the robot is first started up and should be

* used for any initialization code.

*/

@Override

public void robotInit() 

{

UsbCamera eyeseeyou0 = CameraServer.getInstance().startAutomaticCapture(0);

eyeseeyou0.setResolution(320,240);


UsbCamera eyeseeyou1 = CameraServer.getInstance().startAutomaticCapture(1);

eyeseeyou1.setResolution(320,240);





}



/**

* This function is run once each time the robot enters autonomous mode

*/

@Override

public void autonomousInit() {

timer.reset();

timer.start();

fireball.reset();

}



/**

* This function is called periodically during autonomous

*/

@Override

public void autonomousPeriodic() {

// Drive for 2 seconds

double voltage = angelogBOO.getAverageVoltage(); // reads the range on the ultrasonic sensor

double sensitivity = 10;

double range = voltage * sensitivity * 4.1898; //4.1898 from excel equation



double shotOf = fireball.getAngle();




smartMiles.putNumber("BAC/Gyro" , shotOf);

smartMiles.putNumber("Echolocation", range);

smartMiles.putNumber("Distance From Gear", chuurgge);

smartMiles.putNumber("Angle Off Gear", angleOff);

if(goodShotVD = true)

{

smartMiles.putString("Good angle to shoot (Vision Disabled):", "SHOOT, FOLLOW YOUR DREAMS, SPEW THAT FUEL");

}

if(goodShotD = true)

{

smartMiles.putString("Good angle to shoot (Distance):", "SHOOT, FOLLOW YOUR DREAMS, SPEW THAT FUEL");

}

}



/**

* This function is called once each time the robot enters tele-operated

* mode

*/

@Override


public void teleopInit() 

{

fireball.reset();

}



/**

* This function is called periodically during operator control

*/

@Override

public void teleopPeriodic() 

{

double voltage = angelogBOO.getAverageVoltage(); // reads the range on the ultrasonic sensor

double sensitivity = 10;

double range = voltage * sensitivity * 4.1898; //4.1898 from excel equation



double shotOf = fireball.getAngle();




smartMiles.putNumber("BAC/Gyro" , shotOf);

smartMiles.putNumber("Echolocation", range);

smartMiles.putNumber("Distance From Gear", chuurgge);

smartMiles.putNumber("Angle Off Gear", angleOff);

if(goodShotVD = true)

{

smartMiles.putString("Good angle to shoot (Vision Disabled):", "SHOOT, FOLLOW YOUR DREAMS, SPEW THAT FUEL");

}

if(goodShotD = true)

{

smartMiles.putString("Good angle to shoot (Distance):", "SHOOT, FOLLOW YOUR DREAMS, SPEW THAT FUEL");

}

}




/**

* This function is called periodically during test mode

*/

@Override

public void testPeriodic() {

LiveWindow.run();

}

}