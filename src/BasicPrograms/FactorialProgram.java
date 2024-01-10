package BasicPrograms;


// Factorial
// 4! = 4*3*2*1 = 24
// 5! = 5*4*3*2*1 = 120
public class FactorialProgram {
    public static void main(String[] args) {
        int number = 5;
        factorialOfNumber(number);
    }

    private static void factorialOfNumber(int number) {
        int factorial = 1;
        for (int index = 1; index<=number; index++){
            factorial = factorial * index;
        }
        System.out.println("Factorial of "+number+" is "+factorial);
    }
}
