class cylinder {
    private int radius;
    private int height;

    public void setRadius(int r) {
        radius = r;
    }

    public int getRadius() {
        return radius;
    }

    public void setHeight(int h) {
        height = h;
    }

    public int getHeight() {
        return height;
    }
}

public class cwh_44_practice_problem_set_9 {
    public static void main(String[] args) {
        cylinder result = new cylinder();
        
        result.setRadius(5);
        result.setHeight(10);

        System.out.println(result.getRadius());
        System.out.println(result.getHeight());
    }
}