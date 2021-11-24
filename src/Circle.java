public class Circle {
    private double radius;

    public double getRadius() {
        return radius;
    }

    public Circle(double radius) {
        this.radius = radius;
    }
    public double calculateArea(){
        return Math.PI * radius * radius;
    }
}
