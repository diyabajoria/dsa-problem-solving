class Solution {
    public int scoreOfParentheses(String s) {
        int deep=0;
        int count=0;
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch=='(')
            {
                deep++;
            }
            else if(ch==')')
            {
                deep--;
                if(s.charAt(i-1)=='(')
                {
                    count+=Math.pow(2,deep);
                }
            }
        }
        return count;
    }
}