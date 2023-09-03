class employee01 {
    private int id;
    private String name;

    public employee01() {
        id = 4009;
        name = "Anup Kumar Bhadra";
    }

    public employee01(String myName, int myId) {
        id = myId;
        name = myName;
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
        employee01 anup = new employee01("arup kumar bhadra",26);
        System.out.println(anup.getID());
        System.out.println(anup.getName());
    }
}