package net.estremadoyro.main;

public class MergeTwoSortedLists {
    LinkedList ll = new LinkedList();

    public Node result() {

//        Node list1 = ll.customLinkedList(new int[]{1, 2, 4});
//        Node list2 = ll.customLinkedList(new int[]{1, 3, 4});
        Node list1 = this.ll.customLinkedList(new int[]{1, 2, 4, 8, 10});
        Node list2 = this.ll.customLinkedList(new int[]{1, 3, 4, 5, 6, 7, 9});

        return this.mergeTwoLists(list1, list2);
    }

    private Node mergeTwoLists(Node list1, Node list2) {
        // Splicing nodes OVER recreating them from scratch
        // list1 = {1, 2, 4}
        // list2 = {1, 3, 4, 5}
        // list3 = {1, 1, 2, 3, 4, 4, 5}
        Node list3 = new Node();
        // Keep the first node without value, append next() Nodes to it
        Node pointer = list3;

        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                pointer.next = list1;
                list1 = list1.next;
            } else if (list1.val > list2.val) {
                pointer.next = list2;
                list2 = list2.next;
            }
            pointer = pointer.next;
        }

        if (list1 == null) {
            pointer.next = list2;
        } else if (list2 == null) {
            pointer.next = list1;
        }

        return list3.next;
    }
}
