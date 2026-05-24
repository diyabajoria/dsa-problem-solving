class Solution {
    public String clearDigits(String s) {
        Stack<Character> s1=new Stack<>();

        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(Character.isDigit(ch))
            {
                s1.pop();
            }
            else
            {
                s1.push(ch);
            }
        }
        String ns="";
        while(!s1.isEmpty())
        {
            ns+=s1.pop();
        }
        String reversed = new StringBuilder(ns).reverse().toString();
        return reversed;
    }
}