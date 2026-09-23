class Solution {
    public int minOperations(int[] nums, int x) 
    {
        int presum=0;
        for(int i=0;i<nums.length;i++)
        {
            presum+=nums[i];
        }
        int target=presum-x;
        int left=0;
        int sum=0;
        int maxlen=-1;
        for(int right=0;right<nums.length;right++)
        {
            sum+=nums[right];
            while(sum>target && left<=right)
            {
                sum-=nums[left];
                left++;
            }
            if(sum==target)
            {
                maxlen=Math.max(maxlen,right-left+1);
            }
        }
        if (maxlen==-1)
        {
            return -1;
        }
        return nums.length-maxlen;
    }
}