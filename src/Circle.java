public class Circle extends Shape {


    private double radius=1.0;

    public Circle() {
        radius = 1.0;
    }
    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        double area= Math.pow(radius,2) * Math.PI;
        return area;
    }
    public double getPerimeter() {
        double Perimeter= radius * Math.PI;
        return Perimeter;
    }

    @Override
    public String toString() {
        return "A Circle with radius= "+radius+", which is a subclass of "+super.toString();
    }
}
