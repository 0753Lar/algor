package com.noah.Solution;

import java.util.HashMap;

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        var map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            var offset = target - nums[i];
            if (map.get(offset) == null) {
                map.put(nums[i], i);
            } else {
                return new int[]{map.get(offset), i};
            }
        }
        return new int[]{};
    }
}