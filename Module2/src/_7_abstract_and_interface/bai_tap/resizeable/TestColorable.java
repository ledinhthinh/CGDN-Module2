package _7_abstract_and_interface.bai_tap.resizeable;

public class TestColorable {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Square(1);
        shapes[1] = new Circle(2);
        shapes[2] = new Rectangle(2, 7);
        System.out.println("Ban đầu");
        for (Shape shape : shapes) {
            System.out.println(shape);
        }
        System.out.println("Sau khi duyệt");
        for (Shape shape : shapes) {
            if (shape instanceof Colorable) {
                ((Colorable) shape).howToColor();
                System.out.println("Hinh co chua Colorable: " + shape);
            } else System.out.println("Hinh khong co chua colorable: " + shape);
        }
    }
}
