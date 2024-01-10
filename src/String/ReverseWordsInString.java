package String;

//https://leetcode.com/problems/reverse-words-in-a-string-iii/
/*
* Example 1:
Input: s = "Let's take LeetCode contest"
Output: "s'teL ekat edoCteeL tsetnoc"

Example 2:
Input: s = "Mr Ding"
Output: "rM gniD"
* */
public class ReverseWordsInString {
    public static void main(String[] args) {
       // String s = "Let's take LeetCode contest";
        String s = "Mr Ding";
        System.out.println(reverseWords(s));
    }

    private static String reverseWords(String s) {
        String[] strs = s.split(" "); // separate all words
        String reverseWorld="";
        for (int index =0; index <strs.length;index++){
            String reverse="";
            char [] ch = strs[index].toCharArray(); // convert each world to chr array
            for (int revIndex = ch.length-1; revIndex>=0;revIndex--){
                reverse = reverse +ch[revIndex]; // reverse world
            }
            strs[index] = reverse.toString();  // save the word at original position
        }
        for (String result: strs){
            reverseWorld =reverseWorld+result+" "; // make the reverse Worlds complete string
        }
        return reverseWorld.trim();
    }
}
