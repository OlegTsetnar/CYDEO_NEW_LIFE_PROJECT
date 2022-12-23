package day_02_Node_Linked_List.Node.practice;

public class Linked_run_class {
    public static void main(String[] args) {
        Linked_Pr linked_pr = new Linked_Pr();
        for (int i = 0; i < 11; i++) {
            linked_pr.add(i);

        }
        //        linked_pr.printNode();
        //        System.out.println(linked_pr.index_of(2));
        //        linked_pr.delete(1);
        //
        //        linked_pr.printNode();

        System.out.println(linked_pr.getIndexFromLastElement(4));
        linked_pr.removeIndexFromLastElement(4);
        linked_pr.printNode();

    }
}

