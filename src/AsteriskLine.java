import java.util.*;
public class AsteriskLine {
    public int numberOfStars;

    AsteriskLine(){
        numberOfStars=0;
    }

    public void printLine(){
        for (int i = 0; i < numberOfStars; i++) {
            System.out.print("*");
        }
    }
    public void getNoOfStarsFromUser(){
        Scanner scanner=new Scanner(System.in);
        numberOfStars=scanner.nextInt();
    }
}
