public int array667(int[] nums) {
  int res = 0;
  
  if (nums.length > 2) {
    for (int i = 0; i+2 <= nums.length; i++) {
      if (nums[i] == 6 && (nums[i+1] == 6 || nums[i+1] == 7)) {
        res++;
      }
    }
  }
  
  return res;
  
}
