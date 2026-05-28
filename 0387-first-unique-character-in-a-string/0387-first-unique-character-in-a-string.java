class Solution {
    public int firstUniqChar(String s) {

        for(int i=0;i<s.length();i++)
        {
            int c=0;
            char ch=s.charAt(i);
            for(int j=0;j<s.length();j++)
            {
                char ch1=s.charAt(j);
                if(ch==ch1)
                {
                    c++;
                }
                if(c>1)
                {
                    break;
                }
            }
            if(c==1)
            {
                return i;
            }
        }
        return -1;
    }
}