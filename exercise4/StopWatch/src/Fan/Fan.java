package Fan;

public class Fan {
    private static final int SLOW = 1;
    private static final int MEDIUM = 2;
    private static final int FAST = 3;
    private int speed = SLOW;
    private boolean on = false;
    private double radius = 5;
    private String color = "blue";

    public Fan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    public int getSpeed() {
        return speed;
    }

    public boolean isOn() {
        return false;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public Fan(){

    }
    public String toString(){
        if ( this.on){
            return "Speed "+this.speed + " Color "+this.color+ " Radius "+this.radius + " fan is on";
        } else {
            return "Color "+ this.color+" Radius "+ this.radius + " fan is off";
        }
    }

    public static void main(String[] args) {
        Fan fan1 = new Fan(10,true,10,"yellow");
        Fan fan2 = new Fan(5,false,5,"blue");
        System.out.println(fan2.toString());
        System.out.println(fan1.toString());
    }
}
