// Last updated: 3/17/2026, 2:08:30 PM
1class StockSpanner {
2    Stack<Integer> st;
3    public StockSpanner() {
4        st=new Stack<>();
5    }
6    public int next(int price) {
7        st.push(price);
8        int k=st.peek();
9        int c=0;
10        for(int i=st.size()-2;i>=0;i--){
11            if(k>=st.get(i)){
12                c++;
13            }else{
14                break;
15            }
16        }
17        return (c+1);
18    }
19}
20
21/**
22 * Your StockSpanner object will be instantiated and called as such:
23 * StockSpanner obj = new StockSpanner();
24 * int param_1 = obj.next(price);
25 */