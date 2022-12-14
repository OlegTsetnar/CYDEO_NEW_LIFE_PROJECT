package day_02_Node_Linked_List.Node;

public class MySingleLinkedList {
    Node head;
    Node tail;
    int size;
    // constructor here!
    //**********

    public MySingleLinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    // methods here!
    boolean isEmpty() {
        return head == null;
    }
    // Adds element into last position in the linked list

    void add(int data) {
        // create a new node with data value
        Node node = new Node(data);
        // check if empty

        if (isEmpty()) {
            head = tail = node;      //1;
        } else { // add element to last position
            tail.next = node;               //1,2 add first tail of previous node then node
            tail = node;
        }
        size++;
    }

    public int indexOf(int value) {
        int pos = 0;
        Node current = head;
        if (isEmpty())
            return -1;
        while (current != null) {
            if (current.value == value) {
                return pos;
            }
            pos++;
            current = current.next;
        }
        return -1;
    }

    void printNodes() {
        Node current = head;
        while (current != null) {
            if (current.next == null)
                System.out.print(current.value + "=> null");
            else
                System.out.print(current.value + "=>");
            current = current.next;
        }
        System.out.println();
    }

    // deletes all items with the value

    // 1         2           3          4

    // a         b           c          d

    // 2         3           4           null

    void deleteNode(int value) {
        if (isEmpty())
            System.out.println("No values with the value send!!!");
        Node current = head;
        Node prev = head;
        while (current != null) {
            if (current.value == value) {// if you find a match
                if (current == head) { // if the item tobe deleted is the head
                    head = current.next;
                    current.next = null;// will be available for garbage collection
                } else if (current == tail) {// if the item tobe deleted is the tail
                    tail = prev;
                    prev.next = null;
                } else {// if the item tobe deleted is in the middle
                    prev.next = current.next;
                    current.next = null;
                }
                size--;// decrease the size once you
            }
            prev = current;
            current = current.next;
        }
    }

    public int getKthFromLast(int k) {
        Node ptr1 = head;
        Node ptr2 = head;
        for (int i = 0; i < k - 1; i++) {
            ptr2 = ptr2.next;   // k=5;   0,1,2,3;  ptr2 = 3;
            if (ptr2 == null)
                return -1;
        }
        while (ptr2.next != null) {
            ptr1 = ptr1.next;  // ptr1 = from  --> 2 and stop;
            ptr2 = ptr2.next;  // ptr2 = from 3 --> 5 and stop;
        }
        return ptr1.value;
    }

    public void removeKthFromLast(int k) {
        Node prevDelete = null;
        Node ptr1 = head;
        Node ptr2 = head;
        for (int i = 0; i < k - 1; i++) {
            ptr2 = ptr2.next;
            if (ptr2 == null)
                System.out.println("No such value");
            ;
        }
        while (ptr2.next != null) {
            prevDelete = ptr1;
            ptr1 = ptr1.next;
            ptr2 = ptr2.next;
        }
        if (ptr1 == head) {
            head = ptr1.next;
            ptr1.next = null;
            size--;
        } else {
            prevDelete.next = ptr1.next;
            ptr1.next = null;
            size--;
        }
    }

    // Assignment 4 Reverse the Nodes of Singly Linked List in one pass
    void reverse() {
        if (isEmpty())
            return;
        Node previous = head;
        Node current = head.next;
        while (current != null) {
            Node nextNode = current.next;
            current.next = previous;
            previous = current;
            current = nextNode;
        }
        tail = head;
        tail.next = null;
        head = previous;
    }

    // Assignment 3 Remove Duplicated values from SLL
    // O(n) time | O(1) space - where n is the number of nodes in the Linked List
    void removeDuplicatesFromLinkedList() {
        Node current = head;
        while (current != null) {
            Node nextDistinctNode = current.next;
            while (nextDistinctNode != null && nextDistinctNode.value == current.value) {
                nextDistinctNode = nextDistinctNode.next;
            }
            current.next = nextDistinctNode;
            current = nextDistinctNode;
        }
    }
}






