class Solution {
    public int[] dailyTemperatures(int[] t) {
        int temp[]=new int[t.length];

        Stack<Integer> s=new Stack<>();
        
        for(int i=0;i<t.length;i++)
        {
            
            while(!s.isEmpty() && t[i]>t[s.peek()])
            {
                int val=s.pop();
                temp[val]=i-val;

            }
            s.push(i);
        }
        return temp;
        }
}