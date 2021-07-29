package easy;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] array = {"flower", "flow", "flight"};
        System.out.println(longestCommonPrefix(array));
    }

//    Input: strs = ["flower","flow","flight"]
//    Output: "fl"
    public static String longestCommonPrefix(String[] strs) {
        StringBuilder result = new StringBuilder("");
        int index = 0;
        int length = strs[0].length();

        while (index < length) {
            for (int i = 0; i < strs.length - 1; i++) {
                if (Math.min(index, strs[i + 1].length() - 1) < index) {
                    return result.toString();
                }
                if (strs[i].charAt(index) != (strs[i + 1].charAt(Math.min(index, strs[i + 1].length() - 1)))) {
                    return result.toString();
                }
            }
            result.append(strs[0].charAt(index));
            index++;
        }
        return result.toString();
    }
}
