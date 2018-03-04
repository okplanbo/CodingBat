public boolean has271(int[] nums) {
  int len = nums.length;
  boolean res = false;
  
  if (len > 2) {
    for (int i = 0; i+2 < len; i++) {
      if ((nums[i+1] - nums[i] == 5) && (nums[i]+1 >= nums[i+2]) && (nums[i]-3 <= nums[i+2])) {
        res = true;
      }
    }
  }
  
  return res;
  
}
