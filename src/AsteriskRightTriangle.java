import java.util.Scanner;

public class AsteriskRightTriangle {
    public int numberOfStars;

    AsteriskRightTriangle(){
        numberOfStars=0;
    }

    public void printTriangle(){
        for (int i = 0; i < numberOfStars; i++) {
            for (int j = 0; j <=i ; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
    public void getNoOfStarsFromUser(){
        Scanner scanner=new Scanner(System.in);
        numberOfStars=scanner.nextInt();
    }
}
