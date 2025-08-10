public class Mountain {
    public static void main(String[] args){
        int[] arr={0,10,5,2};
        int ans=peakIndexMountainArray(arr);
        System.out.println(ans);
    }
    // leetcode 852 https://leetcode.com/problems/peak-index-in-a-mountain-array/
    //leetcode 162  https://leetcode.com/problems/find-peak-element/
    public static int peakIndexMountainArray(int[] arr){
      int start=0;
      int end=arr.length-1;
      while(start<end){
          int mid=start+(end-start)/2;
          if(arr[mid]>arr[mid+1]){
              //you are in decreasing part of the array
              //this may be the ans but look at the left
              //this is why end!=mid-1
              end=mid;
          }else{
              start=mid+1;//because we know that mid+1 element>mid-element
          }
      }
      // in the end, start == end and pointing to the largest number because of the 2 checks above
      // start and end are always trying to find max element in the above 2 checks
      // hence, why they are pointing to just one element, that is the max one because that is why the checks say
      //
        return start; // or end
    }


}
