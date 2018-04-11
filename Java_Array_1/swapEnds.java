/*
Given an array of ints, swap the first and last elements in the array. 
Return the modified array. The array length will be at least 1.

swapEnds([1, 2, 3, 4]) → [4, 2, 3, 1]
swapEnds([1, 2, 3]) → [3, 2, 1]
swapEnds([8, 6, 7, 9, 5]) → [5, 6, 7, 9, 8]
*/	

public int[] swapEnds(int[] nums) {
  int[] result = new int[nums.length];
  //System.arraycopy(nums, 0, result, 0, nums.length);
  for (int i = 0; i < nums.length; i++) {
    result[i] = nums[i];
  }
  result[0] = nums[nums.length-1];
  result[result.length-1] = nums[0];
  return result;
}