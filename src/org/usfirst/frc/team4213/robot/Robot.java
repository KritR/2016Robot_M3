
package org.usfirst.frc.team4213.robot;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.team4213.lib14.CowCamController;
import org.team4213.lib14.CowCamServer;
import org.usfirst.frc.team4213.robot.RobotMap.Drivetrain;
import org.usfirst.frc.team4213.robot.RobotMap.Intake;
import org.usfirst.frc.team4213.robot.RobotMap.Shooter;
import org.usfirst.frc.team4213.robot.RobotMap.Turret;

import edu.wpi.first.wpilibj.IterativeRobot;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the IterativeRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 */
public class Robot extends IterativeRobot {

	public Intake intake;
	public Drivetrain drive;
	public Shooter shooter;
	public Turret turret;

	// Camera Controller
	public static CowCamServer camServer;
	// The Thread Pool / Executor of Tasks to Use
	public ExecutorService executor;
	// A new Camera Controller for the Shooter
	public CowCamController shooterCamController;

	// The Task Run to Handle the Shooter Camera ( Aim at Tower )

	/*
	 * We added the OpenCV libraries to the RoboRIO manually over FTP ( Specific
	 * Builds for the Roborio / ARMV7 )
	 */
	static {
		// Loads the OpenCV Library from The RoboRIO's Local Lib Directory
		System.load("/usr/local/lib/lib_OpenCV/java/libopencv_java2410.so");
	}

	/**
	 * This function is run when the robot is first started up and should be
	 * used for any initialization code.
	 */
	@Override
	public void robotInit() {
		// Camera Stuff
		camServer = new CowCamServer(1180);
		executor = Executors.newWorkStealingPool();
		shooterCamController = new CowCamController(0, 20, CowCamController.ImageTask.SHOOTER);
		camServer.start(shooterCamController, executor);

	}

	/**
	 * This autonomous (along with the chooser code above) shows how to select
	 * between different autonomous modes using the dashboard. The sendable
	 * chooser code works with the Java SmartDashboard. If you prefer the
	 * LabVIEW Dashboard, remove all of the chooser code and uncomment the
	 * getString line to get the auto name from the text box below the Gyro
	 *
	 * You can add additional auto modes by adding additional comparisons to the
	 * switch structure below with additional strings. If using the
	 * SendableChooser make sure to add them to the chooser code above as well.
	 */
	@Override
	public void autonomousInit() {

	}

	/**
	 * This function is called periodically during autonomous
	 */
	@Override
	public void autonomousPeriodic() {
	}

	/**
	 * This function is called periodically during operator control
	 */
	@Override
	public void teleopPeriodic() {
		if (RobotMap.MANUAL_MODE) {
			manualControl();
		} else {
			assistedControl();
		}
	}

	/**
	 * This function is called periodically during test mode
	 */
	@Override
	public void testPeriodic() {

	}

	public void manualControl() {
		// Insert Manual Control Code Here.
	}

	public void assistedControl() {
		// Insert Assisted Control Code Here
	}

}
