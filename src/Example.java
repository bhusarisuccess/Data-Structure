public class Example {
    public static void main(String[] args) {
      String  s = "abcabcbb";
      // String  s = "bbbbb";
      // String  s = "au";
        System.out.println(lengthOfLongestSubstring(s));
    }
    static public int lengthOfLongestSubstring(String s) {
       int longestValue = 0;
       int leftIndex =0;
       int rightIndex = 0;


        if(s.isEmpty()){
            return 0;
        }
        int count = 0;
        char [] str = s.toCharArray();
        for(char element: str){
            int length = 0;
            for (int index = 1; index < str.length; index++){
                if (element != str[index]){
                    length ++;
                }

                if (count<length){
                    count = length;
                }
            }

        }
return count;
    }
}
