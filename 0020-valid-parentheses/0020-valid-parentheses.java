import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        
        Stack<Character> s1=new Stack<>();

        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            

            if(ch=='(' || ch=='{' || ch=='[')
            {
                s1.push(ch);
            }
            else
            {
                if(s1.isEmpty())
                {
                    return false;
                }
                else if(s1.peek().equals('(') &&ch==')')
                {
                    s1.pop();
                }
                else if(s1.peek().equals('{') &&ch=='}')
                {
                    s1.pop();
                }
                else if(s1.peek().equals('[') &&ch==']')
                {
                    s1.pop();
                }
                else
                {
                    return false;
                }
                
            }
        }
        return s1.isEmpty();

    }
}
