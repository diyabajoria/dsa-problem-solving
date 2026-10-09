class Solution {
    public void moveZeroes(int[] nums) {
        int []zeros=new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            zeros[i]=0;
        }
        int k=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]!=0)
            {
                zeros[k++]=nums[i];
            }
        }
        for(int i=0;i<nums.length;i++)
        {
            nums[i]=zeros[i];
        }
















        // int ar[]=new int[nums.length];
        // int k=0;
        // for(int i=0;i<nums.length;i++)
        // {
        //     ar[i]=0;
        // }
        // for(int i=0;i<nums.length;i++)
        // {
        //     if(nums[i]!=0)
        //     {
        //         ar[k++]=nums[i];
        //     }

        // }
        // for(int i=0;i<nums.length;i++)
        // {
        //     nums[i]=ar[i];
        // }
        
    }
}