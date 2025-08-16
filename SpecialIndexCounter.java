public class SpecialIndexCounter {
    public static void main(String[] args) {
        int[] arr = {2, 1, 6, 4};
        int ans = SpecialIndices(arr);
        System.out.println(ans);
    }

    public static int SpecialIndices(int[] arr) {
        int n = arr.length;
        int[] ps_even = new int[n];
        int[] ps_odd = new int[n];

        // Step 1: Build prefix sum arrays
        for (int i = 0; i < n; i++) {
            if (i > 0) {
                ps_even[i] = ps_even[i - 1];
                ps_odd[i] = ps_odd[i - 1];
            }
            if (i % 2 == 0) {
                ps_even[i] += arr[i];
            } else {
                ps_odd[i] += arr[i];
            }
        }

        // Step 2: Check each index
        int count = 0;
        for (int i = 0; i < n; i++) {
            int evenBefore = (i > 0) ? ps_even[i - 1] : 0;
            int oddBefore = (i > 0) ? ps_odd[i - 1] : 0;

            // after removing index i, parity flips
            int evenAfter = ps_odd[n - 1] - ps_odd[i];
            int oddAfter = ps_even[n - 1] - ps_even[i];

            if (evenBefore + evenAfter == oddBefore + oddAfter) {
                count++;
            }
        }

        return count;
    }
}
