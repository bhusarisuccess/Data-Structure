package Patterns;

public class Patterns {
    public static void main(String[] args) {
        int number = 5;
        pattern1(number);
        System.out.println();
        pattern2(number);
        System.out.println();
        pattern3(number);
        System.out.println();
        pattern4(number);

    }


    private static void pattern1(int num) {
        for (int row = 1; row <= num; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    private static void pattern2(int num) {
        for (int row = 1; row <= num; row++) {
            for (int col = 1; col <= num; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    private static void pattern3(int num) {
        for (int row = num; row >= 1; row--) {
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    private static void pattern4(int num) {
        for (int row = 1; row <= num; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }
}
