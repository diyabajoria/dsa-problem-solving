class Solution {
    public int missingNumber(int[] nums) {
        //     int sum=0;
        //   for(int i=0;i<nums.length;i++)
        //   {
        //         sum+=nums[i];
        //   }
        //   int len=nums.length;
        //   int val=((len)*(len+1))/2;
        //   return val-sum;


        // int sum=nums.length;
        // for(int i=0;i<nums.length;i++)
        // {
        //     sum^=i;
        //     sum^=nums[i];
        // }
        // return sum;
        

        int sum1=0;
        int sum2=0;
        for(int i=0;i<nums.length;i++)
        {
            sum1+=nums[i];
            sum2+=(i+1);
        }
        return sum2-sum1;
        









        //approach 2
        // int sum=nums.length;
        // for(int i=0;i<nums.length;i++)
        // {
        //     sum^=i;
        //     sum^=nums[i];

        // }
        // return sum;
    }
}