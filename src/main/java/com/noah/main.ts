import { Solution } from "./Solution/solution";
import assert from "assert";

function main() {
  const solution = new Solution();
  assert.deepEqual(solution.twoSum([2, 7, 11, 15], 9), [0, 1], "twoSum error");
}

main();
