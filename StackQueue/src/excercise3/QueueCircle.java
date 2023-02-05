package excercise3;

public class QueueCircle {
    static class Node
    {
        int data;
        Node  link;
    }

    static class Queue
    {
        Node  front,  rear;
    }
    static void enQueue(Queue q, int value)
    {
        Node  temp = new Node();
        temp .data = value;
        if (q .front ==  null)
            q .front = temp;
        else
            q .rear .link = temp;

        q .rear = temp;
        q .rear .link = q .front;
    }
    static  int deQueue(Queue q)
    {
        if (q .front ==  null)
        {
            System.out.printf ("\nQueue is empty");
            return Integer.MIN_VALUE;
        }
        int value;
        if (q .front == q .rear)
        {
            value = q .front .data;
            q .front =  null;
            q .rear =  null;
        }
        else
        {
            Node  temp = q .front;
            value = temp .data;
            q .front = q .front .link;
            q .rear .link= q .front;
        }

        return value ;
    }

    static void displayQueue( Queue q)
    {
        Node  temp = q .front;
        System.out.printf("\nElements in Circular Queue are: ");
        while (temp .link != q .front)
        {
            System.out.printf("%d ", temp .data);
            temp = temp .link;
        }
        System.out.printf("%d", temp .data);
    }

    public static void main(String args[])
    {
        Queue t = new Queue();
        t .front = t .rear =  null;
        enQueue(t, 15);
        enQueue(t, 10);
        enQueue(t, 5);
        displayQueue(t);
        System.out.printf("\nDeleted value = %d", deQueue(t));
        System.out.printf("\nDeleted value = %d", deQueue(t));
        displayQueue(t);
        enQueue(t, 9);
        enQueue(t, 20);
        displayQueue(t);
}
}