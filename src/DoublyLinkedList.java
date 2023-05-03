public class DoublyLinkedList {
    Node head;
    Node tail;

    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            head.previous = null;
            tail.next = null;
        } else {
            tail.next = newNode;
            newNode.previous = tail;
            tail = newNode;
            tail.next = null;
        }
    }
    public  void print(){
        Node currentNode = head;
        System.out.println("Linked List : ");
        while(currentNode != null){
            System.out.println(currentNode.data + " ");
            currentNode = currentNode.next;
        }
    }
}
class Main{
    public static void main(String[] args){
        DoublyLinkedList l = new DoublyLinkedList();
        l.add(10);
        l.add(20);
        l.add(30);
        l.add(40);
        l.print();
    }
}