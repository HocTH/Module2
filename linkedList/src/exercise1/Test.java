package exercise1;

import practice.MyList;

public class Test {
    public static void main(String[] args) {
       MyList<Integer> listInterger = new MyList<Integer>();
       listInterger.add(1);
       listInterger.add(2);
       listInterger.add(3);
        System.out.println("element 1:"+ listInterger.get(2));
    }
}
