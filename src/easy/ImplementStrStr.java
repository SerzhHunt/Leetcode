package easy;

public class ImplementStrStr {
    public static void main(String[] args) {
        System.out.println(strStr("", ""));
    }

//    Input: haystack = "hello", needle = "ll"
//    Output: 2
    public static int strStr(String haystack, String needle) {
        return haystack.indexOf(needle);
    }
}
