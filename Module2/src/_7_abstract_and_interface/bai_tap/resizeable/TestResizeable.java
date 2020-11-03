package _7_abstract_and_interface.bai_tap.resizeable;

public class TestResizeable {
    public static void main(String[] args) {
        double percent = Math.random() * 100;
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(3);
        shapes[1] = new Rectangle(2, 8);
        shapes[2] = new Square(3);
        System.out.println("Pre-sorted: ");
        for (Shape resizeable : shapes) {
            System.out.println(resizeable);
        }
        System.out.println("Pre-sorted: ");
        for (Shape resizeable : shapes) {
            resizeable.resize(percent);
            System.out.println(resizeable);
        }
    }
}
