package com.codegym;

public class TestResize {
    public static void main(String[] args) {
        Shape[] arr = new Shape[3];
        arr[0] = new Rectangle(10,20);
        arr[1] = new Circle(12);
        arr[2] = new Square(3);
        System.out.println("before Resize");
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println("After Resize");
        arr[0].resize(10);
        arr[1].resize(5);
        arr[2].resize(13);
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println("After How to color");
        for (Shape s : arr) {
            if (s instanceof Colorable){
                System.out.println(s);
                s.HowToColor();
            }
        }
    }
}
