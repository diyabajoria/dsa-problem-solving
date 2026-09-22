class Solution {
    public int[] twoSum(int[] numbers, int target) {
        //two-pointer approach-way better
        int left=0;
        int right=numbers.length-1;
        while(left<right)
        {
            int sum=numbers[left]+numbers[right];
            if(sum==target)
            {
                return new int[]{left+1,right+1};
            }
            if(sum>target)
            {
                right--;
            }
            else
            {
                left++;
            }
        }
        return new int[]{-1,-1};

        //mid approach
        // int ar[]=new int[2];
        // int r=numbers.length-1;
        // int l=0;
        //     while(l<r)
        //     {
        //         int sum=numbers[r]+numbers[l];
        //         if(sum==target)
        //         {
        //             ar[0]=l+1;
        //             ar[1]=r+1;
        //             return ar;
        //         }
        //         else if(sum<target)
        //         {
        //             l++;
        //         }
        //         else
        //         {
        //             r--;
        //         }
        //     }
        // return ar;
    }
}