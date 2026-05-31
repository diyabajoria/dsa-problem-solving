class Solution {
    public boolean canJump(int[] nums) {
            int n=nums.length;
            int v=0;
            for(int i=0;i<nums.length;i++)
            {
                if(i>v)
                {
                    return false;
                }
                v=Math.max(v,i+nums[i]);
            }
            return true;
    }
}