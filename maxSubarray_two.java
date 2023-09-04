import java.util.*;

public class maxSubarray_two {
    public static void maxSubarray(int number[]) {

        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;
        int prefix[] = new int[number.length];

        //calculate prefix sum
        prefix[0] = number[0];
        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i-1] + number[i];
        }
    
        for (int i = 0; i < number.length; i++) {
            int start = i;
            for (int j = i; j < number.length; j++) {
                int end = j;
                currSum = start == 0 ? prefix[end] : prefix[end] - prefix[start-1];

                /*
                for (int k = start; k <= end; k++) {
                    
                    currSum = currSum + number[k];
                    System.out.print(number[k]+ " ");

                    if(currSum > maxSum) {
                        maxSum = currSum;
                    }
                   
                    
                }
                */
                if(currSum > maxSum) {
                    maxSum = currSum;
                }
            }
            
            
        }

        System.out.println("The maximum sum of the subarray is: "+maxSum);
    }
    public static void main(String[] args) {
        int numbers[] = {1, -2, 6, -1, 3};
        maxSubarray(numbers);
    }
    
}

