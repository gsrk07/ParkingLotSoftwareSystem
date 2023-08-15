package ParkingLot.repository;

import ParkingLot.exceptions.ParkingFloorNotFoundException;
import ParkingLot.models.ParkingFloor;

import java.util.HashMap;
import java.util.Map;

public class ParkingFloorRepository {

    private Map<Integer, ParkingFloor> parkingFloorMap;

    public ParkingFloorRepository() {
        this.parkingFloorMap = new HashMap<>();
    }

    public ParkingFloor get(int parkingfloorid){

        ParkingFloor parkingFloor = parkingFloorMap.get(parkingfloorid);

        if(parkingFloor == null){
            throw new ParkingFloorNotFoundException("Parking floor not found for this id: " + parkingfloorid);

        }

        return parkingFloor;
    }

    public void set (ParkingFloor parkingFloor){
        parkingFloorMap.put(parkingFloor.getId(),parkingFloor);
        System.out.println(" Parking floor added successfully ");
    }
}
