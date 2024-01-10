package BasicPrograms;

public class NumberEvenOrOdd {
    public static void main(String[] args) {
        int number = 0;
        numberEvenOrOdd(number);
    }

    private static void numberEvenOrOdd(int number) {
        if (number % 2 == 0) {
            System.out.println("The number is even number");
        } else {
            System.out.println("The number is odd number");
        }
    }
}
