class Solution {
    public int[] productExceptSelf(int[] nums) {

     int [] result = new int[nums.length]; //created a new array
     int pre = 1;
     int post = 1; //intialiysing prefix and postfix varaibles

     //for loop for left to right
     for (int i = 0; i < nums.length; i++){
        result[i] = pre;
        pre = pre * nums[i];
     }
     //for loop for right to left with multiplying with existing array
     for(int i = nums.length-1; i >= 0; i--){
        result[i] = result[i] * post;
        post = post * nums[i];
     }
     return result;
    }
}