class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        
        int [] res=new int[nums1.length];
        HashMap<Integer, Integer> map=new HashMap<>();
        Stack<Integer> s=new Stack();
        for(int i=0;i<nums2.length;i++)
        {
            while(!s.isEmpty() && s.peek()<nums2[i])
            {
                map.put(s.pop(),nums2[i]);
            }
            s.push(nums2[i]);
        }
        for(int i:s)
        {
            map.put(i,-1);
        }
        for(int i=0;i<nums1.length;i++)
        {
            res[i]=map.get(nums1[i]);
        }
        return res;


    }
}