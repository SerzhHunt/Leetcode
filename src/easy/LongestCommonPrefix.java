package easy;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] array = {"flow", "flower", "flight"};
        System.out.println(longestCommonPrefix(array));
    }

//    Input: strs = ["flower","flow","flight"]
//    Output: "fl"
    public static String longestCommonPrefix(String[] strs) {
        StringBuilder result = new StringBuilder();
        int index = 0;
        int length = strs[0].length();

        while (index <= length) {
            for (int i = 0; i < strs.length - 1; i++) {
                if (strs[i].charAt(index) != (strs[i + 1].charAt(index))) {
                    return result.toString();
                }
            }
            result.append(strs[index].charAt(index));
            index++;
        }
        return result.toString();
    }
}
