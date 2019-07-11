
// Given an int array, return true if the array contains 2 twice, or 3 twice. The array will be length 0, 1, or 2.


// double23([2, 2]) → true
// double23([3, 3]) → true
// double23([2, 3]) → false

public boolean double23(int[] nums) {
  int s = nums.length;
  int count =0;
  int three=0;
  if(s==0 || s== 1){
    return false;
  }else if(s>1){
    for(int i=0;i<s;i++){
      if(nums[i]== 2)
      count ++;
      if(nums[i]==3)
      three++;
    }
    
    if(count >1 || three >1)
    return true;
  }
  return false;
}
