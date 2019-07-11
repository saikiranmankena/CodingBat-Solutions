
// Given an array of ints length 3, return an array with the elements "rotated left" so {1, 2, 3} yields {2, 3, 1}.


// rotateLeft3([1, 2, 3]) → [2, 3, 1]
// rotateLeft3([5, 11, 9]) → [11, 9, 5]
// rotateLeft3([7, 0, 0]) → [0, 0, 7]

public int[] rotateLeft3(int[] nums) {
  int s = nums.length;
  int temp = nums[0];
  nums[0]=nums[1];
  nums[1]=nums[s-1];
  nums[s-1]=temp;
  
  return nums;
  
}

// or this method

// public int[] rotateLeft3(int[] nums) {
//        int[] nums1 = {nums[1], nums[2], nums[0]};
//        return nums1;
//    }