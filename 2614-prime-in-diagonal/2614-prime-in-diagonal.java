class Solution {
    public int diagonalPrime(int[][] nums) {
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            for(int j=0;j<nums.length;j++)
            {
                if(i==j || (i+j)==nums.length-1)
                {
                    list.add(nums[i][j]);
                }
            }
        }
        int c=0;
        int max=0;
        for(int i=0;i<list.size();i++)
        {
            if(isPrime(list.get(i)))
            {
                c++;
                if(max<list.get(i))
                {
                    max=list.get(i);
                }
            }
        }
        return max;
    }
    public boolean isPrime(int n)
    {
        if(n<=1)
        {
            return false;
        }
        for(int i=2;i*i<=n;i++)
        {
            if(n%i==0)
            {
                return false;
            }
        }
        return true;
    }
}