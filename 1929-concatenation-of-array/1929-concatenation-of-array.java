class Solution {
    public int[] getConcatenation(int[] nums) {
        int ar[]=new int[nums.length*2];
        for(int i=0;i<nums.length;i++)
        {
            ar[i]=nums[i];
            ar[i+(nums.length)]=nums[i];
        }
        return ar;
    }
}