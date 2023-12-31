class Base1 {
    public int x;

    public Base1() {
        System.out.println("i am a constructor");
    } 

    public Base1(int x) {
        System.out.println("i am an overloaded constructor with a value of a as: "+x); 
    }

    public Base1(int x,int y) {
        System.out.println("constructor "+ x); 
    }
    

    public void setx(int x) {
        this.x = x;
    }

    public int getx() {
        return x;
    }
}


class Derived1 extends Base1 {
    public int y;

    public Derived1() {
        super(0);
        System.out.println("i am a Derived1 class constructor");
    }

    public Derived1(int x, int y) {
        super(x);
        System.out.println("I am an overloaded constructor of Derived with value  of X & Y is: "+x+ " " +y);
    }

    public void sety(int y) {
        this.y = y;
    }
    
    public int gety() {
        return y;
    }
}

class childOFDerived extends Derived1 {
    childOFDerived() {
        System.out.println("I am a child of derived constructor");
    }

    childOFDerived(int x, int y, int z) {
        super(3, 4);
        System.out.println("I am an overloaded constructor of Derived with value of z as: " + z);
    }
}


public class cwh_46_constructor_in_inheritance {
    public static void main(String [] args) {
        // Base1 b = new Base1();
        // Derived1 d = new Derived1();
        // Derived1 d = new Derived1(4, 5); 
        childOFDerived child = new childOFDerived(10, 20, 30);
    }
    
}
