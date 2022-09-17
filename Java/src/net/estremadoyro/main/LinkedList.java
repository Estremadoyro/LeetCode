package net.estremadoyro.main;

import java.util.ArrayList;
import java.util.Arrays;

public class LinkedList {
    protected Node headNode;

    // Constructor
    public LinkedList() {
       this.buildLinkedList();
    }

    public Node customLinkedList(int[] values) {
        if (values.length == 0) { return new Node(-1); }
        if (values.length <= 1) { return new Node(values[0]); }
        Node head = new Node(values[0]); // head    -> Node (x001) .next() -> Node (x002)
        Node pointer = head;             // pointer -> Node (x001)
                                         // pointer -> Node (x002)

        for (int i = 1; i < values.length; i++) {
            pointer.setNext(new Node(values[i]));
            pointer = pointer.getNext();
        }
        return head;
    }

    private void buildLinkedList() {
        // Creating nodes
        this.headNode = new Node(6); // head
        Node nodeB = new Node(3);
        Node nodeC = new Node(4);
        Node nodeD = new Node(2);
        Node nodeE = new Node(1);

        // Linking nodes
        // 6 -> 3 -> 4 -> 2 -> 1 -> null
        headNode.setNext(nodeB);
        nodeB.setNext(nodeC);
        nodeC.setNext(nodeD);
        nodeD.setNext(nodeE);
    }

    public ArrayList<Integer> loopLinkedList(Node headNode) {
        Node currentList = headNode;
        ArrayList<Integer> values = new ArrayList<Integer>();

        do {
            values.add(currentList.getValue());
            currentList = currentList.getNext();
        } while (currentList != null);
        return values;
    }

    public int getNodeCount(Node head) {
        int count = 1; // Assuming head.next exists
        Node current = head;

        while (current.getNext() != null) {
            count++;
            current = current.getNext();
        }
        return count;
    }

    public Node insertNewNode(Node node, int value) {
        Node newNode = new Node(value);

        Node currentNode = node;
        while(currentNode.getNext() != null) {
            currentNode = currentNode.getNext();
        }
        currentNode.setNext(newNode);
        return node;
        // currentNode = head
        // while .next() != null
        //   currentNode = currentNode.next()
        // []
        // currentNode.next() = Node(1)
        // - node: [Node(1, null)]
        // newNode = new Node(2, null)
        // currentNode = node
        // node.next() = null
        //   -> currentNode.next() = newNode
        //   -> node = Node(2, null)
        // - node = [Node(1, Node(2, null))]
        // newNode = new Node(4, null)
        // currentNode = node
        // currentNode.next() = Node(2, null)
        //   -> currentNode = Node(2, null)
        // currentNode.next() = null
        //  -> currentNode.next() = newNode
        //  -> node = []
        // currentNode.next() = null
        // currentNode
    }
}

class Node {
    private Node next = null;
    private final int value;

    public Node(int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }

    public Node getNext() {
        return this.next;
    }

    public void setNext(Node node)  {
        this.next = node;
    }
}
