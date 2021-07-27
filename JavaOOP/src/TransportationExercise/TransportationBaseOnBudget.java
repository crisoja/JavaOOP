package TransportationExercise;

public class TransportationBaseOnBudget extends Transportation implements TransportationInterface {


    @Override
    public String getTransportation(double budget) {
        if(budget == drivingCarPrice){
            return "You can choose car driving as your transportation!";
        }
        else if(budget == takingBusPrice){
            return "You can choose taking bus as your transportation!";
        }
        else if(budget == takingTrainPrice){
            return "You can choose taking train as your transportation!";
        }
        else if(budget == takingPlanePrice){
            return "You can choose taking plane as your transportation!";
        }
        else{
            return "Sorry! No available transportation on your budget";
        }
    }
}
