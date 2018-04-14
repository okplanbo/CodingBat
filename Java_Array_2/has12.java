/*
Given an array of ints, return true if there is a 1 in the array with a 2 somewhere later in the array.

has12([1, 3, 2]) → true
has12([3, 1, 2]) → true
has12([3, 1, 4, 5, 2]) → true
*/

public boolean has12(int[] nums) {
  boolean gotone = false;
  for (int i = 0; i < nums.length; i++) {
    if (nums[i] == 1) {
      gotone = true;
    }
    if (nums[i] == 2 && gotone) {
      return true;
    }
  }
  return false;
}