class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int num:nums)
        {
            map.put(num,map.getOrDefault(num,0)+1);
        }
        //ArrayList<Integer> ar=new ArrayList<>(map.keySet());
        Integer[] arr = map.keySet().toArray(new Integer[0]);
        Arrays.sort(arr,(a,b)->map.get(b)-map.get(a));
        int f[]=new int[k];
        for(int i=0;i<k;i++)
        {
            f[i]=arr[i];
        }
        return f;
    }
}