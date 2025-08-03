// 📘 DSA Rulebook — Chapter 1: Binary Search
// 🔍 Problem: Find the first and last occurrence of a target in a sorted array.
// If the target is not found, return [-1, -1].

public class FirstLastOccurrence {

    // 🚀 Entry point: returns both first and last index of target
    public int[] searchRange(int[] nums, int target) {
        int first = findFirst(nums, target); // 🔍 Search for first occurrence
        int last = findLast(nums, target);   // 🔍 Search for last occurrence
        return new int[]{first, last};       // 🧾 Return result as array
    }

    // 🔎 Modified Binary Search to find the FIRST occurrence of target
    private int findFirst(int[] nums, int target) {
        int low = 0, high = nums.length - 1;
        int result = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] == target) {
                result = mid;
                high = mid - 1; // search left
            } else if (nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return result;
    }

    // 🔎 Modified Binary Search to find the LAST occurrence of target
    private int findLast(int[] nums, int target) {
        int low = 0, high = nums.length - 1;
        int result = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] == target) {
                result = mid;
                low = mid + 1; // search right
            } else if (nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return result;
    }

    // 🧪 Main method for testing
    public static void main(String[] args) {
        FirstLastOccurrence finder = new FirstLastOccurrence();

        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 8;

        int[] result = finder.searchRange(nums, target);

        System.out.println("First and Last Occurrence of " + target + ": [" + result[0] + ", " + result[1] + "]");
    }
}