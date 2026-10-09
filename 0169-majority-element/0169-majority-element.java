class Solution {
    public int majorityElement(int[] nums) {
        // HashMap<Integer,Integer> map=new HashMap<>();
        // for(int i:nums)
        // {
        //     map.put(i,map.getOrDefault(i,0)+1);
        // }
        // int maxKey=-1;
        // int maxValue=0;
        // for(Map.Entry<Integer,Integer> e: map.entrySet())
        // {
        //     if(e.getValue()>maxValue)
        //     {
        //         maxValue=e.getValue();
        //         maxKey=e.getKey();
        //     }
        // }
        // return maxKey;

        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        int maxKey=-1;
        int maxValue=0;
        for(Map.Entry<Integer,Integer> e:map.entrySet())
        {
            if(e.getValue()>maxValue)
            {
                maxValue=e.getValue();
                maxKey=e.getKey();
            }

        }
        return maxKey;




        // HashMap<Integer,Integer> map=new HashMap<>();
        // for(int i=0;i<nums.length;i++)
        // {
        //     map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            
        // }
        // int max=0;
        // int val=0;
        // for(Map.Entry<Integer,Integer> e:map.entrySet())
        // {
        //     if(e.getValue()>max)
        //     {
        //         max=e.getValue();
        //         val=e.getKey();
        //     }
        // }
        // return val;
    }
}