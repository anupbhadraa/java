import java.util.*;

public class armstrongNo {

    static boolean armstrong(int n) {
        int original = n;
        int sum = 0;

        while (n > 0) {
            int rem = original % 10;
            original = original / 10;
            sum = sum + rem * rem * rem;
        }

        if (sum == original) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(armstrong(153));
    }

}
