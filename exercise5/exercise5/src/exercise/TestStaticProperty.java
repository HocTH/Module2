package exercise;

public class TestStaticProperty {
    public static void main(String[] args) {
        Car car1 = new Car("Honda","V6");
        System.out.println(Car.numberOfCars);
        Car car2 = new Car("Toyota","v7");
        System.out.println(Car.numberOfCars);
        System.out.println(car1.getName());

    }
}
