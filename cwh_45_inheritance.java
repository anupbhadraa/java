class Base{
    public int x;

    public int getx() {
        return x;
    }

    public void setx(int x) {
        System.out.println("I am in base and setting x now.");
        this.x = x;
    }

    public void printMe() {
        System.out.println("I am a constructor.");
        
    }
}

class Derived extends Base {
    public int y;

    public int gety() {
        return y;
    }

    public void sety(int y) {
        this.y = y;
    }


}

public class cwh_45_inheritance {
    public static void main(String [] args) {

        //Creating an Objects of base class
        Base b = new Base();
        b.setx(4);
        System.out.println(b.getx());


        //Creating an object of derived class
        Derived d = new Derived();
        d.setx(10);
        System.out.println(d.getx());
        d.sety(100);
        System.out.println(d.gety());

    }
    
}
