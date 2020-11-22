/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fitnesstracker;

/**
 * An interface to implement that counts how many steps a person takes
 * @author Megha Patel
 * @author Afnan Yousuf
 */
interface Pedometer 
{
    public String APPNAME = "Steps taken: ";
    /**
     * A method that tracks 
     * the number of steps taken
     */
    public void trackStepsTaken();
   
}
