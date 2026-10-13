class Solution {
    public int orangesRotting(int[][] grid) {
        Queue<int []> q=new LinkedList<>();
        int fresh=0;
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[0].length;j++)
            {
                if(grid[i][j]==1)
                {
                    fresh++;
                }
                else if(grid[i][j]==2)
                {
                    q.add(new int[]{i,j});
                }
                else
                {
                    continue;
                }
            }
        }
        return bfs (fresh, q, grid);
    }
    int bfs(int f, Queue<int []> q,int[][] grid)
    {
        int m=grid.length;
        int n=grid[0].length;
        int dirs[][]={{-1,0},{1,0},{0,1},{0,-1}};
        int min=0;
        while(!q.isEmpty() && f>0)
        {
            int size=q.size();
            for(int i=0;i<size;i++)
            {
                int cost[]=q.poll();
                int r=cost[0];
                int c=cost[1];
                for(int dir[]:dirs)
                {
                    int nr=r+dir[0];
                    int nc=c+dir[1];
                    if(nr>=0 && nr<m && nc>=0 && nc<n && grid[nr][nc]==1)
                    {
                        grid[nr][nc]=2;
                        q.add(new int[]{nr,nc});
                        f--;
                    }
                }
                
            }
            min++;
            
        }
        if(f>0)
        {
            return -1;
        }
        else
        {
            return min;
        }
    }
}