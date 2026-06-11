class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> s=new Stack();
        int res[]=new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            res[i]=-1;
        }
        
        for(int i=0;i<2*res.length;i++)
        {
            int num=nums[i%nums.length];
            while(!s.isEmpty() && nums[s.peek()]<num)
            {
                res[s.pop()]=num;
            }
            if(i<nums.length)
            {
                s.push(i);
            }
        }
        return res;
        

    }
}