// 📘 DSA Rulebook — Chapter 1: Binary Search Variants
// 🔍 Problem: Find the ceiling of a target number in a sorted array.
// Ceiling = smallest element ≥ target. If no such element exists, return -1.

public class BinarySearchCeiling {

    public static void main(String[] args) {
        // 🧪 Test array
        int arr1[] = {4, 4, 8, 8, 15, 16, 23, 23, 42};

        // 🔍 Find ceiling of 3 in arr1 → should return 4
        int ans = binarySearchCeiling(arr1, 3);
        System.out.println("Ceiling of 3 is: " + ans);
    }

    /*
        ┌───────────────────────────────┐
        │         ⬆ Ceiling             │
        │   Smallest integer ≥ target   │
        └───────────────────────────────┘
                     (•‿•)             
                    /|   |\            
                    / \ / \            
        ┌───────────────────────────────┐
        │         ⬇ Floor               │
        │   Greatest integer ≤ target   │
        └───────────────────────────────┘
    */

    /**
     * 🔎 Binary Search to find the ceiling of a target value.
     * Ceiling = smallest element ≥ target.
     * If target exists → return target.
     * If not → return the smallest value greater than target.
     */
    static int binarySearchCeiling(int[] arr, int target) {
        int ans = -1; // 🧠 Default to -1 if no ceiling exists
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                // ✅ Exact match is also a valid ceiling
                ans = arr[mid];
                break; // 🎯 Found the best possible ceiling
            } else if (arr[mid] < target) {
                // ❌ Too small, move right
                start = mid + 1;
            } else {
                // 🧭 Potential ceiling found, but keep searching left
                ans = arr[mid]; // Store candidate
                end = mid - 1;
            }
        }

        return ans; // 📤 Return the best ceiling found or -1
    }
}