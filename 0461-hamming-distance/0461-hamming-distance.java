class Solution {
    public int hammingDistance(int x, int y) {
        int val=x^y;
        int c=0;
        while(val>0)
        {
            c+=(val&1);
            val>>=1;
        }
        return c;
    }
}