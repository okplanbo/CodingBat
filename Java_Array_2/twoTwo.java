/*
Given an array of ints, return true if every 2 that appears in the array is next to another 2.

twoTwo([4, 2, 2, 3]) → true
twoTwo([2, 2, 4]) → true
twoTwo([2, 2, 4, 2]) → false
*/

public boolean twoTwo(int[] nums) {
  int count22 = 0;
  int count2 = 0;
  
  for(int i = 1; i < nums.length; i++) {
    if (nums[i] == 2) {
      count2++;
    }
    if (nums[i-1] == 2 && nums[i] == 2) {
      count22++;
    }
  }
  
  if (nums.length > 0 && nums[0] == 2) {
    count2++;
  }
  
  if (count2 == 0) { // bad description, should be false
    return true;
  }
  
  return count22 > 0 && count2 - count22 == 1;

}