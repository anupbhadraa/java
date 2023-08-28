public class cwh_31_methods {
    int logic(int x, int y) {
        int z;
        if(x>y) {
            z = x + y;
        } else {
            z = (x + y) * 5;
        }

        return z;
    }

    public static void main(String[] args) {
        int a = 5;
        int b = 7;
        int c;
        // c = logic(a, b);
        // System.out.println(c);

        //Method invocation using object creation
        cwh_31_methods obj = new cwh_31_methods();
        c = obj.logic(a, b);
    }
}
