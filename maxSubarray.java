import java.util.*;
 
public class maxSubarray {
    public static void MaxSubArray(int number[]) {
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < number.length; i++) {
            int start = i;
            for (int j = i; j < number.length; j++) {
                int end = j;
                int currSum = 0;
                for (int k = start; k <= end; k++) {
                    
                    currSum = currSum + number[k];
                    System.out.print(number[k]+ " ");

                    if(currSum > maxSum) {
                        maxSum = currSum;
                    }
                   
                    
                }
                
                System.out.print(" = "+ currSum);
                System.out.println();
                
            }
            System.out.println();
            
        }

        System.out.println("The maximum sum of the subarray is: "+maxSum);
    }
    public static void main(String[] args) {
        int numbers[] = {1, -2, 6, -1, 3};
        MaxSubArray(numbers);
    }
    
}
