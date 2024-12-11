package com.noah.utils;

public class Utils {
    //  Definition for singly-linked list.
    public static class ListNode {
        public int val;
        public ListNode next;

        public ListNode() {
        }

        public ListNode(int val) {
            this.val = val;
        }

        public ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (obj == null || getClass() != obj.getClass()) return false;

            ListNode other = (ListNode) obj;
            ListNode current = this;

            while (current != null && other != null) {
                if (current.val != other.val) return false;
                current = current.next;
                other = other.next;
            }

            return current == null && other == null;
        }
    }

    public static ListNode arr2ListNode(int... nums) {
        final ListNode dummyHead = new ListNode(0);
        ListNode current = dummyHead;
        for (int num : nums) {
            current.next = new ListNode(num);
            current = current.next;
        }

        return dummyHead.next;

    }

}
