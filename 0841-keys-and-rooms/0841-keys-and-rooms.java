class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        boolean visit[]=new boolean[rooms.size()];
        dfs(visit,rooms,0);
        for(int i=0;i<rooms.size();i++)
        {
                if(!visit[i])
                {
                    return false;
            }
        }
        return true;
    }
    void dfs(boolean visit[], List<List<Integer>> rooms,int i)
    {
        visit[i]=true;
        for(int key:rooms.get(i))
        {
            if(!visit[key])
            {
                dfs(visit,rooms,key);
            }
        }
    }
}