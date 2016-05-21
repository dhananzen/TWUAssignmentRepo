import java.util.ArrayList;

public class PrimeFactors {
    public ArrayList<Integer> generate(int number) {
        ArrayList <Integer> primeFactors = new ArrayList<Integer>();
        if(number <= 2) return primeFactors;
        for(int i = 2 ;i<=number ;i++){
            if(number%i == 0){
                primeFactors.add(i);
                number /= i;
                i = 2;
            }
        }
        return primeFactors;
    }
}