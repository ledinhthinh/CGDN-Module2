package _6_inheritance.bai_tap.circle_and_cylinder;

public class Cylinder extends Circle {
    private double length = 1.0;

    public Cylinder() {
    }

    public Cylinder(double length) {
        this.length = length;
    }

    public Cylinder(double radius, double length) {
        super(radius);
        this.length = length;
    }

    public Cylinder(String color, boolean filled, double radius, double length) {
        super(color, filled, radius);
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getVolume() {
        return length * getPerimeter();
    }

//

    @Override
    public String toString() {
        return "Cylinder{" +
                "length= " + length +
                " Volume= " + getVolume() +
                '}';
    }
}
