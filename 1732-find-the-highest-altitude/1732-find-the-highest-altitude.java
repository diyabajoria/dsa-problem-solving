class Solution {
    public int largestAltitude(int[] gain) {
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,0);
        int sum=0;
        int max=0;
        for(int i=0;i<gain.length;i++)
        {
            sum+=gain[i];
            if(sum>max)
            {
                max=sum;
            }
            map.put(i+1,sum);
        }
        return max;
    }
}