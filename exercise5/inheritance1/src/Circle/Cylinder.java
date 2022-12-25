package Circle;

import javax.lang.model.element.NestingKind;

public class Cylinder extends Circle {
    private double height = 1.0;

    public Cylinder() {
    }

    public Cylinder(double height) {
        this.height = height;
    }

    public Cylinder(String color, double radius, double height) {
        super(color, radius);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getVolume(){
        return this.height*super.getArea();
    }
    public String toString(){
        return "The Cylinder is height " +getHeight()+" which is a subclass of "+super.toString();
    }
}

