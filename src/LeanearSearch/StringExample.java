package LeanearSearch;

public class StringExample {
    public static void main(String[] args) {
        String str = "jjkkzkzjgiugfkaj" + "shugf";
        char target = 'a';
        System.out.println(""+ search1(str,target));
    }

    private static boolean search1(String str, char target) {
        if (str.isEmpty()) {
            return false;
        }
        for (int element : str.toCharArray()) {

            if (element == target) {
                return true;
            }
        }
        return false;

    }
}
