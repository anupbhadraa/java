public class cwh_35_practice_problem_set_7 {

    //problem 6
    static void avg(int [] avg) {
        int sum = 0;
        int average = 0;

        for( int element: avg ) {
            sum = sum + element;

            average = sum / avg.length;

        }
        System.out.println("Average: " + average);

    }

    public static void main(String[] args) {
        
        
        /* 
        
        //Problem 1
        static void multi_table(int n) {
        for(int i = 1; i <= 10; i++) {
            int result = n*i;
            System.out.println(n + "*" + i + " = " + result);
        }
    }
    
    */

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    /*
     
    //Problem 2 
    static void starPattern(int n) {
        for(int i = 1; i<=4 ; i++) {
            for(int j=1; j<=i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
    */
    
    /*
    
    //Problem 3
    static void naturalNoSum(int n) {
        int sum = 0;
        // sum = (n*(n+1)) / 2;
        // System.out.println(sum);
        for(int i=0; i<=n; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
    
    */

    /* 
     
    
    //Problem 4
    static void statPattern2(int n) {
        for(int i=1; i<=n; i++ ) {
            for(int j=n; j>=i; j--) {
                System.out.print("*");
                
            } 
            System.out.println();
        }
    }
    public static void main(String[] args) {
        // multi_table(5);
        // starPattern(4);
        // naturalNoSum(5);
        statPattern2(4);
        
    }
    
    */
    
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    /* 
     
    //problem 5
    int a = 0, b = 1, c;
    int n = 10;
    
    System.out.print(a + " ");
    for(int i=1; i<=n ; i++) {
        c = a + b;
        System.out.print(c + " ");
        a = b;
        b = c;
    }

    */

    ////////////////////////////////////////////////////////////////
     
    /*
     
    //problem 6
    int [] arr = {23, 45, 67, 89, 87};
    avg(arr);
    
    */
    
    

    
}
    

}
