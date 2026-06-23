class Solution {
    public int search(int[] nums, int target) {
        int l=0;
        int u=nums.length-1;
        while(l<=u)
        {
            int m=l+(u-l)/2;
            if(nums[m]==target)
            {
                return m;
            }
            if(nums[l]<=nums[m])
            {
                if(nums[l]<=target &&nums[m]>target)
                {
                    u=m-1;
                }
                else
                {
                    l=m+1;
                }
            }
            else
            {
                if(target>nums[m] && target<=nums[u])
                {
                    l=m+1;
                }
                else
                {
                    u=m-1;
                }
            }
        }
        return -1;
    }
}