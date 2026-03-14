// Last updated: 3/14/2026, 2:36:10 PM
1class H2O{
2    int hcount=0;
3    public synchronized void hydrogen(Runnable releaseHydrogen) throws InterruptedException {
4        while(hcount==2){
5            try{
6                wait();
7            }catch(InterruptedException e){
8                System.out.print(e.getMessage());
9            }
10        }
11        hcount++;
12        releaseHydrogen.run();
13        notifyAll();
14
15    }
16    public synchronized void oxygen(Runnable releaseOxygen) throws InterruptedException {
17        while(hcount<2){
18            try{
19                wait();
20            }catch(InterruptedException e){
21                System.out.print(e.getMessage());
22            }
23        }
24        hcount=0;
25        releaseOxygen.run();
26        notifyAll();
27
28    }
29}
30
31