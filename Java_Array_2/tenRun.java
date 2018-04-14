/*
For each multiple of 10 in the given array, change all the values following it to be that multiple 
of 10, until encountering another multiple of 10. So {2, 10, 3, 4, 20, 5} yields {2, 10, 10, 10, 20, 20}.

tenRun([2, 10, 3, 4, 20, 5]) → [2, 10, 10, 10, 20, 20]
tenRun([10, 1, 20, 2]) → [10, 10, 20, 20]
tenRun([10, 1, 9, 20]) → [10, 10, 10, 20]
*/

public int[] tenRun(int[] nums) {
  int z = -1;
  int[] result = new int[nums.length];
  for (int i = 0; i < nums.length; i++) {
    if (nums[i] % 10 == 0 && z != i) {
      z = i;
    }
    if (z != -1) {
      result[i] = nums[z];
    } else {
      result[i] = nums[i];
    }
  }
  return result; 
}