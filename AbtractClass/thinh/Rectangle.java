package thinh;

public class Rectangle extends Shape {
            

public Rectangle(String color, String owner, String borderColor, double a, double b) {
    
    super(color, owner, borderColor);
    this.a = a;
    this.b = b;
}

private double a, b;


@Override
public double getArea() {
    return a * b;
}

@Override
public double getPremeter() {
    return (a + b) * 2;
}

@Override
public void paint() {
    System.out.printf("|%-10s|%5f|%5f|%-15s|%-7s|%-7s|%5f|\n", "Rectangle", a, b, owner, borderColor, color, getArea());
}

public double getA() {
    return a;
}

public void setA(double a) {
    this.a = a;
}

public double getB() {
    return b;
}

public void setB(double b) {
    this.b = b;
}
}

