class Solution {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;
        //while left is less than right pointer
        while (left <= right){

            int mid = (left+right)/2;          //finding mid value
            if (nums[mid] == target) return mid;     //if target is in the mid index
            if (nums[left] <= nums[mid]){            //if left element id less than mid element
                if (target < nums[left] || target > nums[mid]) left = mid + 1;  //outside range
                else right = mid -1;
            }
            else{
                if (target > nums[right] || target < nums[mid]) right = mid - 1;
                else left = mid + 1;
            }
        }
        return -1;
    }
}