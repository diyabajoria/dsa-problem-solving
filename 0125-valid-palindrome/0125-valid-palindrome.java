class Solution {
    public boolean isPalindrome(String s) {

        int left=0;
        int right=s.length()-1;
        while(left<right)
        {
            char a=s.charAt(left);
            char b=s.charAt(right);
            a=Character.toLowerCase(a);
            b=Character.toLowerCase(b);
            if(!Character.isLetterOrDigit(a))
            {
                left++;
            }
            else if(!Character.isLetterOrDigit(b))
            {
                right--;

            }
            else
            {
                if(a!=b)
                {
                    return false;
                }
                else
                {
                    left++;
                    right--;
                }
            }
        }
        return true;









        // String w="";
        // for(int i=0;i<s.length();i++)
        // {
        //     char ch=s.charAt(i);
        //     if(Character.isLetterOrDigit(ch))
        //     {
        //         w+=ch;
        //     }
        // }
        // w=w.toLowerCase();
        // String ns=new StringBuilder(w).reverse().toString();
       
        // if(w.equals(ns))
        // {
        //     return true;
        // }
        // return false;

















        // String w="";
        // for(int i=s.length()-1;i>=0;i--)
        // {
        //     char ch=s.charAt(i);
        //     if(Character.isLetter(ch) || Character.isDigit(ch))
        //     {
        //         w+=ch;
        //     }
        // }
        // String w1="";
        // for(int i=0;i<s.length();i++)
        // {
        //     char ch=s.charAt(i);
        //     if(Character.isLetter(ch) || Character.isDigit(ch))
        //     {
        //         w1+=ch;
        //     }
        // }
        // if(w.equalsIgnoreCase(w1))
        // {
        //     return true;
        // }
        // return false;
    }
}