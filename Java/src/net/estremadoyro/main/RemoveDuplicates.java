package net.estremadoyro.main;

import java.util.Arrays;

public class RemoveDuplicates {
    private final int[] nums = {1, 1, 2};

    public int result() {
        return this.removeDuplicates(this.nums);
    }

    private int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        int left = 1;
        // Firs value will be unique
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[left] = nums[i];
                left++;
            }
        }
        System.out.format("remaining array: %s%n", Arrays.toString(nums));
        return left;
    }
}
