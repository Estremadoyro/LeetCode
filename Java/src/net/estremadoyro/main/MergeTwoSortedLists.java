package net.estremadoyro.main;

public class MergeTwoSortedLists {
    public Node result() {
        LinkedList ll = new LinkedList();

        Node list1 = ll.customLinkedList(new int[]{1, 2, 4});
//        Node list2 = ll.customLinkedList(new int[]{1, 3, 4});

        return this.mergeTwoLists(list1, list1);
    }

    private Node mergeTwoLists(Node list1, Node list2) {
        return list2;
    }

}
