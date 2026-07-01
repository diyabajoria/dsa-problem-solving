class Solution {
    public String licenseKeyFormatting(String s, int k) {
        StringBuilder ns=new StringBuilder();
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch!='-')
            {
                ns.append(Character.toUpperCase(ch));
            }
        }
        ns.reverse();
        int c=0;
        for(int i=0;i<ns.length();i++)
        {
            if(c==k)
            {
                ns.insert(i,'-');
                c=0;
                i++;
            }
            c++;
        }
        return ns.reverse().toString();
    }
}