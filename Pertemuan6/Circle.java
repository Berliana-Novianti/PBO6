/**
 * The Circle class models a circle with a radius and color.
 */
public class Circle {
    // Private instance variables
    private double radius;
    private String color;

    // Constructors (overloaded)
    // 1st (default) constructor
    public Circle() {
        radius = 1.0;
        color = "red";
    }

    // 2nd constructor with given radius, default color
    public Circle(double r) {
        radius = r;
        color = "red";
    }

    // 3rd constructor with given radius and color
    public Circle(double r, String c) {
        radius = r;
        color = c;
    }

    // Getter for radius
    public double getRadius() {
        return radius;
    }

    // Getter for color
    public String getColor() {
        return color;
    }

    // Setter for color
    public void setColor(String color) {
        this.color = color;
    }

    // Method to calculate area of the circle
    public double getArea() {
        return radius * radius * Math.PI;
    }

    // Return a self-descriptive string of this instance in the form of Circle[radius=?,color=?]
    public String toString() {
        return "Circle[radius=" + radius + ", color=" + color + "]";
    }

    // Main method to test the Circle class
    public static void main(String[] args) {
        // Testing default constructor
        Circle c1 = new Circle();
        System.out.println(c1); // Expected: Circle[radius=1.0, color=red]
        System.out.println("Area: " + c1.getArea());

        // Testing constructor with radius
        Circle c2 = new Circle(2.5);
        System.out.println(c2); // Expected: Circle[radius=2.5, color=red]
        System.out.println("Area: " + c2.getArea());

        // Testing constructor with radius and color
        Circle c3 = new Circle(3.0, "blue");
        System.out.println(c3); // Expected: Circle[radius=3.0, color=blue]
        System.out.println("Area: " + c3.getArea());

        // Changing color of c3 using setter
        c3.setColor("green");
        System.out.println(c3); // Expected: Circle[radius=3.0, color=green]
    }
}