import java.util.Scanner;

public class IsoscelesTriangle {
    public int numberOfStars;

    IsoscelesTriangle(){
        numberOfStars=0;
    }

    public void printTriangle(){
        for (int i = 0; i < numberOfStars; i+=2) {
            for (int k = 0; k < (numberOfStars-i)/2; k++) {
                System.out.print(" ");
            }
            for (int j = 0; j <=i ; j++) {
                System.out.print("*");
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
