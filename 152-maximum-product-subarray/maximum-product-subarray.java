class Solution {
    public int maxProduct(int[] nums) {
        int max = nums[0];
        int min = nums[0];
        int result = max;
        if (nums.length == 0) return 0;

        //traversing and finding the max and min values using a temp varable
        for (int i = 1; i < nums.length; i++){
            int curr = nums[i];
              // If the current number is negative, swap max and min
              if (curr < 0) {
                int temp = max;
                max = min;
                min = temp;
            }
            max = Math.max(curr, max*curr);
            min = Math.min(curr, min*curr);

            result = Math.max(result,max);
        }
        return result;
    }
}