class Solution {
    public String removeOccurrences(String s, String part) {
        StringBuilder sb=new StringBuilder(s);
        int i=0;
        while(i<=sb.length()-part.length())
        {
            String p=sb.substring(i,i+part.length());
            if(part.equals(p))
            {
                sb.delete(i,i+part.length());
                i=Math.max(0,i-part.length()+1);
            }
            else
            {
                i++;
            }
        }
        return sb.toString();
    }
}