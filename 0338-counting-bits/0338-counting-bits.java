class Solution {
    public int[] countBits(int n) {
        int ar[]=new int[n+1];
        for(int i=0;i<=n;i++)
        {
            int val=0^i;
            int c=0;
            while(val>0)
            {
                c+=val&1;
                val>>=1;
            }
            ar[i]=c;
        }
        return ar;
    }
}