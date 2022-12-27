package day_07_Algo_solve;


public class AlgoQuestion2PrintMiddleNode {

    public static void main(String[] args) {
        Linked_List sll=new Linked_List();
        for (int i = 1; i < 11; i++) {
            sll.add(i);
        }
        sll.printNode();
        System.out.println();
        printMiddle(sll);
    }
    public static void printMiddle(Linked_List sll){
        if(sll.isEmpty()) throw new IllegalArgumentException();
        var sJump=sll.head;
        var dJump=sll.head;
        while(dJump!=sll.tail && dJump.next!=sll.tail){
            sJump=sJump.next;
            dJump=dJump.next.next;
        }
        if(dJump== sll.tail) System.out.println(sJump.value);
        else System.out.println(sJump.value + "," + sJump.next.value);
    }
}