package ParkingLot.repository;

import ParkingLot.exceptions.ParkingFloorNotFoundException;
import ParkingLot.exceptions.ParkingSpotNotFoundException;
import ParkingLot.models.ParkingFloor;
import ParkingLot.models.ParkingSpot;

import java.util.HashMap;

import java.util.Map;
public class ParkingSpotRepository {

    private Map<Integer, ParkingSpot> parkingSpotMap;

    public ParkingSpotRepository() {
        this.parkingSpotMap = new HashMap<>();
    }

    public ParkingSpot get(int parkingspotid){

        ParkingSpot parkingspot = parkingSpotMap.get(parkingspotid);

        if(parkingspot == null){
            throw new ParkingSpotNotFoundException("Parking spot not found for this id: " + parkingspotid);

        }

        return parkingspot;

    }

    public void set(ParkingSpot parkingSpot){

        parkingSpotMap.put(parkingSpot.getId(), parkingSpot);
        System.out.println("Parking spot added successfully ");
    }




}
