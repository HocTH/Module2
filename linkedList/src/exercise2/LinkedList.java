package exercise2;

public class LinkedList {
    private Node head;
    private int numNodes;

    public LinkedList(Object data) {
        head = new Node(data);
    }

    public class Node{
        private Object data;
        private Node next;
        public Node(Object data){
            this.data = data;
        }
        public Object getData(){
            return this.data;
        }
    }

}
