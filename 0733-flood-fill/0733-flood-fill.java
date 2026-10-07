class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int [][]ar=new int[image.length][image[0].length];
        int initial=image[sr][sc];
        if(initial==color)
        {
            return image;
        }
        dfs(image,sr,sc,color,initial);
        return image;
        
    }
    void dfs(int [][]image, int sr,int sc,int color,int initial)
    {
        if(sr<0 || sr>=image.length || sc<0 || sc>=image[0].length)
        {
            return ;
        }
        if(image[sr][sc]!=initial)
        {
            return;
        }
        image[sr][sc]=color;
        dfs(image, sr+1,sc,color,initial);
        dfs(image,sr-1,sc,color,initial);
        dfs(image,sr,sc+1,color,initial);
        dfs(image,sr,sc-1,color,initial);
    }
}