class Solution {
    public boolean canJump(int[] nums) {
        
        int max=0;
        int last=nums.length;
        for(int i=0;i<nums.length;i++)
        {
            if(i>max)
            {
                return false;
            }
            max=Math.max(max,i+nums[i]);
            if(max>=last)
            {
                return true;
            }
        }
        return true;
    }
}