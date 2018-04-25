/*
Say that a "clump" in an array is a series of 2 or more adjacent elements of the same value. 
Return the number of clumps in the given array.

countClumps([1, 2, 2, 3, 4, 4]) → 2
countClumps([1, 1, 2, 1, 1]) → 2
countClumps([1, 1, 1, 1, 1]) → 1
*/

public int countClumps(int[] nums) {
  int clumpcount = 0;
  boolean inclump = false;

  for (int i = 1; i < nums.length; i++) {
    if (nums[i] == nums[i-1]) {
      inclump = true;
    }
    if (inclump && (nums[i] != nums[i-1] || i == nums.length-1)) {
      clumpcount++;
    }
    if (nums[i] != nums[i-1]) {
      inclump = false;
    }
  }
  return clumpcount;
}
