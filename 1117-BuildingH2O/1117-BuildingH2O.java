// Last updated: 3/14/2026, 2:41:43 PM
1class H2O{
2    int hcount=0;
3    public synchronized void hydrogen(Runnable releaseHydrogen) throws InterruptedException {
4        while(hcount==2){
5                wait();   
6        }
7        hcount++;
8        releaseHydrogen.run();
9        notifyAll();
10
11    }
12    public synchronized void oxygen(Runnable releaseOxygen) throws InterruptedException {
13        while(hcount<2){
14                wait();
15        }
16        hcount=0;
17        releaseOxygen.run();
18        notifyAll();
19
20    }
21}
22
23