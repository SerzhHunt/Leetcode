package easy;

public class SearchInsertPosition {
    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 6, 8};

        System.out.println(searchInsert(nums, 7));
    }

//    Given a sorted array of distinct integers and a target value, return the index
//    if the target is found. If not, return the index where it would be if it were inserted in order.
//    You must write an algorithm with O(log n) runtime complexity.

    public static int searchInsert(int[] nums, int target) {
        return binarySearch(nums, 0, nums.length - 1, target);
    }

    public static int binarySearch(int[] array, int left, int right, int target) {
        int mid = left + ((right - left) / 2);
        if (right < left) {
            return left;
        }

        if (array[mid] == target) {
            return mid;
        } else if (array[mid] > target) {
            return binarySearch(array, left, mid - 1, target);
        } else {
            return binarySearch(array, mid + 1, right, target);
        }
    }
}

