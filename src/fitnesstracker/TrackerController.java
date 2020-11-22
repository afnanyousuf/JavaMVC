package fitnesstracker;

/**
 * ++Fitness Tracker Controller++
 * @author Afnan Yousuf @ github.com/afnanyousuf
 */
public class TrackerController {
    private FitnessTracker model;
    private TrackerView view;

    public TrackerController(FitnessTracker model, TrackerView view) {
        this.model = model;
        this.view = view;
    }
    
    public void updateView(){
       view.printUpdate(model);
    }
    
    public void updateModel(){
        model.trackHeartRate();
        model.trackStepsTaken();
    }
    
    

    public FitnessTracker getModel() {
        return model;
    }

    public void setModel(FitnessTracker model) {
        this.model = model;
    }

    public TrackerView getView() {
        return view;
    }

    public void setView(TrackerView view) {
        this.view = view;
    }
    
}
