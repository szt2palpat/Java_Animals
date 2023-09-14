import java.util.Scanner;

public class AnimalsAndLegs {
    public static void main(String[] args) {
        Scanner legs=new Scanner(System.in);
        System.out.println("Please enter the number of the chickens: ");
        int Chickens=legs.nextInt();
        System.out.println("Please enter the number of the pigs: ");
        int Pigs=legs.nextInt();
        int OsszLeg=Chickens*2+Pigs*4;
        System.out.println("The number of legs: "+OsszLeg);
    }


}