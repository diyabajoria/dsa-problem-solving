import java.util.Stack;

class Solution {
    public boolean isValid(String s1) {
        Stack<Character> s=new Stack<>();
        for(int i=0;i<s1.length();i++)
        {
            char ch=s1.charAt(i);
            
            if(ch=='(' || ch=='[' || ch=='{')
            {
                s.push(ch);
            }
            else
            {
                if(s.isEmpty())
                {
                    return false;
                }
                if(ch==')' && s.peek()=='(')
                {
                    s.pop();
                }
                else if (ch==']' && s.peek()=='[')
                {
                    s.pop();
                }
                else if(ch=='}' && s.peek()=='{')
                {
                    s.pop();
                }
                else
                {
                    return false;
                }
            }
            
        }
        return s.isEmpty();













        
        // Stack<Character> s1=new Stack<>();

        // for(int i=0;i<s.length();i++)
        // {
        //     char ch=s.charAt(i);
            

        //     if(ch=='(' || ch=='{' || ch=='[')
        //     {
        //         s1.push(ch);
        //     }
        //     else
        //     {
        //         if(s1.isEmpty())
        //         {
        //             return false;
        //         }
        //         else if((s1.peek().equals('(') &&ch!=')' ) || (s1.peek().equals('{') &&ch!='}') || (s1.peek().equals('[') &&ch!=']'))
        //         {
        //             return false;
        //         }
        //         else
        //         {
        //             s1.pop();
        //         }
                
        //     }
        // }
        // return s1.isEmpty();

    }
}
