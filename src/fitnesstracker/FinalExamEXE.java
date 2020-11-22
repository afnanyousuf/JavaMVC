package fitnesstracker;

/**
 * ++EXAMPartC MVC implementation++
 * @author Afnan Yousuf @ github.com/afnanyousuf
 */
public class FinalExamEXE {
    public static void main(String[] args) {
        FitnessTracker model=createTracker();
        TrackerView view=new TrackerView();
        TrackerController controller=new TrackerController(model,view);
        controller.updateModel();
        controller.updateView();
        
    }

    
    private static FitnessTracker createTracker(){
        FitnessTracker fitByte= new FitnessTracker();
        return fitByte;
        
    }
}
