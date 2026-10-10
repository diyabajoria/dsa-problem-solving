class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String,List<String>> map=new HashMap<>();
         for(int i=0;i<strs.length;i++)
         {
            char ch[]=strs[i].toCharArray();
            Arrays.sort(ch);
            String w=new String(ch);
            map.putIfAbsent(w,new ArrayList<String>());
            map.get(w).add(strs[i]);
         }
         return new ArrayList<>(map.values());













        // HashMap<String, List<String>> map=new HashMap<>();
        // for(String s: strs)
        // {
        //     char []arr=s.toCharArray();
        //     Arrays.sort(arr);
        //     String key=new String(arr);
        //     map.putIfAbsent(key,new ArrayList<>());
        //     map.get(key).add(s);
        // }
        // return new ArrayList<>(map.values());


        // HashMap<String,List<String>> map=new HashMap<>();
        // for(String s:strs)
        // {
        //     char ch[]=s.toCharArray();
        //     Arrays.sort(ch);
        //     String key=new String(ch);
        //     map.putIfAbsent(key,new ArrayList<>());
        //     map.get(key).add(s);
        // }
        // return new ArrayList<>(map.values());
    }
}