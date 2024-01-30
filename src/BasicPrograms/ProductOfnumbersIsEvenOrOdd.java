package BasicPrograms;

public class ProductOfnumbersIsEvenOrOdd {
    public static void main(String[] args) {
        int[] anc = {1,3,5,6};
        checkEvenOrOdd(anc);
    }

    static void checkEvenOrOdd(int[] numbers) {
        int product = 0;
        for (int i = 0; i < numbers.length; i++) {
            product = product * numbers[i];
        }

        if (product % 2 == 0) {
            System.out.print("Even");
        } else {
            System.out.print("Add");
        }
    }
}
