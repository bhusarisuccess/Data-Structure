package Recursion;
// 0 1 1 2 3 5 8 13...
public class FindFabonacci {
    public static void main(String[] args) {
        System.out.println(fabo(4));
    }
    static int fabo(int n) {
        if (n < 2) {
            return n;
        }
        return fabo(n - 1) + fabo(n - 2);
    }
}
