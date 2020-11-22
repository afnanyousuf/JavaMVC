/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fitnesstracker;

/**
 * @author Megha Patel
 * @author Afnan Yousuf / 991582761
 * FitnessTracker Model
 */
public class FitnessTracker implements HeartRateMonitor, Pedometer{
    
    private int pulse;
    private int steps;
    
    public FitnessTracker(){
        
    }
    
    @Override
    public void trackHeartRate() {
        this.pulse = 80;
    }

    @Override
    public void trackStepsTaken() {
        this.steps = 0;
    }

    public int getPulse() {
        return pulse;
    }

    public int getSteps() {
        return steps;
    }

    
    
}
