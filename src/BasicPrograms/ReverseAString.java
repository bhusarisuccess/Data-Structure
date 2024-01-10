package BasicPrograms;

public class ReverseAString {
    public static void main(String[] args) {
        String str = "Abhay";
        reverseAString(str);
    }

    private static void reverseAString(String str) {
        System.out.println("Original String: "+str);
        char[] characters = str.toCharArray();
        String reverseString = "";
        for (int index = characters.length - 1; index >= 0; index--) {
            reverseString = reverseString + characters[index];
        }
        System.out.println("Reverse String: "+reverseString);
    }
}
