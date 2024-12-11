import { Solution } from "./Solution/solution";
import assert from "assert";
import { arr2ListNode } from "./utils/utils";

function main() {
  const solution = new Solution();
  assert.deepEqual(solution.twoSum([2, 7, 11, 15], 9), [0, 1], "twoSum error");
  assert.deepEqual(
    solution.addTwoNumbers(arr2ListNode(9, 9, 9, 9), arr2ListNode(9, 9)),
    arr2ListNode(8, 9, 0, 0, 1),
    "addTwoNumbers error"
  );
}

main();
