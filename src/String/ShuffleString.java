package String;

import java.util.Arrays;

// https://leetcode.com/problems/shuffle-string/description/
/*Input: s = "codeleet", indices = [4,5,6,7,0,2,1,3]
Output: "leetcode"
Explanation: As shown, "codeleet" becomes "leetcode" after shuffling.*/
public class ShuffleString {
    public static void main(String[] args) {
        String str = "codeleet";
        int[] indices = {4, 5, 6, 7, 0, 2, 1, 3};
        System.out.println(restoreString(str, indices));
    }

    private static String restoreString(String s, int[] indices) {
        char[] characters = s.toCharArray();
        char[] resultStr = new char[characters.length];
        String result = "";
        for (int index = 0; index < characters.length; index++) {
            resultStr[indices[index]] = characters[index];
        }
        for (char ch:resultStr) {
            result = result + "" + ch;
        }
        return result.toString();
    }
}
