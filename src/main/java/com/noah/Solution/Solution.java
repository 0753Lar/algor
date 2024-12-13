package com.noah.Solution;

import com.noah.utils.Utils.ListNode;

import java.util.ArrayList;
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

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        final ListNode dummyHead = new ListNode(0);
        ListNode current = dummyHead;
        int carry = 0;

        while (l1 != null || l2 != null || carry != 0) {
            int sum = carry;

            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }
            carry = sum / 10;
            current.next = new ListNode(sum % 10);
            current = current.next;
        }
        return dummyHead.next;

    }

    public int lengthOfLongestSubstring(String s) {

        int longest = 0;
        if (s.isEmpty()) {
            return longest;
        }
        int l = 0;
        int r = 0;
        int max = 0;

        while (l < s.length() && r < s.length() && l <= r) {
            if (l == r) {
                r++;
                max = 1;
            } else {
                String substring = s.substring(l, r);
                if (substring.indexOf(s.charAt(r)) == -1) {
                    max++;
                    r++;
                } else {
                    l++;
                    max--;
                }
            }
            longest = Math.max(max, longest);
        }

        System.out.println(longest);
        return longest;
    }
}


