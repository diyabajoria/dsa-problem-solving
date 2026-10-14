class Solution {
    public int countPalindromicSubsequence(String s) {
        int c=0;
        HashSet<String> set=new HashSet<>();
        for(char ch='a';ch<='z';ch++)
        {
            int p1=s.indexOf(ch);
            int p2=s.lastIndexOf(ch);
            if(p1==-1 || p1==p2)
            {
                continue;
            }
            else
            {
                for(int i=p1+1;i<p2;i++)
                {
                    //String s1=""+ch+s.charAt(i)+ch;
                    StringBuilder sb=new StringBuilder();
                    sb.append(ch);
                    sb.append(s.charAt(i));
                    sb.append(ch);
                    String s1=sb.toString();
                    if(!set.contains(s1))
                    {
                        c++;
                    }
                    set.add(s1);
                }
            }
            
        }
        return c;
    }
}