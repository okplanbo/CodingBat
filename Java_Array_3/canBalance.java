/*
Given a non-empty array, return true if there is a place to split the array so that the sum 
of the numbers on one side is equal to the sum of the numbers on the other side.

canBalance([1, 1, 1, 2, 1]) → true
canBalance([2, 1, 1, 2, 1]) → false
canBalance([10, 10]) → true
*/

public boolean canBalance(int[] nums) {
  int sumleft = 0;
  int sumright = 0;
  
  if (nums.length < 2) {
    return false;
  }
  
  for (int i = 0; i < nums.length; i++) {
    for (int j = 0; j < i; j++) {
      sumleft += nums[j];
    }
    for (int j = i; j < nums.length; j++) {
      sumright += nums[j];
    }
    if (sumleft == sumright) {
      return true;
    } else {
      sumright = 0;
      sumleft = 0;
    }
  }
  
  return false;
}