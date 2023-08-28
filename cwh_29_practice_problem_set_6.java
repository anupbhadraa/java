import java.util.*;

public class cwh_29_practice_problem_set_6 {
    public static void main(String[] args) {
        /* 
          
        //Q1
        float [] marks = {99.5f, 98.75f, 96.25f, 88.89f};
        float sum = 0;
        
        for(float element: marks) {
            sum = sum + element;
        }
        System.out.println("the of total marks is: "+ sum);
        
        */

        /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        /* 

        //Q2 
        int [] numbers = {2, 4, 8, 20, 24};
        int element = 52;
        
        boolean IsinArray = false;
        
        for (int i : numbers) {
            if(i == element) {
                IsinArray = true;
                break;
            }
        }
        
        if(IsinArray) {
            System.out.println("Element is present!");
        } else {
            System.out.println("Element not found!");
        }
        
        */
        
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        /*
         
        //Q3
        float [] marks = {99.5f, 98.75f, 96.25f, 88.89f};
        float sum = 0;
        
        for(float element: marks) {
            sum = sum + element;
        }
        
        float avg = 0;
        avg = sum/marks.length;
        
        System.out.println("avg mark is: "+ avg);
        
        */

        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        
        /*

        //Q4
        int [][] arr1 = {{1,2,3},
                         {4,5,6},
                         {7,8,9}};

        int [][] arr2 = {{1,2,3},
                         {4,5,6},
                         {7,8,9}};

        int [][] finalArray = new int[3][3];

        for (int i = 0; i < arr1.length; i++) { //row number of times
            for (int j = 0; j < arr1[i].length; j++) { //column number of times
                finalArray[i][j] = arr1[i][j] + arr2[i][j]; 
                
            }

            
        }

        for (int i = 0; i < finalArray.length; i++) {
            for (int j = 0; j < finalArray[i].length; j++) {
                System.out.print(finalArray[i][j]+ " ");

            }
            System.out.println();
        }

        */

        /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        /* 

        //Q5 reverse an array
        int [] marks = {1, 2, 3, 4, 5};
        int a = Math.floorDiv(marks.length, 2);
        int temp = 0;
        
        for (int i = 0; i < a; i++) {
            //swap marks[i] & marks[a(length of the array) - i - 1]
            temp = marks[i];
            marks[i] = marks[marks.length-i-1];
            marks[marks.length-i-1] = temp;

        }

        for (int i : marks) {
            System.out.print(i);
            
        }

        */

        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        

        /* 
         
        
        //Q6
        int [] marks = {1, 2, 356, 4, 5};
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        
        for (int i = 0; i < marks.length; i++) {
            if(max < marks[i]) {
                max = marks[i];
            }
            
            if(min > marks[i]) {
                min = marks[i];
            }
            
            
        }
        
        System.out.println("The largest number is: "+ max);
        System.out.println("The smallest number is: "+ min);
        
        
        */

        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        /* 
         
        //Q7
        int [] numbers = {20, 8, 908, 7564, 856454, 9};
        
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] < numbers[i+1]) {
                System.out.println("Array is not sorted");
                break;
            }
        }
        
        */
        
        
        
    }
}
