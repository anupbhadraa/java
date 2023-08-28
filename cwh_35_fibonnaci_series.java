public class cwh_35_fibonnaci_series {

    static int fib(int n) {
        // if(n==1) {
        //     return 0;
        // }
        // else if(n==2) {
        //     return 1;
        // }

        if(n==1 || n==2) {
            return n-1;
        }

        else {
            return fib(n-1) + fib(n-2);
        }
        
    }

    public static void main(String[] args) {
        int n=5;
        int result = fib(n);
        System.out.println(result);
        
    }
}
