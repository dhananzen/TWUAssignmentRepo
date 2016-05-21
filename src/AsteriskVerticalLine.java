import java.util.Scanner;

public class AsteriskVerticalLine {
    public int numberOfStars;

    AsteriskVerticalLine(){
        numberOfStars=0;
    }

    public void printLine(){
        for (int i = 0; i < numberOfStars; i++) {
            System.out.print("*\n");
        }
    }
    public void getNoOfStarsFromUser(){
        Scanner scanner=new Scanner(System.in);
        numberOfStars=scanner.nextInt();
    }
}
