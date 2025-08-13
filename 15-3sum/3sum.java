class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);                             //sorting the given array
        List<List<Integer>> result = new ArrayList<>();  //creating list to stare valid triplets

        //We stop if nums[i] becomes positive because
        for (int i = 0; i < nums.length && nums[i] <= 0; i++){  

            //This avoids repeating the same triplet multiple times 
            if (i == 0 || nums[i] != nums[i-1]) twoSum2(nums, i, result);
        }
        return result;
    }

    void twoSum2(int [] nums, int i,List<List<Integer>> result){
        int left = i + 1;              //left pointer starts just after the current index 'i'
        int right = nums.length - 1;

        //Continue until the pointers cross each other
        while (left < right){
            int sum = nums[i] + nums[left] + nums[right];
            if(sum < 0) left++;           // If sum is < 0, move left = left-1

            else if(sum > 0) right--;     // If sum is > 0, move right = right-1

            //If sum is exactly zero, we found a valid triplet
            else{
                // Add the triplet to our result list
                result.add(Arrays.asList(nums[i], nums[left++], nums[right--]));

                // This prevents adding the same triplet again
                while(left < right && nums[left] == nums[left-1]) ++left;
            } 
        }
    }
}