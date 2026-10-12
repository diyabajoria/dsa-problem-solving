class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {
        if(grid[0][0]!=0 || grid[grid.length-1][grid[0].length-1]!=0)
        {
            return -1;
        }
        Queue<int []> q=new LinkedList<>();
        grid[0][0]=1;
        return bfs(grid,q);
    }
    int bfs(int [][] grid, Queue<int []> q)
    {
        int m=grid.length;
        int n=grid[0].length;
        int dirs[][]={{0,1},{0,-1},{1,0},{-1,0},{-1,-1},{-1,1},{1,-1},{1,1}};
        int min=1;
        q.add(new int[]{0,0});
        while(!q.isEmpty())
        {
            int size=q.size();
            for(int i=0;i<size;i++)
            {
                int cost[]=q.poll();
                int r=cost[0];
                int c=cost[1];
                if(r==m-1 && c==n-1)
                {
                    return min;
                }
                for(int dir[]:dirs)
                {
                    int nr=r+dir[0];
                    int nc=c+dir[1];
                    if(nr>=0 && nr<m && nc>=0 && nc<n && grid[nr][nc]==0)
                    {
                        grid[nr][nc]=1;
                        q.add(new int[]{nr,nc});
                    }
                }
            }
            min++;
        }
        return -1;
    }
}