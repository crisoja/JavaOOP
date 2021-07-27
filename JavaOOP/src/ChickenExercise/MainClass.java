package ChickenExercise;

public class MainClass {

    public static void main(String[] args) {
        ChickenComputationInterface chick = new ChickenBuyingWay();
        chick.computeHowToBuyChicken();
    }
}
