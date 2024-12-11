import assert from "assert";

//  Definition for singly-linked list.
export class ListNode {
  val: number;
  next: ListNode | null;
  constructor(val?: number, next?: ListNode | null) {
    this.val = val === undefined ? 0 : val;
    this.next = next === undefined ? null : next;
  }
}

export function arr2ListNode(...nums: number[]): ListNode | null {
  const [first, ...rest] = nums;
  return typeof first === "number"
    ? new ListNode(first, arr2ListNode(...rest))
    : null;
}

assert.deepEqual(
  arr2ListNode(3, 1),
  new ListNode(3, new ListNode(1)),
  "arr2ListNode error"
);
