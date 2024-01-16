package thinh;

public class Disk  extends Shape{
    public Disk(String color, String owner, String borderColor, String smile, double radius) {
        super(color, owner, borderColor);
        //TODO Auto-generated constructor stub
        this.smile = smile;
        this.radius = radius;
    }
    public static final double PI = 3.14;
    
    private String smile;
    private double radius;
    public String getSmile() {
        return smile;
    }
    public void setSmile(String smile) {
        this.smile = smile;
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    @Override
    public double getArea() {
        return radius * radius * PI;
    }
    @Override
    public double getPremeter() {
        // TODO Auto-generated method stub
        return 2 * PI * radius;
    }
    @Override
    public void paint() {
        // TODO Auto-generated method stub
        System.out.printf("|%-10s|%5f|%-15s|%-7s|%-7s|%5f|\n", "Disk", radius, owner, borderColor, color, getArea());
    }
}
