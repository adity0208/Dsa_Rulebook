public class ModularExponential {
    public static void main(String[] args) {
        int base=3;
        int exponent =100;
        int modulo=50;
        int ans=power(base,exponent,modulo);
        System.out.println(ans);
    }
    public static int power(int base, int exponent, int modulo){
        int ans=1;
        for(int i=0;i<exponent;i++){
            ans=((ans%modulo)*(base%modulo))%modulo;
        }
        return ans;
    }


}
