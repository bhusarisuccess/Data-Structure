package BasicPrograms;

/*Armstrong number is a number that is equal to the sum of cubes of its digits.
 For example 0, 1, 153, 370, 371 and 407 are the Armstrong numbers.*/
public class ArmstrongNumber {
    public static void main(String[] args) {
        int number = 153;
        armstrongNumber(number);
    }

    private static void armstrongNumber(int number) {
        int num = number;  //
        int result = 0;
        while (num != 0) {
            int reminder = num % 10;
            result = result + (reminder * reminder * reminder);
            num = num / 10;
        }
        if(result == number){
            System.out.println("The number is Armstrong Number");
        }else {
            System.out.println("The number is not Armstrong Number");
        }
    }
}
