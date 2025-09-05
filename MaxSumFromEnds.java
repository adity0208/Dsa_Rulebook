public class MaxSumFromEnds {
    public static int maxSum(int[] A, int B) {
        int n = A.length;

        // Build prefix sum (from front)
        int[] prefix = new int[n+1];
        for (int i = 0; i < n; i++) {
            prefix[i+1] = prefix[i] + A[i];
        }

        // Build suffix sum (from back)
        int[] suffix = new int[n+1];
        for (int i = n-1; i >= 0; i--) {
            suffix[n-i] = suffix[n-i-1] + A[i];
        }

        // Try all combinations
        int max = Integer.MIN_VALUE;
        for (int k = 0; k <= B; k++) {
            int sum = prefix[k] + suffix[B-k];
            max = Math.max(max, sum);
        }

        return max;
    }

    public static void main(String[] args) {
        int[] A1 = {5, -2, 3, 1, 2};
        int B1 = 3;
        System.out.println(maxSum(A1, B1));  // Output: 8

        int[] A2 = {2, 3, -1, 4, 2, 1};
        int B2 = 4;
        System.out.println(maxSum(A2, B2));  // Output: 9
    }
}

