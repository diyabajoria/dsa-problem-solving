class Solution {
    public int minMoves(int[] nums) {
        int mac=nums[0];
        for(int i=0;i<nums.length;i++)
        {
            if(mac<nums[i])
            {
                mac=nums[i];
            }
        }
        int cheese=0;
        for(int i=0;i<nums.length;i++)
        {
            cheese+=(Math.abs(mac-nums[i]));
        }
        return cheese;
    }
}