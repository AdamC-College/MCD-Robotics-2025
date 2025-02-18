package frc.robot;
import com.revrobotics.spark.SparkLowLevel.MotorType;
import com.revrobotics.spark.config.SparkFlexConfig;
import com.revrobotics.spark.config.SparkFlexConfigAccessor;

import edu.wpi.first.wpilibj.XboxController;

import com.revrobotics.sim.SparkFlexSim;
import com.revrobotics.spark.SparkFlex;
import com.revrobotics.spark.SparkLowLevel;

import frc.robot.Constants.ClawConstants;
public class RobotCommands { // Class that holds robot commands involing the claw elevator and sweeper
    private void Controllers(){
        XboxController pilot = new XboxController(0);
        XboxController copilot = new XboxController(1);
        pilot.getAButtonPressed();
        


    }
    private void claw(){ // Claw Functionality 
        
                // Claw Constants 
                //clawMotor1 - First Motor on Claw
                //clawMotor2 - Second motor on Claw
                //kPneumaticsModuleCanId - Pneumatics Setup
                //kForwardChannel - Pneumatics Forward
                //kReverseChannel - Pneumatics Reverse
                //kMaxPressure - Pneumatics Max Pressure
                //kMinPressure - Pneumatics min Pressure 
                //kMaxRotationClawSpeed - Motor Max Rotation speed for Claw Motors
       
        




        

    }
    private void elevator(){ // Elevator Functionality
        //Elvator Constants
        
        // orginalPos - starting position for elevator
        // pos1 - base level coral position
        // pos2 - level 2
        
        // pos3 - level 3
        // pos4 - level 4
    
    }
    private void sweeper(){
        // TODO Create Sweeper Constants
    }
}
