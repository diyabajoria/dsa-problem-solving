class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int k=0;
        for(int i=m;i<(m+n);i++)
        {
            nums1[i]=nums2[k++];
        }
        Arrays.sort(nums1);



















        // int ar[]=new int[m+n];
        // int k=0;
        // for(int i=0;i<m;i++)
        // {
        //     ar[k++]=nums1[i];
        // }
        // for(int j=0;j<n;j++)
        // {
        //     ar[k++]=nums2[j];
        // }
        // for(int i=0;i<ar.length-1;i++)
        // {
        //     for(int j=0;j<ar.length-1-i;j++)
        //     {
        //         if(ar[j]>ar[j+1])
        //         {
        //             int t=ar[j];
        //             ar[j]=ar[j+1];
        //             ar[j+1]=t;
        //         }
        //     }
        // }
        // for(int i=0;i<nums1.length;i++)
        // {
        //     nums1[i]=ar[i];
        // }
    }
}