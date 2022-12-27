package day_07_Algo_solve;

public class Linked_List {

    Node head;
    Node tail;
    int size;

    public Linked_List() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    boolean isEmpty() {
        return head == null;
    }

    void add(int value) {
        Node node_ = new Node(value);
        if (isEmpty()) {
            head = tail = node_;
        } else {
            tail.next = node_;    // for previous node we are adding new node
            tail = node_;
        }
        size++;
    }

    void printNode() {
        Node current = head;
        while (current != null) {
            if (current.next == null) {
                System.out.print(current.value + " => null ");
            } else {
                System.out.print(current.value + " => ");
            }
            current = current.next;
        }
        System.out.println();
    }

    int index_of(int value) {
        int pos = 0;
        Node current = head;
        if (isEmpty()) {
            return -1;
        }
        while (current != null) {
            if (current.value == value) {
                return pos;
            }
            pos++;
            current = current.next;
        }
        return -1;
    }

    void delete(int value) {
        Node current = head;
        Node previous = head;
        if (isEmpty()) {
            System.out.println("its empty");
        }
        while (current != null) {
            if (current.value == value) {
                if (current == head) {
                    head = current.next;
                    current.next = null;
                } else if (current == tail) {
                    tail = previous;
                    previous.next = null;
                } else {
                    previous.next = current.next;
                    current.next = null;
                }
                size--;
            }
            previous = current;
            current = current.next;
        }
    }

    public int getIndexFromLastElement(int index) {
        Node pointNeeded = head;
        Node pointLast = head;

        for (int i = 0; i < index - 1; i++) {
            pointLast = pointLast.next;
            if (pointLast == null)
                return -1;
        }
        while (pointLast.next != null) {
            pointNeeded = pointNeeded.next;
            pointLast = pointLast.next;
        }
        return pointNeeded.value;
    }

    public void removeIndexFromLastElement(int index) {
        Node pointNeeded = head;
        Node pointLast = head;
        Node previous = null;
        for (int i = 0; i < index - 1; i++) {
            pointLast = pointLast.next;
            if (pointLast == null) {
                System.out.println("no values");
            }
        }
        while (pointLast.next != null) {

            previous = pointNeeded;
            pointNeeded = pointNeeded.next;
            pointLast = pointLast.next;
        }

        if (pointNeeded == head) {
            head = pointNeeded.next;
            pointNeeded.next = null;
            size--;
        } else {
            previous.next = pointNeeded.next;
            pointNeeded.next = null;
            size--;
        }
    }

    public void removeDuplicateNodes() {
        Node current = head;
        while (current != null) {
            Node next_Distinct_Node = current.next;
            while (next_Distinct_Node != null && next_Distinct_Node.value == current.value) {
                next_Distinct_Node = next_Distinct_Node.next;
            }
            current.next = next_Distinct_Node;
            current = next_Distinct_Node;
        }
    }

    public void reverse() {
        if (isEmpty()) {
            return;
        }
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
}





