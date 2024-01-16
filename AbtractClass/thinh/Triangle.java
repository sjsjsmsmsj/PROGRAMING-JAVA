package thinh;

public class Triangle extends Shape {
    private double a;
    private double b;
    private double c;

    public Triangle(double a, double b, double c, String owner, String borderColor, String color) {
        super(color, owner, borderColor);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double getArea() {
        double p = getPremeter() / 2;
        return p * (p - a) * (p - b) * (p - c);
    }

    @Override
    public double getPremeter() {
        double p = a + b + c;
        return p;
    }

    @Override
    public void paint() {
        // TODO
    }
}
