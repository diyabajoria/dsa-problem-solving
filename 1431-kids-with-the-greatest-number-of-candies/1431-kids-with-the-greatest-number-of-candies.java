class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> list=new ArrayList<>();
        boolean ar[]=new boolean[candies.length];
        for(int i=0;i<ar.length;i++)
        {
            ar[i]=true;
        }
        for(int i=0;i<candies.length;i++)
        {
            int val=candies[i]+extraCandies;
            for(int j=0;j<candies.length;j++)
            {
                if(val<candies[j])
                {
                    ar[i]=false;
                }
            }
        }
        for(int i=0;i<candies.length;i++)
        {
            list.add(ar[i]);
        }
        return list;
    }
}