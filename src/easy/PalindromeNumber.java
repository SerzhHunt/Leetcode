package easy;

public class PalindromeNumber {
    public static void main(String[] args) {
        System.out.println(isPalindrome(121212121));
    }

//    Input: x = -121
//    Output: false
//    Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
    public static boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        int[] array = buildArray(x);
        for (int i = 0; i < array.length; i++) {
            if (array[i] != array[array.length - i - 1]) {
                return false;
            }
        }
        return true;
    }

    private static int[] buildArray(int value) {
        int[] result = new int[String.valueOf(value).length()];
        int index = 0;
        while (value > 0) {
            result[index] = value % 10;
            value /= 10;
            index++;
        }
        return result;
    }
}
