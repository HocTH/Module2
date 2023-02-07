package practice;

public class MyLinkedList<E> {
public static class Node{
    Node next;
    Object data;
    public Node(Object data){
        this.data = data;
    }
    public Object getData() {
        return data;
    }
}
Node head;
int numNodes=0;

    public MyLinkedList() {
    }
    public void addFirst(E e){
        Node temp = head;
        head = new Node(e);
        head.next = temp;
        numNodes++;
    }
    public void addLast(E e){
        Node temp = head;
        for (int i = 0; i <numNodes-1 ; i++) {
            temp=temp.next;
        }
        temp.next= new Node(e);
        temp.next = head;
        numNodes++;
    }
    public void add(int index, E element){
        if (head== null || index<=0){
            addFirst(element);
        }
        Node temp = head;
        for (int i = 0; i <index-1&& temp.next != null ; i++) {
            temp= temp.next;
        }
        Node holder = temp.next;
        temp.next = new Node(element);
        temp.next.next = holder;
        numNodes++;
    }
    public E get(int index){
        Node temp= head;
        for (int i = 0; i <index && temp.next != null ; i++) {
            temp = temp.next;
        }
        return (E) temp.getData();
    }
    public E getFirst(){
        return (E) head.getData();
    }
    public E remove(int index){
        if (index<0 || index >=numNodes){
            throw new IllegalArgumentException("index"+ index);
        }
        E data;
        if (index==0){
            data = (E) head.getData();
            head = head.next;
        } else {
            Node temp = head;
            for (int i = 0; i <index-1 ; i++) {
                temp = temp.next;
            }
            data = (E) temp.next.getData();
            temp.next = temp.next.next;
        }
        numNodes--;
        return data;
    }
    public boolean remove(E e){
        if (head.getData() == e){
            head = head.next;
            numNodes--;
            return true;
        }else {
            Node temp = head;
            for (int i = 0; i <numNodes&& temp.next!= null ; i++) {
                if (temp.next.getData() == e){
                    temp.next = temp.next.next;
                    numNodes--;
                    return true;
                }
                temp = temp.next;
            }
        }
        return false;
    }
    public int size(){
        return numNodes;
    }
 public MyLinkedList<E> clone(){
        if (numNodes==0){
            throw new NullPointerException("NumNodes="+numNodes);
        }
        MyLinkedList<E> temp = new MyLinkedList<>();
        Node tempNode = head;
        temp.addFirst((E) tempNode.getData());
        tempNode = tempNode.next;
        while (tempNode != null){
            temp.addFirst((E) tempNode.getData());
            tempNode = tempNode.next;
        }
        return temp;
 }
 public boolean contains( E o){
        Node temp = head;
        while (temp.next != null){
            if( temp.getData() == o){
                return true;
            }
            temp= temp.next;
        }
        if (temp.getData()==o){
            return true;
        }
        return false;
 }
 public int indexOf(E o){
        Node temp = head;
     for (int i = 0; i < numNodes-1 ; i++) {
         if (temp.getData() == o){
             return i;
         }
         temp = temp.next;
     }
     if (temp.getData() == o){
         return numNodes-1;
     }
     return -1 ;
 }
 public void clear(){
        head = null;
        numNodes = 0;
 }
}
