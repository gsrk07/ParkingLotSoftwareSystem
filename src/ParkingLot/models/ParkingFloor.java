package ParkingLot.models;

import java.util.List;

public class ParkingFloor extends  BaseModel{

    private int floorno;

    private List<ParkingSpot> parkingSpotList;

    private Status status; // this is to check if floor is running or not or maybe under maintenance

    public int getFloorno() {
        return floorno;
    }

    public void setFloorno(int floorno) {
        this.floorno = floorno;
    }

    public List<ParkingSpot> getParkingSpotList() {
        return parkingSpotList;
    }

    public void setParkingSpotList(List<ParkingSpot> parkingSpotList) {
        this.parkingSpotList = parkingSpotList;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
