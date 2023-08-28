class Employee {
        int id;
        String name;
        public void printDetails() {
            System.out.println("My is ID " + id);
            System.out.println("And my name is "+name);
        }
    }

public class cwh_38_custom_class {
    public static void main(String [] args) {
        System.out.println("This is our custom class");
        Employee anup = new Employee(); //instantiating a new Employee Object
        Employee arup = new Employee(); //instantiating a new Employee Object

        
        //Setting Attributes    
        anup.id = 4009;
        anup.name = "Anup Kumar Bhadra";
        // System.out.println(anup.id);
        // System.out.println(anup.name);

        arup.id = 26;
        arup.name = "Arup Kumar Bhadra";

        anup.printDetails();
        arup.printDetails(); 

        
    }
}
