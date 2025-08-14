import java.util.ArrayList;
import java.util.List;

public class LSearchRecursion {
    public static void main(String[] args) {
        int[] arr={1,3,8,4,5,4,6,7,8,9,4};
        int target=4;
        ArrayList<Integer> ans= find(arr,4,0, new ArrayList<>());
        System.out.println(ans);
    }
    static ArrayList<Integer> find(int[] arr, int target,int index, ArrayList<Integer> list){
               if(index==arr.length){
                   return list;
               }
               if(arr[index]==target){
                   list.add(index);}
                   return find(arr,target,index+1,list);
    }

}
