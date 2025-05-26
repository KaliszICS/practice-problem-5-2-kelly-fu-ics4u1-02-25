public class Circle {
    private double radius;

    // Constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Getter
    public double getRadius() {
        return radius;
    }

    // Setter
    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Diameter of the circle
    public double diameter() {
        return 2 * radius;
    }

    // Perimeter (Circumference) of the circle
    public double perimeter() {
        return 2 * Math.PI * radius;
    }

    // Area of the circle
    public double area() {
        return Math.PI * radius * radius;
    }
}
