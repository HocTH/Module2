package Circle;

public class TestCylinder {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder("red",10,30);
        System.out.println(cylinder.toString());
        System.out.println(cylinder.getArea());
        System.out.println(cylinder.getVolume());
    }
}
