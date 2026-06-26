class Solution {
    public void rotate(int[] nums, int k) {
        int nums1[]=new int[nums.length*2];
        int k1=0;
        for(int i=0;i<nums.length;i++)
        {
            nums1[k1++]=nums[i];
        }
        for(int i=0;i<nums.length;i++)
        {
            nums1[k1++]=nums[i];
        }
        int n=nums.length-(k%nums.length);
        for(int i=0;i<nums.length;i++)
        {
            nums[i]=nums1[n+i];
        }
    }
}