package TransportationExercise;

public class MainClass {
    public static void main(String[] args) {

    String name = "Xiaoming";
    double budget = 500.0;

    TransportationInterface transpo = new TransportationBaseOnBudget();

        System.out.println("Hi " + name + " based on your budget "+ budget + "\n" + transpo.getTransportation(budget));
    }
}
