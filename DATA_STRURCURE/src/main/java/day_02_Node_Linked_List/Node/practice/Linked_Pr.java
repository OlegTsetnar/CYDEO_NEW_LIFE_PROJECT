package day_02_Node_Linked_List.Node.practice;

import day_02_Node_Linked_List.Node.Node;

public class Linked_Pr {

    Node_pr head;
    Node_pr tail;
    int size;

    public Linked_Pr() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    boolean isEmpty() {
        return head == null;
    }

    void add(int value) {
        Node_pr node_pr = new Node_pr(value);
        if (isEmpty()) {
            head = tail = node_pr;
        } else {
            tail.next = node_pr;    // for previous node we are adding new node
            tail = node_pr;
        }
        size++;
    }

    void printNode() {
        Node_pr current = head;
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
        Node_pr current = head;
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
        Node_pr current = head;
        Node_pr previous = head;
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
        Node_pr pointNeeded = head;
        Node_pr pointLast = head;

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
        Node_pr pointNeeded = head;
        Node_pr pointLast = head;
        Node_pr previous = null;
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
        Node_pr current = head;
        while (current != null) {
            Node_pr next_Distinct_Node = current.next;
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
        Node_pr previous = head;
        Node_pr current = head.next;
        while (current != null) {
            Node_pr nextNode = current.next;
            current.next = previous;
            previous = current;
            current = nextNode;
        }
        tail = head;
        tail.next = null;
        head = previous;
    }
}





