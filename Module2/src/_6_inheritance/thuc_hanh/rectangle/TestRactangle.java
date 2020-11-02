package _6_inheritance.thuc_hanh.rectangle;

public class TestRactangle {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);
        rectangle = new Rectangle(2.3,1.8);
        System.out.println(rectangle);
        rectangle = new Rectangle("orange",true,2.5,1.8);
        System.out.println(rectangle );
    }
}
