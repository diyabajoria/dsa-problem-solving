class Solution {
    public int minimumDeletions(int[] nums) {
        if(nums.length==1)
        {
            return 1;
        }
        int max=nums[0];
        int min=nums[0];
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]<min)
            {
                min=nums[i];
            }
            if(nums[i]>max)
            {
                max=nums[i];
            }
        }
        int front=0;
        int back=0;
        int bothsides=0;
        int c=0;
        for(int i=0;i<nums.length;i++)
        {
            if(c==2)
            {
                break;
            }
            if(nums[i]==max || nums[i]==min)
            {
                c++;
            }
            front++;
        }
        c=0;
        for(int i=nums.length-1;i>=0;i--)
        {
            if(c==2)
            {
                break;
            }
            if(nums[i]==max || nums[i]==min)
            {
                c++;
            }
            back++;
        }
        c=0;
        int minimum=Math.min(front,back);
        for(int i=0;i<nums.length;i++)
        {
            bothsides++;
            if(nums[i]==min || nums[i]==max)
            {
                break;
            }
        }
        for(int i=nums.length-1;i>=0;i--)
        {
            bothsides++;
            if(nums[i]==min || nums[i]==max)
            {
                break;
            }
        }
        minimum=Math.min(minimum,bothsides);
        return minimum;
    }
}