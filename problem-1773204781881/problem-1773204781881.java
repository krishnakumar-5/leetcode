// Last updated: 3/11/2026, 10:23:01 AM
1class ParkingSystem {
2    private int big;
3    private int medium;
4    private int small;
5    public ParkingSystem(int big, int medium, int small) {
6         this.big=big;
7         this.medium=medium;
8         this.small=small;
9    }
10    
11    public boolean addCar(int carType) {
12        if(carType==1&&big>0){
13             big--;
14             return true;
15        }
16        if(carType==2&&medium>0){
17             medium--;
18             return true;
19        }
20        if(carType==3&&small>0){
21             small--;
22             return true;
23        }
24        else{
25            return false;
26        }
27    }
28}
29
30/**
31 * Your ParkingSystem object will be instantiated and called as such:
32 * ParkingSystem obj = new ParkingSystem(big, medium, small);
33 * boolean param_1 = obj.addCar(carType);
34 */