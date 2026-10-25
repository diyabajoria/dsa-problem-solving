class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int c[]=new int[A.length];
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<A.length;i++)
        {
            int count=0;
            set.add(A[i]);
            for(int j=0;j<=i;j++)
            {
                if(set.contains(B[j]))
                {
                    count++;
                }
            }
            c[i]=count;
        }
        return c;
    }
}