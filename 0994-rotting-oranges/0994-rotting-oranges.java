class Solution {
    public int orangesRotting(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int fresh=0;
        Queue<int[]> q=new LinkedList<>();
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(grid[i][j]==1)
                {
                    fresh++;
                }
                else if(grid[i][j]==2)
                {
                    q.add(new int[]{i,j});
                }
            }
        }
        return bfs(q,grid,fresh);
    }
    int bfs(Queue<int[]> q, int[][] grid, int fresh)
    {
        int m=grid.length;
        int n=grid[0].length;

        int minutes=0;
        int dirs[][]={{-1,0},{0,1},{0,-1},{1,0}};

        while(!q.isEmpty() && fresh>0)
        {
            int size=q.size();
            for(int i=0;i<size;i++)
            {
                int cell[]=q.poll();
                int r=cell[0];
                int c=cell[1];

                for(int dir[]:dirs)
                {
                    int nr=r+dir[0];
                    int nc=c+dir[1];

                    if(nr>=0 && nr<m && nc>=0 && nc<n && grid[nr][nc]==1)
                    {
                        grid[nr][nc]=2;
                        q.add(new int[]{nr,nc});
                        fresh--;
                    }
                }

            }
            minutes++;
        }
        if(fresh>0)
        {
            return -1;
        }
        return minutes;
    }
}