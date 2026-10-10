class Solution {
    public int[][] merge(int[][] intervals) {
        List<List<Integer>> list=new ArrayList<>();
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        int start=intervals[0][0];
        int end=intervals[0][1];
        for(int i=1;i<intervals.length;i++)
        {
            if(intervals[i][0]<=end)
            {
                end=Math.max(end,intervals[i][1]);
            }
            else
            {
                list.add(Arrays.asList(start,end));
                start=intervals[i][0];
                end=intervals[i][1];
            }

        }
        list.add(Arrays.asList(start,end));
        int mat[][]=new int[list.size()][2];
        for(int i=0;i<mat.length;i++)
        {
            mat[i][0]=list.get(i).get(0);
            mat[i][1]=list.get(i).get(1);
        }
        return mat;















        // List<List<Integer>> list=new ArrayList<>();
        // //sorting the matrix by first element
        // Arrays.sort(intervals, (a,b)->a[0]-b[0]);
        // int start=intervals[0][0];
        // int end=intervals[0][1];
        // for(int i=1;i<intervals.length;i++)
        // {
        //     if(intervals[i][0]<=end)
        //     {
        //         end=Math.max(end,intervals[i][1]);
        //     }
        //     else
        //     {
        //         list.add(Arrays.asList(start,end));
        //         start=intervals[i][0];
        //         end=intervals[i][1];
        //     }
        // }
        // list.add(Arrays.asList(start,end));
        // int [][]matrix=new int[list.size()][2];
        // for(int i=0;i<matrix.length;i++)
        // {
            
        //         matrix[i][0]=list.get(i).get(0);
        //         matrix[i][1]=list.get(i).get(1);

        // }
        // return matrix;

    }
}