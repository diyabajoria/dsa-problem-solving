class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
        HashMap<String, String> map=new HashMap<>();
        for(List<String> pair: knowledge)
        {
            map.put(pair.get(0),pair.get(1));
        }

        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch=='(')
            {
                int j=i+1;
                while(s.charAt(j)!=')')
                {
                    j++;
                }
                String key=s.substring(i+1,j);
                if(map.containsKey(key))
                {
                    sb.append(map.get(key));
                }
                else
                {
                    sb.append('?');
                }
                i=j;
            }
            else
            {
                sb.append(ch);
            }
            
        }
        return sb.toString();
        
    }
}