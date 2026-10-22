class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> list=new ArrayList<>();
        char[] c1=p.toCharArray();
        Arrays.sort(c1);
        p=new String(c1);
        for(int i =0;i<=s.length()-p.length();i++)
        {
            String sub=s.substring(i,i+p.length());
            char[] c2=sub.toCharArray();
            Arrays.sort(c2);
            sub=new String(c2);
            if(sub.equals(p))
            {
                list.add(i);
            }
        }
        return list;
    }
}