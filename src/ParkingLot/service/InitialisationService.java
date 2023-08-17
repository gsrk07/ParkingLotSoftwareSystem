package ParkingLot.service;

import ParkingLot.models.*;
import ParkingLot.repository.ParkingFloorRepository;
import ParkingLot.repository.ParkingGateRepository;
import ParkingLot.repository.ParkingLotRepository;
import ParkingLot.repository.ParkingSpotRepository;

import java.util.ArrayList;
import java.util.List;

public class InitialisationService {

    ParkingLotRepository parkingLotRepository;
    ParkingFloorRepository parkingFloorRepository;
    ParkingSpotRepository parkingSpotRepository;
    ParkingGateRepository parkingGateRepository;

    public InitialisationService() {
        this.parkingLotRepository = new ParkingLotRepository();
        this.parkingFloorRepository = new ParkingFloorRepository();
        this.parkingSpotRepository = new ParkingSpotRepository();
        this.parkingGateRepository = new ParkingGateRepository();
    }

    public void initialise(){

        ParkingLot parkingLot = new ParkingLot();
        parkingLot.setId(1);
        parkingLot.setStatus(Status.ACTIVE);
        parkingLot.setAddress(" Road A, City B, State C");
        parkingLot.setCapacity(100);

        Gate entrygate = new Gate();
        entrygate.setId(1);
        entrygate.setOperator("Ramu");
        entrygate.setGatenumber(1);
        entrygate.setGateType(GateType.ENTRY);
        entrygate.setStatus(Status.ACTIVE);
        entrygate.setFloornumber(1);

        Gate exitgate = new Gate();
        exitgate.setId(2);
        exitgate.setOperator("Somu");
        exitgate.setGatenumber(2);
        exitgate.setGateType(GateType.EXIT);
        exitgate.setStatus(Status.ACTIVE);
        exitgate.setFloornumber(1);

        // ADDING IT TO PARKINGLOT
        parkingLot.setGateList(List.of(entrygate,entrygate)); // adding the gates to parking lot and repo
        parkingGateRepository.set(entrygate);
        parkingGateRepository.set(exitgate);

        // NOW WE GO AHEAD AND CREATE PARKING FLOORS

        List<ParkingFloor> parkingFloorList = new ArrayList<>();

        for(int i = 1; i <= 10; i++){

            ParkingFloor parkingFloor = new ParkingFloor();
            parkingFloor.setId(100 + i);
            parkingFloor.setFloorno(i);
            parkingFloor.setStatus(Status.ACTIVE);

            List<ParkingSpot> parkingSpotList = new ArrayList<>(); // List of spots per floor.

            for(int j = 1; j<= 10; j++){

              ParkingSpot parkingSpot = new ParkingSpot();
              // we dont add vehicle since at time of creating we will not have any vehicle at time of creation of the spot.
              parkingSpot.setId(1000 + j);
              parkingSpot.setNumberofspot(i * 10 + j);
              // CURRENTLY NOT CONSIDERING EV. ONLY 2 AND 4 WHEELERS.
              if(j%2 == 0){
                  parkingSpot.setSupportedvehicleType(VehicleType.TWO_WHEELER);
              }
              else {
                  parkingSpot.setSupportedvehicleType(VehicleType.FOUR_WHEELER);
              }
              parkingSpot.setStatus(Status.AVAILABLE);
              parkingSpotList.add(parkingSpot);
              parkingSpotRepository.set(parkingSpot);
            }
            parkingFloor.setParkingSpotList(parkingSpotList);
            parkingFloorList.add(parkingFloor);
            parkingFloorRepository.set(parkingFloor);
        }

        parkingLot.setParkingFloorList(parkingFloorList);
        parkingLotRepository.set(parkingLot);

    }


}
