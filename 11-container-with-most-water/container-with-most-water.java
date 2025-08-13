class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int max = 0;
        //using two pointers crossing concept
        while (left < right){
            int width = right - left;
            int area = Math.min(height[left], height[right]) * width;
            max = Math.max(area, max);

            //if left height is less than right height move left pointer towards right
            if (height[left] < height[right]) left++;
            else right--;
        }
        return max;
    }
}