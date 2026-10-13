class Solution {
    public boolean canPartition(int[] nums) {
        int sum=0;
        for(int i=0;i<nums.length;i++)
        {
            sum+=nums[i];
        }
        if(sum%2!=0)
        {
            return false;
        }
        int c=0;
        boolean dp[]=new boolean[sum/2 +1];
        dp[0]=true;
        int target=sum/2;
        for(int num:nums)
        {
            for(int j=target;j>=num;j--)
            {
                dp[j]=dp[j]||dp[j-num];
            }
        }
        return dp[target];
        
    }
}