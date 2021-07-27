package ChickenExercise;

public class ChickenBuying extends Chicken implements ChickenComputation{
    double cockPrice = 5.0;
    double henPrice = 3.0;
    double chickPrice = 1.0;
    int cock,hen,chick;

    @Override
    public void computeHowToBuyChicken() {
        printChickensPrice();
        System.out.println("Below are the way on how should you buy 100 different chicken from 100 Yuan");
        for(cock=0; cock <=100; cock++){
            for(hen=0; hen<=100; hen++){
                chick=100-cock-hen;
                if(((5*cock) + (3*hen)+ (chick/3)) == 100){
                    System.out.println("Cock: "+ cock + " pcs\nhen: "+  hen +" pcs\nchick: "+ chick+" pcs");
                    System.out.println("<=========================>");
                }
            }
        }
    }

    public void printChickensPrice(){
        System.out.println("Cock price: ¥" + cockPrice+ " Hen price: ¥" + henPrice + " Chicken price: ¥" + chickPrice);
    }

}
