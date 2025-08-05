public class Aug5BitonicArray {
    public static void main(String[] args) {
        int arr[]= {2,4,5,9,11,7,2,1};
        System.out.println(bitonicArr(arr));

    }
    static int bitonicArr(int[] arr){
        if(arr[0]<arr[arr.length-1]){
            return arr[0];
        }else {
            return arr[arr.length-1];
        }
    }
}
