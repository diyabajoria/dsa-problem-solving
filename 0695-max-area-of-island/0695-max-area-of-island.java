class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        boolean [][]visit=new boolean[grid.length][grid[0].length];
        int r=grid.length;
        int c=grid[0].length;
        int max=0;
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                if(grid[i][j]==1 && visit[i][j]!=true)
                {
                    int area=dfs(i,j,r,c,visit,grid);
                     max=Math.max(max,area);
                }
            }
        }
        return max;
    }
    int dfs(int i,int j,int r,int c,boolean[][] visit,int [][]grid)
    {
        if(i<0 || j<0 || i>=r||j>=c||visit[i][j]==true||grid[i][j]!=1)
        {
            return 0;
        }
        visit[i][j]=true;
        return 1+dfs(i-1,j,r,c,visit,grid) + dfs(i+1,j,r,c,visit,grid)+ dfs(i,j-1,r,c,visit,grid)+dfs(i,j+1,r,c,visit,grid);
    }
}