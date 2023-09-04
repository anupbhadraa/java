import java.util.*;

public class binarySearch {
    public static int BinarySearch(int numbers[],int key) {
        int start = 0;
        int end = numbers.length-1;

        while( start <= end) {
            int mid = (start + end) / 2;

            if(numbers[mid] == key) { //element found
                return mid; 
            }

            if(key > numbers[mid]) { //right
                start = mid + 1;
            } else {
                end = mid - 1; //left
            }

        }

        return -1;
    }

    public static void main(String[] args) {
        int numbers[] = {2, 4, 6, 8, 10, 12, 14};
        int key = 10;

        Scanner sc = new Scanner(System.in);

        System.out.println("index for key is: " + BinarySearch(numbers, key));
    }
    
}
