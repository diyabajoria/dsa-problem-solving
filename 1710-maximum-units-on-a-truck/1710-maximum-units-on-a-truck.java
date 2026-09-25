class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        int sum=0;
        int truck=0;
        Arrays.sort(boxTypes,(a,b)->b[1]-a[1]);
        for(int i=0;i<boxTypes.length;i++)
        {
            truck+=boxTypes[i][0];
            if(truck<=truckSize)
            {
                
                sum+=(boxTypes[i][1]*boxTypes[i][0]);

            }
            else
            {
                int v=truckSize-(truck-boxTypes[i][0]);
                sum+=(v*boxTypes[i][1]);
                break;

            }
        }
        return sum;
    }
}