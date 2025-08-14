public class EquilibriumIndex {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,8,10};
        int ans=equiexist(arr);
        System.out.println(ans);
    }
//    gfg link : https://www.geeksforgeeks.org/problems/equilibrium-point-1587115620/1
    public static int equiexist(int[] arr){
        int n=arr.length;
        int[] ps= new int[n];
        ps[0]=arr[0];
        for(int i=1;i<n;i++){
            ps[i]=ps[i-1]+arr[i];
        }
        for(int i=1;i<n;i++){
            int sumL=(i==0)?0:ps[i-1];
            int sumR=(i==n-1)?0:ps[n-1]-ps[i];
            if(sumL==sumR){
                return i ;

            }

        }
        return -1;
    }

}