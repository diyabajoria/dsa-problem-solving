class Solution {
    public int pivotIndex(int[] nums) {
        // int arrSum=0;
        // for(int i=0;i<nums.length;i++)
        // {
        //     arrSum+=nums[i];
        // }
        // int sum=0;
        // for(int i=0;i<nums.length;i++)
        // {
            
        //     int r=arrSum-nums[i]-sum;
        //     if(sum==r)
        //     {
        //         return i;
        //     }
        //     sum+=nums[i];
        // }
        // return -1;
        int sum=0;
        for(int i=0;i<nums.length;i++)
        {
            sum+=nums[i];
        }
        int pivot=-1;
        int value=0;
        for(int i=0;i<nums.length;i++)
        {
            int newsum=sum-nums[i]-value;
            if(newsum==value)
            {
                return i;
            }
            value+=nums[i];
        }
        return -1;
    }
}