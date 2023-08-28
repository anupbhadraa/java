public class cwh_34_recursion {

    static int factorial(int n) {
        if(n==1 || n==0) {
            return 1;
        } else {
            return n * factorial(n-1);
        }
    }

    static int factorial_iterative(int n) {
        int product = 1;
        if(n==1 || n==0) {
            return 1;
        } else {
            for (int i = 1; i <= n; i++) {
                product *= i;
            }
            return product;
        }
    }

    public static void main(String[] args) {
        System.out.println("The factorial of 4 is: "+factorial_iterative(4));
    }
}
