class Solution {
    public int search(int[] nums, int target) {
        boolean present=false;
        int l=0;
        int u=nums.length-1;
        while(l<=u)
        {
            int m=(l+u)/2;
            if(nums[m]==target)
            {
                return m;
            }
            else if(nums[m]<target)
            {
                l=m+1;
            }
            else
            {
                u=m-1;
            }
        }
        return -1;
    }
}