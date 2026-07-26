class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int r=nums[0]*nums[1]*nums[nums.length-1];
        int r1=nums[nums.length-1]*nums[nums.length-2]*nums[nums.length-3];
        if(r>r1)
        return (r);
        else
        return r1;
    }
}