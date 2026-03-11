// Last updated: 3/11/2026, 11:56:57 AM
1class ATM {
2    private long[]notes=new long[5];
3    private int[] values={20,50,100,200,500};
4    public void deposit(int[] banknotesCount) {
5        for(int i=0;i<5;i++){
6            notes[i]=notes[i]+banknotesCount[i];
7        }
8    }
9    
10    public int[] withdraw(int amount) {
11        int [] res=new int[5];
12        for(int i=4;i>=0;i--){
13            int use=(int)Math.min(notes[i],amount/values[i]);
14            res[i]=use;
15            amount=amount-(use*values[i]);
16        }
17        if(amount!=0){
18            return new int[]{-1};
19        }
20        for(int i=0;i<5;i++){
21            notes[i]=notes[i]-res[i];
22        }
23        return res;
24    }
25}
26
27/**
28 * Your ATM object will be instantiated and called as such:
29 * ATM obj = new ATM();
30 * obj.deposit(banknotesCount);
31 * int[] param_2 = obj.withdraw(amount);
32 */