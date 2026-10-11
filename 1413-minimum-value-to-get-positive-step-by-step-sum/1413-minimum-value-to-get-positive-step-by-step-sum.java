class Solution {
    public int minStartValue(int[] nums) {
        int k=1;
        int arr[]=new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            arr[i]=nums[i];
        }
        arr[0]=arr[0]+k;
        for(int i=0;i<nums.length;i++)
        {
            if(i>0)
            {
                arr[i]=arr[i-1]+arr[i];
            }
            if(arr[i]<1)
            {
                
                k=k+1;
                for(int j=0;j<nums.length;j++)
                {
                    arr[j]=nums[j];
                }
                arr[0]=arr[0]+k;
                i=-1;
                continue;

            }
        }
        return k;
    }
}