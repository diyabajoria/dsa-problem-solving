class Solution {
    public String processStr(String s) {
        char[] ch=s.toCharArray();
        StringBuilder ns=new StringBuilder();
        for(int i=0;i<s.length();i++)
        {
            char c=ch[i];
            
            if(c=='#')
            {
                ns.append(ns);
            }
            else if(c=='%')
            {
                ns.reverse();
            }
            else if(c=='*')
            {
                if (ns.length() > 0) 
                {
                    ns.deleteCharAt(ns.length() - 1);
                }
            }
            else
            {
                ns.append(c);
            }
        }
        return ns.toString();
    }
}