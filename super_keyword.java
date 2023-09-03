class a {
    a() {
        System.out.println("I am a viewer");
    }
}

class b extends a{
    
    b() {
        System.out.println("I am a learner");
    }
}



public class super_keyword {
    public static void main(String[] args) {
        b result = new b();
        // result.show();

    }
}
