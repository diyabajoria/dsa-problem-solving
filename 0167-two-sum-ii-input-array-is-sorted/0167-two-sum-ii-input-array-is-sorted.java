class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int ar[]=new int[2];
        int r=0;
        int l=0;
        for( r=1;r<numbers.length;r++)
        {
            while(r<numbers.length)
            {
                if((numbers[r]+numbers[l])==target)
                {
                    ar[0]=l+1;
                    ar[1]=r+1;
                    return ar;
                }
                r++;
            }
            l++;
            r=l;
            
        }
        return ar;
    }
}