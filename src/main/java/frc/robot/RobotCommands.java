package frc.robot;
import com.revrobotics.spark.SparkLowLevel.MotorType;
import edu.wpi.first.wpilibj.XboxController;
import com.revrobotics.spark.SparkFlex;
import frc.robot.Constants.ClawConstants;
import frc.robot.Constants.OIConstants;
public class RobotCommands { // Class that holds robot commands involing the claw elevator and sweeper
        SparkFlex lMotor = new SparkFlex(ClawConstants.clawMotor1, MotorType.kBrushless);
        SparkFlex rMotor = new SparkFlex(ClawConstants.clawMotor2, MotorType.kBrushless);
        // Motor and Controller declaration.
        XboxController pilot = new XboxController(OIConstants.kDriverControllerPort);
        XboxController copilot = new XboxController(1);
    private void Controllers(){
        if (pilot.getAButtonPressed() || pilot.getBButtonPressed()) {
            while(pilot.getAButtonPressed()){
                clawForward();
            }
            while(pilot.getBButtonPressed()){
                clawReverse();

            }
            clawStop();
        }
        
        
        
        


    }
    private void clawForward(){
        // Claw Functionality 
        // Claw Constants 
        //clawMotor1 - First Motor on Claw
        //clawMotor2 - Second motor on Claw
        //kPneumaticsModuleCanId - Pneumatics Setup
        //kForwardChannel - Pneumatics Forward
        //kReverseChannel - Pneumatics Reverse
        //kMaxPressure - Pneumatics Max Pressure
        //kMinPressure - Pneumatics min Pressure 
        //kMaxRotationClawSpeed - Motor Max Rotation speed for Claw Motors
        lMotor.set(ClawConstants.kMaxRotationClawSpeed);
        rMotor.set(ClawConstants.kMaxRotationClawSpeed);
    }
    private void clawReverse(){
        lMotor.set(-ClawConstants.kMaxRotationClawSpeed);
        rMotor.set(-ClawConstants.kMaxRotationClawSpeed);
    }
    private void clawStop(){
        lMotor.stopMotor();
        rMotor.stopMotor();
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
