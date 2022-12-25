package MoveablePoint;

public class MoveablePoint extends Point {
    private float xSpeed = 0;
    private float ySpeed = 0;

    public MoveablePoint() {
    }

    public MoveablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MoveablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getXSpeed() {
        return xSpeed;
    }

    public float getYSpeed() {
        return ySpeed;
    }

    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void setSpeed(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float[] getSpeed(float xSpeed, float ySpeed) {
        float [] array = {getXSpeed(),getYSpeed()};
        return array;
    }
    public String toString(){
        return "("+getX()+","+getY()+") speed=("+getXSpeed()+","+getYSpeed()+")";
    }
    public MoveablePoint move(){
        setX(getX()+getXSpeed());
        setY(getY()+getYSpeed());
        return  this;
    }

    public static void main(String[] args) {
        MoveablePoint moveablePoint = new MoveablePoint(10,10,100,100);
        System.out.println(moveablePoint.toString());
        moveablePoint.move();
        System.out.println(moveablePoint.toString());
    }
}
