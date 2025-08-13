public class Fibonacci {
    public static void main(String[] args) {
        int res=fib(5);
        System.out.println(res);
    }
    static int fib(int num){
        if(num<2){
            return num;
        }else{
            return fib(num-1)+fib(num-2);
        }
    }
}
