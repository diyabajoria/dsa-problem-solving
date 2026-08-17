class Solution {
    public int[] shuffle(int[] nums, int n) {
        int ar[]=new int[n*2];
        int j=0;
        for(int i=0;i<n;i++)
        {
            ar[j++]=nums[i];
            ar[j++]=nums[i+n];
        }
        return ar;
        // int ar1[]=new int[nums.length/2];
        // int ar2[]=new int[nums.length/2];
        // for(int i=0;i<nums.length/2;i++)
        // {
        //     ar1[i]=nums[i];
        //     ar2[i]=nums[i+n];
        // }
        // int ar3[]=new int[nums.length];
        // int k=0;
        // for(int i=0;i<nums.length/2;i++)
        // {
        //     ar3[k++]=ar1[i];
        //     ar3[k++]=ar2[i];
        // }
        // return ar3;
    }
}