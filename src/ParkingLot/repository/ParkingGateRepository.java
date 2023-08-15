package ParkingLot.repository;

import ParkingLot.exceptions.ParkingGateNotFoundException;
import ParkingLot.models.Gate;

import java.util.HashMap;

import java.util.Map;
public class ParkingGateRepository {

    private Map<Integer, Gate> gateMap;

    public ParkingGateRepository() {
        this.gateMap = new HashMap<>();
    }

    public Gate get(int gateId) {

        Gate gate = gateMap.get(gateId);
        if(gate == null){
            throw new ParkingGateNotFoundException("Parking Gate not found for this id: " + gateId);
        }

        return gate;

    }

    public void set(Gate gate){
        gateMap.put(gate.getId(), gate);
        System.out.println("Parking gate added successfully ");
    }


}
