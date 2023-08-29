class employee {
    private int id;
    private String name;

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


public class cwh_40_ch9 {
    public static void main(String[] args) {
        employee anup = new employee();

        anup.setId(4009);
        anup.setName("Anup Kumar Bhadra");

        System.out.println(anup.getID());
        System.out.println(anup.getName());
    }
}
