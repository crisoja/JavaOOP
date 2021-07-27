package Printer;

public class BlackAndWhitePrinter extends Printer {
    @Override
    public void prints() {
        System.out.println("Prints: Only the black color is used to paper.");
    }

    public static void main(String[] args) {
        int cock,hen,chick;
        for(cock=0; cock <=100; cock++){
            for(hen=0; hen<=100; hen++){
                chick=100-cock-hen;
                if(((5*cock) + (3*hen)+ (chick/3)) == 100){
                    System.out.println("Cock: "+ cock + " pcs\nhen: "+  hen +"pcs\nchick: "+ chick+" pcs");
                    System.out.println("<=========================>");
                }
            }
        }


    }
}
