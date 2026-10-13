class Solution {
    public int numIslands(char[][] grid) {
        int val=0;
        boolean visited[][]=new boolean[grid.length][grid[0].length];
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[0].length;j++)
            {
                if(grid[i][j]=='1' && !visited[i][j])
                {
                    dfs(grid,i,j,visited);
                    val++;
                }
            }
            
        }
        return val;
    }
    void dfs(char [][] grid,int i, int j, boolean [][]visited)
    {
        if(i<0 || i>=grid.length || j<0 || j>=grid[0].length || visited[i][j] || grid[i][j]!='1')
        {
            return;
        }
        visited[i][j]=true;
        dfs(grid, i+1,j,visited);
        dfs(grid,i-1,j,visited);
        dfs(grid,i,j+1,visited);
        dfs(grid,i,j-1,visited);
    }
}