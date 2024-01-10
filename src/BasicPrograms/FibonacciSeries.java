package BasicPrograms;

/*The Fibonacci sequence is a type series where each number is the sum of the two that precede it.
  Fibonacci sequence is given by 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144,....
 * */
public class FibonacciSeries {
    public static void main(String[] args) {
        int limit = 10;
        fibonacciSeries(limit);
    }

    private static void fibonacciSeries(int limit) {
        int a = 0;
        int b = 1;
        System.out.print(a + " " + b);
        for (int index = 1; index < limit; index++) {
            int result = a + b;
            System.out.print(" " + result);
            a = b;
            b = result;
        }
    }
}
