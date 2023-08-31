class employee {
    private int id;
    private String name;

    public employee() {
        id = 4009;
        name = "Anup Kumar Bhadra";
    }
                
    public void setName(String n) {
        name = n;
    }
                
    public String getName() {
        return name;
    }
                    
    public void setId(int i) {
        id = i;
    }
                
    public int getID() {
        return id;
    }
}

public class cwh_42_constructor {
    public static void main(String[] args) {
        employee anup = new employee();
        System.out.println(anup.getID());
        System.out.println(anup.getName());
    }
}