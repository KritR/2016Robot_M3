package org.usfirst.frc.team4213.systems;

import org.usfirst.frc.team4213.robot.RobotMap.Turret.Pitch_Motor;
import org.usfirst.frc.team4213.robot.RobotMap.Turret.Yaw_Motor;

import edu.wpi.first.wpilibj.AnalogPotentiometer;
import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.interfaces.Potentiometer;

public class Turret {
	private static CANTalon pitchMotor;
	private static CANTalon yawMotor;
	private static Potentiometer stringPot;

	public Turret() {
		pitchMotor = new CANTalon(Pitch_Motor.MOTOR_CHANNEL);
		yawMotor = new CANTalon(Yaw_Motor.MOTOR_CHANNEL);
		stringPot = new AnalogPotentiometer(Yaw_Motor.STRING_POT);
	}

	public void setPitchSpeed(double speed) {
		pitchMotor.set(speed);
	}

	public void setYawSpeed(double speed) {
		yawMotor.set(speed);
	}

	public double getPotentiometerRead() {
		return stringPot.get();
	}

	public double getPitchEnc() {
		return pitchMotor.getEncPosition();
	}
}
