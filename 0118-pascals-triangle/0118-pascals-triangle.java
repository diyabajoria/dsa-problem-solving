class Solution {
    public List<List<Integer>> generate(int numRows) {
        int ar[][]=new int[numRows][numRows];
        for(int i=0;i<numRows;i++)
        {
            ar[i][0]=1;
            ar[i][i]=1;
            for(int j=1;j<i;j++)
            {
                ar[i][j]=ar[i-1][j-1]+ar[i-1][j];
            }
        }
        List<List<Integer>> list=new ArrayList<>();
        for(int i=0;i<numRows;i++)
        {
            List<Integer> row=new ArrayList<>();
            for(int j=0;j<=i;j++)
            {
                row.add(ar[i][j]);
            }
            list.add(row);
        }
        return list;
    }
}