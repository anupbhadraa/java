class a {
    a(int a) {
        System.out.println("I am a viewer" +a);
    }
}

class b extends a{
    
    b() {
        super(1);
        System.out.println("I am a learner");
    }
}



public class super_keyword {
    public static void main(String[] args) {
        b result = new b();
        // result.show();

    }
}
