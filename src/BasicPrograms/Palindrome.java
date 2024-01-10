package BasicPrograms;

// Palindrome number is a number (151) that remains the same when its digits are reversed.
//Find if a number is palindrome or not
public class Palindrome {
    public static void main(String[] args) {
        int number = 151;
        palindrome(number);
    }

    private static void palindrome(int number) {
        int num =  number;
        int result =0;
        while (num!=0){
            int reminder = num%10;
            num = num/10;
            result = result*10 + reminder;
        }

        if (result==number){
            System.out.println("The number is palindrome number");
        }else {
            System.out.println("The number is not palindrome number");
        }
    }
}
