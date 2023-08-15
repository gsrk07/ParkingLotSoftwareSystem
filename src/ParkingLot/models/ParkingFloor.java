package ParkingLot.models;

import java.util.List;

public class ParkingFloor extends  BaseModel{

    private int floorno;

    private List<ParkingSpot> parkingSpotList;

    private Status status; // this is to check if floor is running or not or maybe under maintenance
}
