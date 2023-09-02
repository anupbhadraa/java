class Base1 {
    public int x;

    public Base1() {
        System.out.println("i am a constructor");
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

    public void sety(int y) {
        this.y = y;
    }
    
    public int gety() {
        return y;
    }
}


public class cwh_46_constructor_in_inheritance {
    public static void main(String [] args) {
        Base1 b = new Base1();
        Derived1 d = new Derived1(); 
    }
    
}
