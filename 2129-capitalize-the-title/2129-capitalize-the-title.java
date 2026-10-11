class Solution {
    public String capitalizeTitle(String title) {
        title=title.toLowerCase();
        title=title+" ";
        StringBuilder sb=new StringBuilder();
        String word="";
        for(int i=0;i<title.length();i++)
        {
            
            char ch=title.charAt(i);
            if(ch!=' ')
            {
                word+=ch;
            }
            else
            {
                if(word.length()<=2)
                {
                    sb.append(word);
                }
                else
                {
                    char ch1=word.charAt(0);
                    ch1=Character.toUpperCase(ch1);
                    sb.append(ch1);
                    sb.append(word.substring(1));
                }
                sb.append(" ");
                word="";
                
            }
            
            

        }
        String f=sb.toString();
        return f.trim();
    }

}