package org.usfirst.frc.team4213.robot;

public final class RobotMap {

	public static final boolean MANUAL_MODE = true;

	public final class Drivetrain {
		public static final int LEFT_MOTOR = 8;
		public static final int RIGHT_MOTOR = 9;
		public static final double SPRINT_SPEED = 1;
		public static final double NORMAL_SPEED = 0.6;
		public static final double CRAWL_SPEED = 0.4;
	}

	public final class Turret {
		public final class Yaw_Motor {
			public static final int MOTOR_CHANNEL = 1;
			public static final int STRING_POT = 0;
			public static final int LIMIT_SWITCH = 8;
			public static final int OFFSET = 0;
			public static final int START_COUNT = 500 + OFFSET;
			public static final int MIN_COUNT = 400 + OFFSET;
			public static final int MAX_COUNT = 600 + OFFSET;
			private static final int COUNT_PER_DEG = 100 / 360;

		}

		public final class Pitch_Motor {
			public static final int MOTOR_CHANNEL = 3;
			private static final int GEARSGR = 3;
			private static final int PLANETARYGR = 71;
			private static final int PPR = 5; // Keep Track of this. This may
												// not be accurate.
			public static final int COUNT_PER_DEG = (GEARSGR * PLANETARYGR * PPR) / 360;
		}

	}

	// Probably need to Add More Here.
	public final class Intake {
		public static final int MOTOR_CHANNEL = 2;
	}

	public final class Shooter {
		public static final int FLYWHEEL_CHANNEL = 3;
		public static final int CAM_CHANNEL = 0;
		public static final int ENC_CH_A = 4;
		public static final int ENC_CH_B = 5;
		private static final int GEARSGR = 3;
		private static final int PLANETARYGR = 27;
		private static final int PPR = 5; // Potentially need to Change
		public static final int COUNT_PER_DEG = (GEARSGR * PLANETARYGR * PPR) / 360;

	}
}
