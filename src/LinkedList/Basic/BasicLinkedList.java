package LinkedList.Basic;

public class BasicLinkedList {

    public static void display(Node head){
        while(head!=null){
            System.out.print(head.data+" -> ");
            head=head.next;
        }
    }
    public static Node head;
    public static Node tail;

    public static void insertEnd(int data){
        Node newNode = new Node(data);
        if(head==null){
            head = newNode;
            tail = newNode;
        }
        else{
            newNode.next = tail;
            tail = newNode;
        }
    }

    public static void recursive(Node head){
        if(head==null){
            return;
        }
        System.out.print(head.data+" -> ");
        recursive(head.next);

    }
    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);

        // connect Node
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

        System.out.print(a.data+ "->");
        System.out.print(b.data+ "->");
        System.out.print(c.data+ "->");
        System.out.print(d.data+ "->");
        System.out.print(e.data+ "->");
        System.out.println(e.next);

        // second method

        System.out.print(a.data+"->");
        System.out.print(a.next.data+"->");
        System.out.print(a.next.next.data+"->");
        System.out.print(a.next.next.next.data+"->");
        System.out.print(a.next.next.next.next.data+"->");
        System.out.println(a.next.next.next.next.next);

        // by using for loop
        Node temp = a;
        for(int i=1;i<=5;i++){
            System.out.print(temp.data+" -> ");
            temp = temp.next;
        }

        System.out.println();
        // by using while loop
        Node temp1 = a;
        while(temp1!=null){
            System.out.print(temp1.data+" -> ");
            temp1 = temp1.next;
        }

        System.out.println();
        // by using method
        display(a);

        System.out.println();
        // by using recursion
        recursive(a);

    }
}
