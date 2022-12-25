package Point;

public class Point3D extends Point2D{
    private float z =0;
    public Point3D(){

    };

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public void setXYZ(float x, float y, float z){
        this.z=z;
        setX(x);
        setY(y);
    }
    public float[] getXYZ(){
        float[] array = {getX(),getY(),getZ()};
        return array;
    }
    public String toString(){
        return "("+getX()+","+getY()+","+getZ()+")";
    }

    public static void main(String[] args) {
        Point3D point3D = new Point3D(10,10,0);
        System.out.println(point3D.toString());
    }
}
