import java.util.*;
public class linearSearch {
    public static void main(String[] args) {
        int nums[] = {2, 4, 6, 8, 10, 12, 14};
        int key = 10;

        for(int i=0; i<nums.length; i++) {
            if(key == nums[i]) {
                System.out.println("Element found at index: " + i);
            }
        }
    }
    
}
