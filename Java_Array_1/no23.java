/*
Given an int array length 2, return true if it does not contain a 2 or 3.

no23([4, 5]) → true
no23([4, 2]) → false
no23([3, 5]) → false
*/	

public boolean no23(int[] nums) {
  return !Arrays.stream(nums).anyMatch(i -> i == 2 || i == 3);
}