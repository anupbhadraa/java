import java.util.*;

public class largestNumber {
    
    public static int getlargest(int number[]) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < number.length; i++) {
            if(largest < number[i]) {
                largest = number[i];
            }

            if(smallest > number[i]) {
                smallest = number[i];
            }
        }
        
        System.out.println("Smallest value is: " + smallest);
        return largest;
    }

    public static void main(String[] args) {
        int numbers[] = {1, 2, 6, 3, 5};  
        int largestNum = getlargest(numbers);
        

        System.out.println("The largest number is: " + largestNum);

    }    
}
