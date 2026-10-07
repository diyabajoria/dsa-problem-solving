class Solution {
    
    public int numIslands(char[][] grid) 
    {
        int count=0;
        boolean [][]valid=new boolean[grid.length][grid[0].length];
        int r=grid.length;
        int c=grid[0].length;
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                if(valid[i][j]!=true && grid[i][j]=='1')
                {
                    dfs(i,j,grid,valid,r,c);
                    count++;
                }
            }
        }
        return count;
    }
    void dfs(int i, int j,char[][] grid, boolean[][] valid, int r, int c)
    {
        if(i<0 || i>=grid.length || j<0 || j>=grid[0].length || valid[i][j]==true || grid[i][j]!='1')
        {
            return;
        }
        valid[i][j]=true;
        dfs(i-1,j,grid,valid,r,c);
        dfs(i+1,j,grid,valid,r,c);
        dfs(i,j-1,grid,valid,r,c);
        dfs(i,j+1,grid,valid,r,c);
    }
}