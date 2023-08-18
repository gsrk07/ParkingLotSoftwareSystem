package ParkingLot.strategy.spotAllocationStrategy;

import ParkingLot.exceptions.ParkingSpotNotFoundException;
import ParkingLot.models.*;
import ParkingLot.repository.ParkingLotRepository;

public class DesiredSpotAllocationStrategy implements SpotAllocationStrategy{

    // we will be calling this method from generate a ticket. and generate a ticket should have a method for getting spot. and this generation of ticket will be coming from gate.

    private ParkingLotRepository parkingLotRepository;

    public DesiredSpotAllocationStrategy(ParkingLotRepository parkingLotRepository) {
        this.parkingLotRepository = parkingLotRepository;
    }

    @Override
    public ParkingSpot getSpot(VehicleType vehicleType, Gate gate) {

        // For getting the spot, we need the parking lot first and then the floor and then spot

        ParkingLot parkingLot = parkingLotRepository.getParkingLotfromGate(gate);
        int currentfloor = gate.getFloornumber();

        // DOUBT ASK SYANDAN WHY HERE IT IS currentfloor-1?
        ParkingFloor parkingFloor = parkingLot.getParkingFloorList().get(currentfloor);

        for(ParkingSpot parkingSpot : parkingFloor.getParkingSpotList()){
            if(parkingSpot.getSupportedvehicleType().equals(vehicleType)
            && parkingSpot.getStatus().equals(Status.AVAILABLE)){
                return parkingSpot;
            }
        }

        // if we dont find the parking spot in the desired parking floor. now we go and search other floors

        for(ParkingFloor floor : parkingLot.getParkingFloorList()){
            for(ParkingSpot parkingSpot : floor.getParkingSpotList()){
                if(parkingSpot.getSupportedvehicleType().equals(vehicleType)
                        && parkingSpot.getStatus().equals(Status.AVAILABLE)){
                    return parkingSpot;
                }
            }
        }
        throw new ParkingSpotNotFoundException("No Parking Spot available for this vehicle type: "+ vehicleType);
    }
}
