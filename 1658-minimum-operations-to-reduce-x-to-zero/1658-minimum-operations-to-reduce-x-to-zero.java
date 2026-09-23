class Solution {
    public int minOperations(int[] nums, int x) 
    {
        int presum=0;
        for(int i=0;i<nums.length;i++)
        {
            presum+=nums[i];
        }
        int value=presum-x;
        int left=0;
        int sum=0;
        int max=-1;
        for(int right=0;right<nums.length;right++)
        {
            sum+=nums[right];
            while(sum>value && left<=right)
            {
                sum-=nums[left];
                left++;
            }
            if(sum==value)
            {
                max=Math.max(max,right-left+1);
            }
        }
        if (max==-1)
        {
            return -1;
        }
        return nums.length-max;
    }
}