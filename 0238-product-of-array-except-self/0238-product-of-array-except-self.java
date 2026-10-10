class Solution {
    public int[] productExceptSelf(int[] nums) {
        int product[]=new int[nums.length];
        product[0]=1;
        int num=1;
         for(int i=1;i<nums.length;i++)
         {
            num=num*nums[i-1];
            product[i]=num;
         }
         num=1;
         for(int i=nums.length-2;i>=0;i--)
         {
            num=num*nums[i+1];
            product[i]*=num;
         }
         return product;














        // int ar[]=new int[nums.length];
        // ar[0]=1;
        // for(int i=1;i<nums.length;i++)
        // {
        //     ar[i]=ar[i-1]*nums[i-1];
        // }
        // int right=1;
        // for(int i=nums.length-1;i>=0;i--)
        // {
        //     ar[i]*=right;
        //     right*=nums[i];
        // }
        // return ar;
    }
}