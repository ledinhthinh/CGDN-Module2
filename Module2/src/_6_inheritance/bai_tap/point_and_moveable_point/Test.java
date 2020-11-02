package _6_inheritance.bai_tap.point_and_moveable_point;

public class Test {
    public static void main(String[] args) {
        MoveablePoint moveablePoint = new MoveablePoint();
        Point point = new Point();
        System.out.println(point);
        System.out.println(moveablePoint);
        point = new Point(2.4f,6.8f);
        moveablePoint = new MoveablePoint(2.4f,6.8f,4,7);
        System.out.println(point);
        System.out.println(moveablePoint);
    }
}
