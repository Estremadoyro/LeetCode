package net.estremadoyro.main;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Input
        Integer[] input = {3, 6, 34, 12, 6, 1, 0, 3, 6, 2, 12, 53};
        System.out.format("Input %s%n", Arrays.toString(input));

        // BubbleSort
        Integer[] bubbleSort = Sorting.bubbleSort(input);

        String bubbleSortOutput = String.format("Bubble sort %s", Arrays.toString(bubbleSort));
        System.out.println(bubbleSortOutput);
        System.out.println("------------------------------------------------------------");

        // 20. ValidParentheses
        System.out.println("-> 20. ValidParentheses");
        ValidParentheses validParentheses = new ValidParentheses();

        String input1 = "()[]{}";
        String input2 = "{[]}";
        System.out.format("ValidParentheses 1 : %b%n", validParentheses.isValid(input1));
        System.out.format("ValidParentheses 2: %b%n", validParentheses.isValid(input2));
        System.out.println("------------------------------------------------------------");

        // Linked list
        System.out.println("-> Linked list");
        LinkedList linkedList = new LinkedList();

        Node headNode = linkedList.headNode;
        ArrayList<Integer> llValues = linkedList.loopLinkedList(headNode);
        int llCount = linkedList.getNodeCount(headNode);

        System.out.format("Node values: %s%n", llValues.toString());
        System.out.format("Node count: %d%n", llCount);
        System.out.println("------------------------------------------------------------");

        // 20. Merge Two Sorted Lists
        System.out.println("21. Merge Two Sorted Lists");
        MergeTwoSortedLists mergeTwoSortedLists = new MergeTwoSortedLists();

        Node mergedSortedLists = mergeTwoSortedLists.result();
        ArrayList<Integer> mergedSortedListsValues = linkedList.loopLinkedList(mergedSortedLists);
        System.out.format("Merged sorted list: %s%n", mergedSortedListsValues.toString());
        System.out.println("------------------------------------------------------------");

        // 27. Remove Element
        System.out.println("27. Remove Element");
        RemoveElement removeElement = new RemoveElement();
        System.out.printf("Removed elements: %d%n", removeElement.main());
        System.out.println("------------------------------------------------------------");

        // 26. Remove Element
        System.out.println("26. Remove duplicates from array (In-place)");
        RemoveDuplicates removeDuplicates = new RemoveDuplicates();
        System.out.format("Duplicates count: %d%n", removeDuplicates.result());
        System.out.println("------------------------------------------------------------");

        // 35. Search Insert Position
        System.out.println("35. Search Insert Position");
        SearchInsertPosition searchInsertPosition = new SearchInsertPosition();
        System.out.printf("Index: %d%n", searchInsertPosition.main());
        System.out.println("------------------------------------------------------------");

        // 58. Length of Last Word
        System.out.println("58. Length of Last Word");
        LengthOfLastWord lengthOfLastWord = new LengthOfLastWord();
        System.out.printf("Length of last word: %d%n", lengthOfLastWord.main());
        System.out.println("------------------------------------------------------------");

    }
}
