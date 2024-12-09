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
}
