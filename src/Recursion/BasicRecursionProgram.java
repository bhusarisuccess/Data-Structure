package Recursion;
// Recursion - function calling itself
public class BasicRecursionProgram {
    public static void main(String[] args) {
        //Print 1234
        int n = 1;
        printNumber(n);
    }
    private static void printNumber(int num){
        if (num==6){
            return;
        }
        System.out.println(num);
        printNumber(num+1);
    }
}
