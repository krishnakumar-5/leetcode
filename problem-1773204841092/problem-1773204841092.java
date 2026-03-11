// Last updated: 3/11/2026, 10:24:01 AM
1class ParkingSystem {
2    private int big;
3    private int medium;
4    private int small;
5    public ParkingSystem(int big, int medium, int small) {
6         this.big=big;
7         this.medium=medium;
8         this.small=small;
9    }
10    public boolean addCar(int carType) {
11        if(carType==1&&big>0){
12             big--;
13             return true;
14        }
15        if(carType==2&&medium>0){
16             medium--;
17             return true;
18        }
19        if(carType==3&&small>0){
20             small--;
21             return true;
22        }
23        else
24            return false;
25        
26    }
27}
28
29/**
30 * Your ParkingSystem object will be instantiated and called as such:
31 * ParkingSystem obj = new ParkingSystem(big, medium, small);
32 * boolean param_1 = obj.addCar(carType);
33 */