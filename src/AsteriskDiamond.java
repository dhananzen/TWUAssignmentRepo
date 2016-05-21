import java.util.Scanner;

public class AsteriskDiamond {
    public int numberOfStars;

    AsteriskDiamond(){
        numberOfStars=0;
    }

    public void printDiamond(){
        int incrementFactor=2;
        for (int i = 0; i < numberOfStars && i>=0; i+=incrementFactor) {
            for (int k = 0; k < (numberOfStars-i)/2; k++) {
                System.out.print(" ");
            }
            for (int j = 0; j <=i ; j++) {
                System.out.print("*");
            }
            if(i==numberOfStars-1){
                incrementFactor*=-1;
            }
            System.out.print("\n");
        }
    }
    public void getNoOfStarsFromUser(){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter odd number of stars");
        numberOfStars=scanner.nextInt();
    }
}
