package ParkingLot.models;

public class Gate extends BaseModel{

    private int gatenumber;
    // private Operator operator;  commenting as of now

    private String operator;
    private Status status;

    private GateType gateType;

    private int floornumber;

    // adding the parkinglot id so that from the gate passed in spot allocation strategy, we can get parkinglot details

    private int parkingLotId;

    public int getGatenumber() {
        return gatenumber;
    }

    public void setGatenumber(int gatenumber) {
        this.gatenumber = gatenumber;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    // as of now making the operator as a string
    //    public Operator getOperator() {
//        return operator;
//    }
//
//    public void setOperator(Operator operator) {
//        this.operator = operator;
//    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public GateType getGateType() {
        return gateType;
    }

    public void setGateType(GateType gateType) {
        this.gateType = gateType;
    }

    public int getFloornumber() {
        return floornumber;
    }

    public void setFloornumber(int floornumber) {
        this.floornumber = floornumber;
    }

    public int getParkingLotId() {
        return parkingLotId;
    }

    public void setParkingLotId(int parkingLotId) {
        this.parkingLotId = parkingLotId;
    }
}
