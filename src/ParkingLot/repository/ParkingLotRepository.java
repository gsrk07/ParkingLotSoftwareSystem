package ParkingLot.repository;

import ParkingLot.exceptions.ParkingLotNotFoundException;
import ParkingLot.models.Gate;
import ParkingLot.models.ParkingLot;

import java.util.HashMap;
import java.util.Map;

public class ParkingLotRepository {

    private Map<Integer, ParkingLot> parkingLotMap;

    public ParkingLotRepository() {
        this.parkingLotMap = new HashMap<>();
    }

    public ParkingLot get(int parkinglotid){

        ParkingLot parkingLot = parkingLotMap.get(parkinglotid);

        if(parkingLot == null) {
            throw new ParkingLotNotFoundException("Parking lot not found for this id" + parkinglotid);
        }

        return parkingLot;
    }

    public void set(ParkingLot parkingLot){
        parkingLotMap.put(parkingLot.getId(), parkingLot);
        System.out.println("Parking lot has been added successfully");
    }

    public ParkingLot getParkingLotfromGate(Gate gate) {

        int parkingLotid = gate.getParkingLotId();
        ParkingLot parkingLot = parkingLotMap.get(parkingLotid);
        if(parkingLot == null){
            throw new ParkingLotNotFoundException("Parking lot not found for Gate: " + gate.getId());
        }

        return parkingLot;

    }
}
