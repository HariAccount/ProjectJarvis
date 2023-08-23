package BusProject;

public class Bus {
    private int busNo;
    private boolean ac;
    private int capacity;
//    Since variables are set private get and set method are used to access them
    // get methods are called and set methods are called mutators
    Bus(int no,boolean ac,int cap)// Constructor for bus class
    {
        busNo=no;
        this.ac=ac;
        capacity=cap;
    }
    public int getBusNo() {
        return busNo;
    }
    public void setBusNo(int no) {
        busNo= no ;
    }
    public boolean getAC(){
        return this.ac;
    }
    public void setAc(boolean ac){
        this.ac=ac;
    }
    public int getCapacity(){
        return capacity;
    }
    public void setCapacity(int cap){
        capacity=cap;
    }

    public void displayBusInfo(){
        System.out.println("Bus no= "+ busNo +" AC= "+ ac+" Capacity= "+capacity);
    }
}
