package MoveablePoint;

public class Point {
    private float x = 0;
    private float y = 0;
    public Point() {
    }
    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }
    public   void setXY(){
        this.x = x;
        this.y =y;
    }
    public float[] getXY(){
        float [] array = {getX(),getY()};
        return  array;
    }
    public String toString(){
        return "("+getX()+","+getY()+")";
    }
}
