class Solution {
    public boolean containsDuplicate(int[] ar) {
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<ar.length;i++)
        {
            if(set.contains(ar[i]))
            {
                return true;
            }
            set.add(ar[i]);
        }
        return false;
    }
}