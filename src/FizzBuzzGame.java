public class FizzBuzzGame {
    private boolean isDivisible(int number, int divisor) {
        if (number % divisor == 0)
            return true;
        else {
            return false;
        }
    }
    public void fizzBuzz() {
        for (int i = 1; i <= 100; i++) {
            boolean divisible = false;
            if (isDivisible(i, 3)) {
                System.out.print("Fizz");
                divisible = true;
            }
            if (isDivisible(i, 5)) {
                System.out.print("Buzz");
                divisible = true;
            }
            if(!divisible){
                System.out.print(i);
            }
            System.out.print("\n");
        }
    }

}
