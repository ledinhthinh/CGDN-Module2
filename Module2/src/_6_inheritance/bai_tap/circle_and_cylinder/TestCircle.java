package _6_inheritance.bai_tap.circle_and_cylinder;

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

