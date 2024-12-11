import { ListNode } from "../utils/utils";

export class Solution {
  twoSum(nums: number[], target: number): number[] {
    const map: Record<number, number> = {};

    for (let i = 0; i < nums.length; i++) {
      const offset = target - nums[i];
      if (!(offset in map)) {
        map[nums[i]] = i;
      } else {
        return [map[offset], i];
      }
    }

    return [];
  }

  addTwoNumbers(l1: ListNode | null, l2: ListNode | null): ListNode | null {
    if (!l1 && !l2) {
      return null;
    }
    let wip1 = l1;
    let wip2 = l2;

    const sumArr: number[] = [];
    let index = 0;
    while (wip1 || wip2) {
      if (wip1) {
        sumArr[index] = (sumArr[index] ?? 0) + wip1.val;
        wip1 = wip1.next;
      }

      if (wip2) {
        sumArr[index] = (sumArr[index] ?? 0) + wip2.val;
        wip2 = wip2.next;
      }

      index++;
    }

    index = 0;
    const head = new ListNode(0);
    let wip = head;
    while (typeof sumArr[index] === "number") {
      if (sumArr[index] >= 10) {
        sumArr[index] = sumArr[index] % 10;
        sumArr[index + 1] = (sumArr[index + 1] ?? 0) + 1;
      }
      wip.next = new ListNode(sumArr[index]);
      wip = wip.next;
      index++;
    }
    return head.next;
  }
}
