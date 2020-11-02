package _6_inheritance.thuc_hanh.circle;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);
        circle = new Circle(3.5);
        System.out.println(circle);
        circle = new Circle("indio" ,false ,3.5);
        System.out.println(circle);
    }
}
