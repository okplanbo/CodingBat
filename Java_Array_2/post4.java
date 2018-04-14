/*
Given a non-empty array of ints, return a new array containing the elements from the original array 
that come after the last 4 in the original array. The original array will contain at least one 4. 
Note that it is valid in java to create an array of length 0.

post4([2, 4, 1, 2]) → [1, 2]
post4([4, 1, 4, 2]) → [2]
post4([4, 4, 1, 2, 3]) → [1, 2, 3]
*/

public int[] post4(int[] nums) {
  int pos4 = 0;
  for (int k = nums.length-1; k >= 0; k--) {
    if (nums[k] == 4) {
      pos4 = k;
      break;
    }
  }
  int[] result = new int[nums.length - pos4 - 1];
  for (int i = 0; i < result.length; i++) {
    result[i] = nums[pos4 + 1 + i];
  }
  return result;
}