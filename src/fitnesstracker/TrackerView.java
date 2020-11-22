package fitnesstracker;

/**
 * ++Class Description++
 * @author Afnan Yousuf @ github.com/afnanyousuf
 */
public class TrackerView {
    public void printUpdate(FitnessTracker model){
       String pedData = Pedometer.APPNAME + model.getSteps();
       String monitorData = HeartRateMonitor.APPNAME + model.getPulse();
       System.out.println("Daily Report:");
       System.out.println(pedData);
       System.out.println(monitorData);
       
    }
}
