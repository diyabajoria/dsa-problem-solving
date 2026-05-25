class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int ar[]=new int[2];
        int r=numbers.length-1;
        int l=0;
            while(l<r)
            {
                int sum=numbers[r]+numbers[l];
                if(sum==target)
                {
                    ar[0]=l+1;
                    ar[1]=r+1;
                    return ar;
                }
                else if(sum<target)
                {
                    l++;
                }
                else
                {
                    r--;
                }
            }
        return ar;
    }
}