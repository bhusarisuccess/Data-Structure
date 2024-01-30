package Recursion;

import javax.sound.midi.Soundbank;

public class ReverseStringUsingRecursion {
    public static void main(String[] args) {
        char[] ch = "abhay".toCharArray();
        reverseString(ch, 0, ch.length);
    }

    static void reverseString(char[] str, int index, int length) {
        if (index == length) {
            return;
        }
        char temp = str[index];
        reverseString(str, index + 1, length);
        System.out.print(temp);
    }
}
