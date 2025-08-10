public class Ceiling {
    public static void main(String[] args) {
        int arr[] = {4, 4, 8, 8, 15, 16, 23, 23, 42};

        int floor = binarySearchFloor(arr, 22);
        System.out.println("Floor of 22 is: " + floor);

        int ceiling = binarySearchCeiling(arr, 22);
        System.out.println("Ceiling of 22 is: " + ceiling);
    }

    public static int binarySearchFloor(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        if (target < arr[0]) {
            return -1;
        }
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return arr[mid];
            }
        }
        return arr[end];
    }

    public static int binarySearchCeiling(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        if (target > arr[arr.length - 1]) {
            return -1;
        }
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return arr[mid];
            }
        }
        return arr[start];
    }
}
