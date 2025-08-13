class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        //initializing the 3 pointers
        int p1 = m - 1, p2 = n - 1, i = m + n - 1;
        //while pointer2 >=0 compare the values of nums1 and mums2 ,then add greatest in nums1
        while(p2 >= 0){

            //compare the values of nums1 and mums2 ,then add greatest in nums1,decremnt pointers
            if(p1 >= 0 && nums1[p1] > nums2[p2]){
                nums1[i] = nums1[p1];
                p1--;
            }
            else{
                nums1[i] = nums2[p2];      
                p2--;
            }
           i--;            //decrementing indexing of nums1 array
        }
    }
}