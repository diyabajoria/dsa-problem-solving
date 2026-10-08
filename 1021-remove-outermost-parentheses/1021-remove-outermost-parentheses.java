class Solution {
    public String removeOuterParentheses(String s) 
    {
        int depth=0;
        String ns="";
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch=='(')
            {
                if(depth>0)
                ns+=ch;
                depth++;
            }
            else if(ch==')')
            {
                depth--;
                if(depth>0)
                ns+=ch;
            }
        }
        return ns;
    }
}