import java.util.Scanner;

class LL {
    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    Node head;

    public void insertAtBegin(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void insert(int data) {
        if (head == null) {
            insertAtBegin(data);
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        Node newNode = new Node(data);
        current.next = newNode;
    }

    public void delete(int pos) {
        if (head == null) return;
        
        if (pos == 1) {
            head = head.next;  // Special case: delete the head
            return;
        }

        Node current = head;
        for (int i = 1; current != null && i < pos - 1; i++) {
            current = current.next;
        }

        if (current == null || current.next == null) return; // Position out of range
        current.next = current.next.next; // Skip the node at position `pos`

        
    }

    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }
}

class LinkedList {
    public static void main(String[] args) {
        LL list = new LL();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        while (n-- > 0) {
            int data = sc.nextInt();
            list.insert(data);
        }

        if (n % 2 != 0) {
            int pos=(n + 1) / 2 + 1;
            list.delete(pos);
        } else {
            int pos=n/2+1;
            list.delete(pos);
        }

        list.print();
    }
}
