package AccessModifier;

public class AccessModifier {
    private double radius = 1;
    private String color = "red";

    public AccessModifier() {
    }

    public AccessModifier(double radius) {
        this.radius = radius;
    }
    public double getRadius(){
        return this.radius;
    }
    public double getArea(){
        return  Math.PI*Math.pow(this.radius,2);
    }

    public static void main(String[] args) {
        AccessModifier circle1 = new AccessModifier(12);
        System.out.println(circle1.getArea());
    }
}
