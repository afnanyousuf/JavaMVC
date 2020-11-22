/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fitnesstracker;

/**
 * An interface to implement that monitors the pulse rate
 * and reports its data over time
 * @author Megha Patel,2020
 * @author Afnan Yousuf
 */
interface HeartRateMonitor 
{
    public String APPNAME = "average heart rate: ";
    
    /*
    Method that tracks heartRate
    */
    
    public void trackHeartRate();
}
