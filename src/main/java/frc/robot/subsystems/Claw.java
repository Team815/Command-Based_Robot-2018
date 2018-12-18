/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;

import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;

/**
 * Add your docs here.
 */
public class Claw extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.

  WPI_VictorSPX rightRoller = new WPI_VictorSPX(RobotMap.ROLLER_MOTOR_PORT_RIGHT);
  WPI_VictorSPX leftRoller = new WPI_VictorSPX(RobotMap.ROLLER_MOTOR_PORT_LEFT);

  public void rollForward (){
    rightRoller.set(.5);
    leftRoller.set(.5);
  }
 
  public void stopRollers(){
    rightRoller.set(0);
    leftRoller.set(0);
  }


  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }
}
