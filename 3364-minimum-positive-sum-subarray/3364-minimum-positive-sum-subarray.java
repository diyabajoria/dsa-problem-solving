class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int min=Integer.MAX_VALUE;
        while(r>=l)
        {

            for(int i=0;i+l<=nums.size();i++)
            {
                int sum=0;
                for(int j=i;j<i+l;j++)
                {
                    sum+=nums.get(j);
                }
                if(sum>0)
                min=Math.min(min,sum);
            }
            l++;
        }
        return min==Integer.MAX_VALUE?-1:min;
    }
}