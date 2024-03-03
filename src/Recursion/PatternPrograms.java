package Recursion;

/*
Print the Pattern given below
    Example :input  n =4

    4444333322221111
    444333222111
    44332211
    4321

* */
public class PatternPrograms {
    public static void main(String[] args) {
        int num = 4;
        printPattern(num, num);
    }

    private static void printPattern(int n, int length) {
        if (length == 0) {
            return;
        }
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= length; j++) {
                System.out.print(i);
            }
        }
        System.out.println();
        printPattern(n, length - 1);
    }
}
