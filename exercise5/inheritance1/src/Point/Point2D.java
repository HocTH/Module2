package Point;

public class Point2D {
    private float x = 0;
    private float y= 0;
    public Point2D (){}
    public Point2D(float x,float y){
        this.x = x;
        this.y=y;
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
    public void setXY(float x,float y){
        this.x =x;
        this.y=y;
    }
    public float[] getXY(){
        float [] array = { getX(),getY()};
        return array;
    }
    public String toString(){
        return "("+getX()+","+getY()+")";
    }
}
