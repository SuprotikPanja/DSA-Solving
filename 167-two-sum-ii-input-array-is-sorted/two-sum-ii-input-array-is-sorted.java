class Solution {
    public int[] twoSum(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;      //initialised left and right pointers
        while(left < right){
            //sum of leftmost anhd rightmost element is > target then reduce right pointer by one
            if(nums[left] + nums[right] > target) right = right - 1;    

            //sum of leftmost anhd rightmost element is < target then increase left pointer by one
            else if (nums[left] + nums[right] < target) left = left + 1;
            
            else return new int[] {left+1, right+1};
        }
        return null;
    }
}