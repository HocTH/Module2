package pratice;

public class CircleTest {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);
        circle =new Circle(10);
        System.out.println(circle);
        circle = new Circle("red",true,3.5);
        System.out.println(circle);
    }
}
