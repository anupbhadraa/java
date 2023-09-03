class Ekclass {
    public int v;
    public Ekclass(int v) {
        this.v = v;
    }

    public int getv(){
        return v;
    }
}


class doClass extends Ekclass {
    public doClass(int a) {
        super(a);
        System.out.println("i am constructor of doClass: "+a);
    }
}
public class cwh_47_this_super {
    public static void main(String[] args) {
    //     Ekclass a = new Ekclass(5);
    //     System.out.println(a.getv());
           doClass d = new doClass(6);
           

     }
}

// class a {
//     a() {
//         System.out.println("i am constructor of a class a.");
//     }
// }

// class b extends a {
//     b() {
//         System.out.println("i am constructor of class b.");
//     }
// }

// public class cwh_47_this_super {
//     public static void main(String[] args) {
//         b result = new b();

//     }
// }
