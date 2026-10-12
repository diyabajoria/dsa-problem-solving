class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        //bfs
        ArrayList<ArrayList<Integer>> graph=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            graph.add(new ArrayList<>());
        }
        for(int edge[]:edges)
        {
            int u=edge[0];
            int v=edge[1];
            graph.get(u).add(v);
            graph.get(v).add(u);
        }
        boolean visited[]=new boolean[n];
        return bfs(visited,graph,source,destination);

    }
    boolean bfs(boolean visited[],ArrayList<ArrayList<Integer>> graph, int s,int d)
    {
        
        Queue<Integer> q=new LinkedList<>();
        q.add(s);
        visited[s]=true;
        while(!q.isEmpty())
        {
            int node=q.poll();
            for(int neigh:graph.get(node))
            {
                if(!visited[neigh])
                {
                    visited[neigh]=true;
                    q.add(neigh);
                }
            }
        }
        if(visited[d]==true)
        {
            return true;
        }
        return false;

    }

    //     //basically start dfs from source and mark every node as true it visits. at last check if destination is marked true or no. if not, path doesnt exist.
        
    //     //converting matrix to adjecency list
    //     ArrayList<ArrayList<Integer>> graph=new ArrayList<>();

    //     for(int i=0;i<n;i++)
    //     {
    //         graph.add(new ArrayList<>());
    //     }
    //     for(int edge[]:edges)
    //     {
    //         int u=edge[0];
    //         int v=edge[1];
    //         graph.get(u).add(v);
    //         graph.get(v).add(u);
    //     }
    //     // till here 

    //     boolean visited[]=new boolean[n];
    //     return (dfs(graph,source,destination,visited));
    // }
    // boolean dfs(ArrayList<ArrayList<Integer>> graph, int source, int destination, boolean[] visited)
    // {
    //     if(source==destination)
    //     {
    //         return true;
    //     }
    //     visited[source]=true;
    //     for(int neigh:graph.get(source))
    //     {
    //         if(!visited[neigh])
    //         {
    //             if(dfs(graph,neigh,destination,visited))
    //             {
    //                 return true;
    //             }
    //         }
    //     }
    //     return false;
    //}
}