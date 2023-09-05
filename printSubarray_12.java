import javax.xml.transform.Source;

public class printSubarray_12 {
    public static void subArray(int number[]) {
        
        for (int i = 0; i < number.length; i++) {
            int start = i;
            for (int j = i; j < number.length; j++) {
                int end = j;
                int sum = 0;
                for (int k = start; k <= end; k++) {
                    
                    sum = sum + number[k];
                    System.out.print(number[k]+ " ");
                   
                    
                }
                
                System.out.print(" = "+ sum);
                System.out.println();
                
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int numbers[] = {2, 4, 6, 8, 10};
        subArray(numbers);

        }
}
