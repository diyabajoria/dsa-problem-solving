class Solution {
    public int equalSubstring(String s, String t, int maxCost) {
        int length=0;
        int left=0;
        for(int i=0;i<s.length();i++)
        {
            char cs=s.charAt(i);
            char ct=t.charAt(i);
            int diff=Math.abs(cs-ct);
            maxCost-=diff;
            if(maxCost<0)
            {
                maxCost+=Math.abs(s.charAt(left)-t.charAt(left));
                left++;
            }
            length=Math.max(length, i-left+1);
        }
        return length;
    }
}