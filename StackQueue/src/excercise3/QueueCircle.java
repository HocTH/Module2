package excercise3;

public class QueueCircle {
    public static class Node {
        int data;
        Node link;
    }

    public static class Queue {
        Node front;
        Node rear;
    }

    static void enQueue(Queue h, int value) {
        Node temp = new Node();
        temp.data = value;
        if (h.front == null) {
            h.front = temp;
        } else {
            h.rear.link = temp;
        }
        h.rear = temp;
        h.rear.link = h.front;
    }

    static int deQueue(Queue h) {
        if (h.front == null) {
            System.out.println("Queue is empty");
            return Integer.MIN_VALUE;
        } else {
            int value;
            if (h.front == h.rear) {
                value = h.front.data;
                h.front = null;
                h.rear = null;
            } else {
                Node temp = h.front;
                value = temp.data;
                h.front = h.front.link;
                h.rear.link = h.front;
            }
          return value;
        }
    }
    static void displayQueue(Queue h){
        Node temp = h.front;
        while (temp.link!= h.front){
            System.out.println(temp.data);
            temp=temp.link;
        }
        System.out.println(temp.data);
    }


    public static void main(String[] args) {
       Queue t = new Queue();
        t .front = t .rear =  null;
       enQueue(t,13);
       enQueue(t,11);
       enQueue(t,123);
       displayQueue(t);
        deQueue(t);
        enQueue(t, 9);
        enQueue(t, 20);
    }
}
