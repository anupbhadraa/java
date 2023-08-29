/* 
//problem 1

class employee {
    int salary;
    String name;
    
    public int getSalary() {
        return salary;

    }

    public String getname() {
        return name;
    }

    public void setName(String n) {
        name = n;
    } 
    
    
}



public class cwh_39_practice_problem_set_8 {
    public static void main(String [] args) {
        employee anup = new employee();

        anup.name = "anup kumar bhadra";
        System.out.println(anup.getname());

        anup.setName("arup kumar bhadra");
        System.out.println(anup.getname());

        anup.salary = 200000;
        System.out.println(anup.getSalary());
    }
}


*/

///////////////////////////////////////////////////////////////////////////////////////////////////////

/*
 

//problem 2
class mobile {
    public void ringing() {
        System.out.println("Your Phone is Ringing!");
    }
    
    public void vibrating() {
        System.out.println("Your Phons is Vibrating");
    }
}


public class cwh_39_practice_problem_set_8 {
    public static void main(String [] args) {
        mobile anup = new mobile();

        anup.ringing();
        anup.vibrating();
    }
}
    

*/

//////////////////////////////////////////////////////////////////////////////////////////////////////

/*


//problem 3
class sqr {
    public int sqrArea(int side) {
        int area;
        area = side * side;
        return area;
    } 

    public int sqrPerimeter(int side) {
        int perimeter;
        perimeter = 4 * side;
        return perimeter;
    }
}


public class cwh_39_practice_problem_set_8 {
    public static void main(String[] args) {
        sqr result = new sqr();
        
        System.out.println(result.sqrArea(5));
        System.out.println(result.sqrPerimeter(5));
    }
}


*/

//////////////////////////////////////////////////////////////////////////////////////////////////////////////

/*
 


//problem 4
class rectangel {
    int length, breadth;
    
    public int rectArea() {
        return length * breadth;
    }
    
    public int rectPerimeter() {
        return 2 * (length + breadth);
    }
}

public class cwh_39_practice_problem_set_8{
    public static void main(String[] args) {
        rectangel result = new rectangel();
        
        result.length = 100;
        result.breadth = 50;
        
        System.out.println(result.rectArea());
        System.err.println(result.rectPerimeter());
    }
}


*/

//////////////////////////////////////////////////////////////////////////////////////////

/* 
 
//problem 5
class TommyVecetti{
    public void hitting() {
        System.out.println("TommyVecetti is Hitting.....");
    }

    public void running() {
        System.out.println("TommyVecetti is Running.....");
    }

    public void firing() {
        System.out.println("TommyVecetti is firing.....");
    }
}

public class cwh_39_practice_problem_set_8 {
    public static void main(String[] args) {
        TommyVecetti outcome = new TommyVecetti();

        outcome.hitting();
        outcome.running();
        outcome.firing();
        
        
    }
}


 */

 