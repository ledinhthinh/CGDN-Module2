package _5_access_modifier.bai_tap;

public class Circle {
    private String color = "red";
    private double radius = 1.0;

    public Circle(String color, double radius) {
        this.color = color;
        this.radius = radius;
    }

    public Circle() {
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }
    public double getArea(){
        return this.radius * 2 * Math.PI;
    }
}
