package net.estremadoyro.main;

import java.util.Arrays;
import java.util.HashMap;
import java.util.stream.Stream;

public class PlusOne {
    public int[] main() {
        int[] digits = new int[]{9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
        System.out.printf("digits: %s%n", Arrays.toString(digits));
        return plusOne(digits);
    }

    private int[] plusOne(int[] digits) {
        // Constraints
        // digits doesn't have leading 0s
        // Ordered from most to least significant (As a normal number order)
        // digits have at least 1 element

        // #1 Approach
        // Get the # of digits
        // Iterate through digits, and multiply by 10* depending on the order
        // Accumulate this sum to get the number as an Int
        // Add 1 to the number
        // Iterate the final number to create an output array

        // # 2 Approach (Used)
        // Iterate through the digits
        //   Check from right to left (n-length-1), if it's a 9, swap it for 0, if not break the loop
        // If there were no 9's, then just increase the last element by +1
        // If all were 9 (0 to this point), append 1 to the beginning
        // If none of the above were met, then append +1 to the element to the left of the last index were 9 was found
        HashMap<Integer, Integer> positions9FoundMap = new HashMap<>();

        for (int i = 0; i < digits.length; i++) {
            int j = digits.length - i - 1;
            System.out.printf("j value: %d%n", j);
            System.out.printf("digits[%d]: %d%n", j, digits[j]);
            if (digits[j] == 9) {
                positions9FoundMap.put(i, j);
                digits[j] = 0;
            } else {
                break;
            }
        }

        if (positions9FoundMap.size() == 0) {
            // No 9's -> Add one to the last element
            digits[digits.length - 1]++;
            return digits;
        }
        if (positions9FoundMap.size() == digits.length) {
            // All 9's -> Add 1 to the beginning
            int[] output = Arrays.copyOf(new int[]{1}, digits.length + 1);
            System.arraycopy(digits, 0, output, 1, digits.length);
            return output;
        } else {
            // Some 9's found -> Add 1 to the (k-1) of the pos. were the last 9 was found
            int lastIndexFound = positions9FoundMap.get(positions9FoundMap.size() - 1);
            digits[lastIndexFound - 1]++;
            return digits;
        }
    }

    private int[] filterElementsInArray(int[] array) {
        return Arrays.stream(array).filter(x -> x != -1).toArray();
    }
}
