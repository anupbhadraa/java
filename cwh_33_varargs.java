public class cwh_33_varargs {
    static int sum(int ...arr) {
        //Available as int[] arr
        int sum = 0;

        for(int a: arr) {
            sum = sum + a;
        }

        return sum;

    }


    public static void main(String[] args) {
        System.out.print(sum(4, 5, 7, 8, 2, 4, 5));
    }
}
