class Solution {
    public int[] replaceElements(int[] arr) {
        int []a=new int[arr.length];
        int max=arr[arr.length-1];
        a[arr.length-1]=-1;
        for(int i=arr.length-1;i>0;i--)
        {
            max=Math.max(max,arr[i]);
            a[i-1]=max;
        }
        return a;
    }
}