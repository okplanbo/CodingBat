/*
(This is a slightly harder version of the fix34 problem.) Return an array that contains exactly 
the same numbers as the given array, but rearranged so that every 4 is immediately followed by a 5. 
Do not move the 4's, but every other number may move. The array contains the same number of 4's and 5's, 
and every 4 has a number after it that is not a 4. In this version, 5's may appear anywhere in the original array.

fix45([5, 4, 9, 4, 9, 5]) → [9, 4, 5, 4, 5, 9]
fix45([1, 4, 1, 5]) → [1, 4, 5, 1]
fix45([1, 4, 1, 5, 5, 4, 1]) → [1, 4, 5, 1, 1, 4, 5]
*/

public int[] fix45(int[] nums) {
  int pos5 = -1;
  if (nums.length > 0 && nums[0] == 5) {
    pos5 = 0;
  }
  for (int i = 1; i < nums.length; i++) {
    if (nums[i] == 5 && nums[i-1] != 4 && pos5 == -1) {
      pos5 = i;
      i = 1;
    }
    if (nums[i-1] == 4 && nums[i] != 5 && pos5 > -1) {
      nums[pos5] = nums[i];
      nums[i] = 5;
      i = 0;
      pos5 = -1;
    }
  }
  return nums;
}