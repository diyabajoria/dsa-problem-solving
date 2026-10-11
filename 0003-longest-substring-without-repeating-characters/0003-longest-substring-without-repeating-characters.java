class Solution {
    public int lengthOfLongestSubstring(String s) {

        // HashSet<Character> set=new HashSet<>();
        // int left=0;
        // int max=0;
        // for(int r=0;r<s.length();r++)
        // {
        //     char ch=s.charAt(r);
        //     while(set.contains(ch))
        //     {
        //         set.remove(s.charAt(left));
        //         left++;
        //     }
        //     set.add(ch);
        //     max=Math.max(max,r-left+1);
        // }
        // return max;
        // HashSet<Character> set=new HashSet<>();
        // int left=0;
        // int max=0;
        // for(int right=0;right<s.length();right++)
        // {
        //     char ch=s.charAt(right);
        //     while(set.contains(ch))
        //     {
        //         set.remove(s.charAt(left));
        //         left++;
        //     }
        //     set.add(ch);
        //     max=Math.max(max,right-left+1);
        // }
        // return max;












        // HashSet<Character> set=new HashSet<>();
        // int left=0;
        // int maxlen=0;
        // for(int right=0;right<s.length();right++)
        // {
        //     char ch=s.charAt(right);
        //     while(set.contains(ch))
        //     {
        //         set.remove(s.charAt(left));
        //         left++;
        //     }
        //     set.add(ch);
        //     maxlen=Math.max(maxlen,right-left+1);
        // }
        // return maxlen;


        // HashSet<Character> set=new HashSet<>();
        // int left=0;
        // int maxlen=0;
        // for(int right=0;right<s.length();right++)
        // {
        //     char ch=s.charAt(right);
        //     while(set.contains(ch))
        //     {
        //         set.remove(s.charAt(left));
        //         left++;
        //     }
        //     set.add(ch);
        //     maxlen=Math.max(maxlen,right-left+1);
        // }
        // return maxlen;

















        HashSet<Character> set=new HashSet<>();
        int left=0;
        int min=0;
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            while(set.contains(ch))
            {
                set.remove(s.charAt(left));
                left++;
            }
            set.add(ch);
            min=Math.max(min,i-left+1);
        }
        return min;

    }
}
