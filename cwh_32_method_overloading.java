public class cwh_32_method_overloading {
    static void foo() {
        System.out.println("Good Morning Bro!");
    }

    static void foo(String a) { //String a - is a paramaeter
        System.out.println("Good moring "+ a + " Bro!");
    }
    
    static void foo(String a, String b) { //String a, String b - are paramaeters
        System.out.println("Good moring "+ a + " Bro!");
        System.out.println("Good moring "+ b + " Bro!");
    }

    public static void main(String[] args) {
        String name, name2;
        name = "anup";
        name2 = "arup";
        foo(name, name2); // name and name2 are arguments & Arguments are actual.
        
    }
}
