class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int num:nums)
        {
            min=Math.min(min,num);
            max=Math.max(max,num);
            set.add(num);
        }
        List<Integer> list=new ArrayList<>();
        for(int i=min+1;i<max;i++)
        {
            if(!set.contains(i))
            {
                list.add(i);
            }
        }
        return list;
    }
}