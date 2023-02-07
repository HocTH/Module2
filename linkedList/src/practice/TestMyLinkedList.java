package practice;

public class TestMyLinkedList {
    public static void main(String[] args) {
        System.out.println("/=/=/=/= TESTING /=/=/=/=");
        MyLinkedList<Integer> integerMyLinkedList = new MyLinkedList<>();
        integerMyLinkedList.addFirst(1);
        integerMyLinkedList.add(1, 2);
        integerMyLinkedList.add(2, 3);
        integerMyLinkedList.add(3, 4);
        integerMyLinkedList.addLast(5);
        System.out.println("Display linked list: ");
        for (int i = 0; i < integerMyLinkedList.numNodes; i++) {
            System.out.println("Node " + (i + 1) + ": " + integerMyLinkedList.get(i));
        }

    }
}
