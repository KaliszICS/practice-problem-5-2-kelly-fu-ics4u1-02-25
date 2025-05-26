public class Sphere extends Circle {

    // Constructor using Circle's constructor
    public Sphere(double radius) {
        super(radius);
    }

    // Override area method to return surface area of the sphere
    @Override
    public double area() {
        return 4 * Math.PI * getRadius() * getRadius();
    }

    // Volume of the sphere
    public double volume() {
        return (4.0 / 3.0) * Math.PI * Math.pow(getRadius(), 3);
    }
}
