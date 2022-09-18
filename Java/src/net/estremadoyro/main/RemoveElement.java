package net.estremadoyro.main;

import java.util.Arrays;

public class RemoveElement {
    public int main() {
        int[] nums = {3, 2, 2, 3};
        int val = 3;

        return removeElement(nums, val);
    }

    private int removeElement(int[] nums, int val) {
        // [3, 2, 2, 3] | val = 3
        //  L
        //  R == 3 | CAN'T BE USED TO REPLACE

        //     R != 3 | CAN USE TO REPLACE
        // [2, 2, 2, 3] SWAPPED L(3) WITH 2
        //     L

        //        R != 3 | CAN USE TO REPLACE
        // [2, 2, 2, 3] SWAPPED L(2) WITH 2
        //        L

        //           R == 3 | CAN'T BE USED TO REPLACE
        // OUTPUT: [2, 2, 2, 3] | k = L = 2
        if (nums.length < 1) {
            return 0;
        }

        int left = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[left] = nums[i];
                left++;
            }
        }
        System.out.format("Transformed nums: %s%n", Arrays.toString(nums));
        return left;
    }
}
