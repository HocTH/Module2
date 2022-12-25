package Circle;

public class Circle {
    private String color;
    private double radius;
public Circle(){}
    public Circle(String color, double radius) {
        this.color = color;
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public double getRadius() {
        return radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea(){
        return Math.PI*Math.pow(this.radius,2);
    }
    public double getPerimeter(){
        return Math.PI*2*this.radius;}
    public String toString(){
        return "The circle with color of "+getColor()+ "and radius is" +getRadius();
    }
}