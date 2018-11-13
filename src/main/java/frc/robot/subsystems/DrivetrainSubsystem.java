/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.MecanumDrive;
import frc.robot.RobotMap;
import frc.robot.commands.ArcadeDriveForwardCommand;
import frc.robot.commands.DriveWithGamepadCommand;

/**
 * Add your docs here.
 */
public class DrivetrainSubsystem extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.

  WPI_VictorSPX motorFrontRight = new WPI_VictorSPX(RobotMap.MOTOR_PORT_FRONT_RIGHT);
	WPI_VictorSPX motorRearRight = new WPI_VictorSPX(RobotMap.MOTOR_PORT_REAR_RIGHT);
	WPI_VictorSPX motorFrontLeft = new WPI_VictorSPX(RobotMap.MOTOR_PORT_FRONT_LEFT);
  WPI_VictorSPX motorRearLeft = new WPI_VictorSPX(RobotMap.MOTOR_PORT_REAR_LEFT);
  
  MecanumDrive drivetrain;

  public double speedModifier;

  public DrivetrainSubsystem() {
    drivetrain = new MecanumDrive(motorFrontRight, motorRearRight, motorFrontLeft, motorRearLeft);
    speedModifier = 1;
  }

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    setDefaultCommand(new DriveWithGamepadCommand());
  }

  public void drive(double y, double x, double z) {
    drivetrain.driveCartesian(y, x, z);
  }

  public void stop() {
    drivetrain.driveCartesian(0, 0, 0);
  }
}
