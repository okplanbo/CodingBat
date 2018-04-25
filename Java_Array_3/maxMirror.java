/*
We'll say that a "mirror" section in an array is a group of contiguous elements such that 
somewhere in the array, the same group appears in reverse order. For example, the largest mirror 
section in {1, 2, 3, 8, 9, 3, 2, 1} is length 3 (the {1, 2, 3} part). Return the size of the 
largest mirror section found in the given array.

maxMirror([1, 2, 3, 8, 9, 3, 2, 1]) → 3
maxMirror([1, 2, 1, 4]) → 3
maxMirror([7, 1, 2, 9, 7, 2, 1]) → 2
*/

public int maxMirror(int[] nums) {
  int temp = 0;
  int max = 0;
  boolean equal = false;
  for (int i = 0; i < nums.length; i++) {  // mirror check #1
    for (int j = 0; j < nums.length - i; j++) {
      if (!equal) {
        max = Math.max(temp, max);
        temp = 0;
      }
      if (nums[j] == nums[nums.length - 1 - i - j]) {
        equal = true;
        temp++;
      } else {
        equal = false;
      }
    }
    max = Math.max(temp, max);
    temp = 0;
  }
  
  for (int i = 0; i < nums.length; i++) {  // mirror check #2
    for (int j = i; j < nums.length; j++) {
      if (!equal) {
        max = Math.max(temp, max);
        temp = 0;
      }
      if (nums[j] == nums[nums.length - 1 - j + i]) {
        equal = true;
        temp++;
      } else {
        equal = false;
      }
    }
    max = Math.max(temp, max);
    temp = 0;
  }
  
  return max;
}