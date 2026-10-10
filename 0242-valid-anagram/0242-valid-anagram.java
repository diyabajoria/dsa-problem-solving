class Solution {
    public boolean isAnagram(String s, String t) {
        char ch1[]=s.toCharArray();
        char ch2[]=t.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        String s1=new String(ch1);
        String s2=new String(ch2);
        if(s1.equals(s2))
        {
            return true;
        }
        return false;



        // HashMap<Character,Integer> map=new HashMap<>();
        // for(char i:s.toCharArray())
        // {
        //     map.put(i,map.getOrDefault(i,0)+1);
        // }
        // for(char i:t.toCharArray())
        // {
        //     if(!map.containsKey(i))
        //     {
        //         return false;
        //     }
        //     map.put(i,map.get(i)-1);
        //     if(map.get(i)==0)
        //     {
        //         map.remove(i);
        //     }
        // }

        // return map.isEmpty();
    }
}