package day_02_Node_Linked_List.Node;

public class LinkedListApp {
    public static void main(String[] args) {
        MySingleLinkedList mySingleLinkedList = new MySingleLinkedList();
        for (int i = 0; i < 11; i++) {
            mySingleLinkedList.add(i);

        }
        System.out.println(mySingleLinkedList.getKthFromLast(5));
//        mySingleLinkedList.printNodes();
//        System.out.println(mySingleLinkedList.indexOf(3));
//        System.out.println(mySingleLinkedList.size);
//       mySingleLinkedList.deleteNode(2);
//        mySingleLinkedList.printNodes();
//        mySingleLinkedList.reverse();
//        mySingleLinkedList.printNodes();


    }
}

