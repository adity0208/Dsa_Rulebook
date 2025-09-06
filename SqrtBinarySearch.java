//Leetcode link: https://leetcode.com/problems/sqrtx/description/
public class SqrtBinarySearch {
    public static void main(String[] args) {

        // Example with a large number that would cause overflow in the original code
        int number = 2147395600;
        int ans = sqrt(number);

        // Correct integer sqrt is 46340. The original code fails here.
        System.out.println("sqrt of " + number + " is " + ans);

        int ans2 = sqrt(16);
        System.out.println("sqrt of 16 is " + ans2);
    }

    /**
     * Finds the integer square root of n using a safe binary search.
     */
    public static int sqrt(int n) {
        // Handle edge cases
        if (n < 0) return -1;
        if (n == 0 || n == 1) return n;

        int start = 1; // Start from 1, since we've handled 0
        int end = n;
        int ans = 0; // Initialize to a safe default

        while (start <= end) {
            int mid = start + (end - start) / 2;

            // THE FIX: Use division to prevent (mid * mid) from overflowing.
            if (mid <= n / mid) {
                // This is a potential answer. Store it and search for a larger one.
                ans = mid;
                start = mid + 1;
            } else {
                // The guess was too high. Search in the lower half.
                end = mid - 1;
            }
        }
        return ans;
    }
}