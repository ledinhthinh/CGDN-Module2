package _6_inheritance.thuc_hanh.square;

public class TestSquare {
    public static void main(String[] args) {
        Square square = new Square();
        System.out.println(square);

        square = new Square(2.3);
        System.out.println(square);

        square = new Square("yelow",true,5.8,2.3);
        System.out.println(square);
    }
}
