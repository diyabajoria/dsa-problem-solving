class Solution {
    public int singleNumber(int[] nums) {
        //xor method
        int val=0;
        for(int num:nums)
        {
            val^=num;
        }
        return val;
















    //   int n=nums[0];
    //   for(int i=1;i<nums.length;i++)
    //   {
    //     n^=nums[i];
    //   }
    //   return n;
    }
}