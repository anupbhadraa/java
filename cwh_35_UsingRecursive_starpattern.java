public class cwh_35_UsingRecursive_starpattern {

    static void starPattern(int n) {
        if(n > 0) {
            starPattern(n-1);

            for(int i=1; i<=n; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    //statPattern(4)
    //Starpattern(3) + print 4 star and a new line.
    //StarPattern(2) + print 3 star and a new line + print 4 star and a new line.
    //StarPattern(1) + print 2 star and a new line + print 3 star and a new line + print 4 star and a new line. 
    //StarPattern(0) +print 1 star and a new line + print 2 star and a new line + print 3 star and a new line + print 4 star and a new line. 


    public static void main(String[] args) {
        starPattern(4);
    }
 }
