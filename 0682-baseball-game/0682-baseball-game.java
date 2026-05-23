class Solution {
    public int calPoints(String[] op) {
        Stack<Integer> s=new Stack<>();

        for(int i=0;i<op.length;i++)
        {
            if(op[i].equals("C"))
            {
                s.pop();
            }
            else if(op[i].equals("D"))
            {
                int num=s.peek()*2;
                s.push(num);
            }
            else if(op[i].equals("+"))
            {
                int ch1=s.pop();
                int ch2=s.peek();
                int sum=ch1+ch2;
                s.push(ch1);
                s.push(sum);
            }
            else
            {
                s.push(Integer.parseInt(op[i]));
            }
        }

        int summ=0;
        while(!s.isEmpty())
        {
            summ+=s.pop();
        }
        return summ;
    }
}