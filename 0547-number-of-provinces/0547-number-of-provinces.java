class Solution {
    public int findCircleNum(int[][] isConnected) {
        boolean visited[]=new boolean[isConnected.length];
        int c=0;
        for(int i=0;i<visited.length;i++)
        {
            if(!visited[i])
            {
                dfs(visited,isConnected,i);
                c++;
            }
        }
        return c;
    }
    void dfs(boolean visited[],int[][] ar,int i)
    {
        visited[i]=true;
        for(int j=0;j<ar.length;j++)
        {
            if(ar[i][j]==1 &&!visited[j])
            {
                dfs(visited,ar,j);
            }
        }
    }
}