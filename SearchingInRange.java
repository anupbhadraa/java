import java.util.*;

public class SearchingInRange {
    public static void main(String[] args) {
        int[] arr = { 23, 4, 5, 6, 3, 78, 98 };
        int target = 3;
        System.out.println(linearSearch(arr, target, 1, 4));

    }

    static int linearSearch(int[] arr, int target, int Start, int end) {
        if (arr.length == 0) {
            return -1;
        }

        for (int index = 0; index < arr.length; index++) {
            int element = arr[index]; // check for element at every index if it is = target

            if (target == element) {
                return element;
            }

        }
        // this line will execute if none of the return statements above have executed
        // hence the target not found
        return -1;
    }

}
