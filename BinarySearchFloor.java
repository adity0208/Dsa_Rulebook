// 📘 DSA Rulebook — Chapter 1: Binary Search
// 🔍 Problem: Find the floor of a target number in a sorted array.
// Floor = greatest element ≤ target. If no such element exists, return -1.

public class BinarySearchFloor {

    public static void main(String[] args) {
        // 🧪 Test arrays
        int arr1[] = {4, 4, 8, 8, 15, 16, 23, 23, 42};

        // 🔍 Find floor of 3 in arr1 → should return  -1 or 3 depending on array
        int ans = binarySearchFloor(arr1, 3);
        System.out.println("Floor of 3 is: " + ans);
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
     * 🔎 Binary Search to find the floor of a target value.
     * Floor = greatest element ≤ target.
     * If target exists → return target.
     * If not → return the largest value smaller than target.
     */
    static int binarySearchFloor(int[] arr, int target) {
        int ans = -1; // 🧠 Default to -1 if no floor exists
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                // ✅ Exact match is also a valid floor
                ans = arr[mid];
                break; // 🎯 Found the best possible floor
            } else if (arr[mid] < target) {
                // 🧭 Potential floor found, but keep searching right
                ans = arr[mid];
                start = mid + 1;
            } else {
                // ❌ Too big, search left
                end = mid - 1;
            }
        }

        return ans; // 📤 Return the best floor found or -1
    }
}