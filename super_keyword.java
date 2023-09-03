class a {
    a() {
        System.out.println();
    }
    a(int a) {
        System.out.println("I am a viewer" +a);
    }

    a(int a, int b) {
        System.out.println("I am a 2nd viewer.");
    }
}

class b extends a{
    
    b(int a) {
        super(2, 4);
        System.out.println("I am a 2nd learner");
    }
}

class c extends b {
    c() {
        super(1);
        System.out.println("hello anup!");

    }
}



public class super_keyword {
    public static void main(String[] args) {
        b result = new b(4);
        // result.show();

    }
}
