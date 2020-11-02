package _6_inheritance.bai_tap.point_and_moveable_point;

public class MoveablePoint extends Point {
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;

    public MoveablePoint(float x,float y, float xSpeed, float ySpeed) {
        super(x,y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MoveablePoint() {
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void setSpeed(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float[] getSeed() {
        float[] arr = new float[4];
        arr[0] = x;
        arr[1] = y;
        arr[2] = xSpeed;
        arr[3] = ySpeed;
        return arr;
    }

    public MoveablePoint move() {
        super.x += xSpeed;
        super.y += ySpeed;
        return this;
    }

    @Override
    public String toString() {
        move();
        return "MoveablePoint{" +
                "xSpeed=" + xSpeed +
                ", ySpeed=" + ySpeed +
                ",x= " + x +
                ",y= " + y +
                '}';
    }
}
