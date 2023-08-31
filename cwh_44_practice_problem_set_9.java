class cylinder {
    private int radius;
    private int height;

    // public void setRadius(int r) {
    //     radius = r;
    // }

    // public int getRadius() {
    //     return radius;
    // }

    // public void setHeight(int h) {
    //     height = h;
    // }

    // public int getHeight() {
    //     return height;
    // }

    

    public cylinder() {
        radius = 5;
        height = 10;
    }

    public double surfaceArea() {
        return (2 * Math.PI * radius * height) + (2 * 3.14 * radius * radius);
    }

    public double volume() {
        return Math.PI * radius * radius * height;
    }
}

public class cwh_44_practice_problem_set_9 {
    public static void main(String[] args) {
        cylinder result = new cylinder();
        
        // result.setRadius(5);
        // result.setHeight(10);

        // System.out.println(result.getRadius());
        // System.out.println(result.getHeight());

        System.out.println(result.surfaceArea());
        System.out.println(result.volume());
    }
}
