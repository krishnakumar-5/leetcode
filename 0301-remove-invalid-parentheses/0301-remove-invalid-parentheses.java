class Solution {
    public List<String> removeInvalidParentheses(String s) {
        List<String> res = new ArrayList<>();

        Set<String> set = new HashSet();
        Queue<String> queue= new LinkedList<>();

        set.add(s);
        queue.add(s);
        boolean found=false;
        while(!queue.isEmpty())
        {
            String cur=queue.poll();

            if(isValid(cur))
            {
                res.add(cur);
                found=true;
            }
            if(found==true)continue;

            for(int i=0;i<cur.length();i++)
            {
                if(cur.charAt(i)!='('&&cur.charAt(i)!=')')continue;

                String str=cur.substring(0,i)+cur.substring(i+1);
                if(!set.contains(str))
                {
                    set.add(str);
                    queue.offer(str);
                }
            }



        }
        return res;
    }
    public static boolean isValid(String s)
    {
        int count=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='(')
            count++;
            else if(s.charAt(i)==')')
            count--;
            if(count<0)
            return false;
        }
        return count==0;
    }
}