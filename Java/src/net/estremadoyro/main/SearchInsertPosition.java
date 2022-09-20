package net.estremadoyro.main;

import java.util.Arrays;

public class SearchInsertPosition {
    public int main() {
        int[] nums = new int[]{1, 3, 5, 6}; // Is ascending order, unique values
        int target = 5;

        return searchInsert(nums, target);
    }

    private int searchInsert(int[] nums, int target) {
        // Apply Binary Search (Logarithmic Search()

        // Pointers, left & right
        int left = 0;
        int right = nums.length - 1;
        System.out.format("nums: %s | target: %d%n", Arrays.toString(nums), target);

        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                // It's before the Pos(mid)
                right = mid - 1;
            } else {
                // It's past the Pos(mid)
                left = mid + 1;
            }
        }
        // Not found. Left pointer went past the right one
        return left; // or nums.length
    }
}
