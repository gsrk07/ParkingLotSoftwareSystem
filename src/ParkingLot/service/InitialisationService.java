package ParkingLot.service;

import ParkingLot.models.*;
import ParkingLot.repository.ParkingFloorRepository;
import ParkingLot.repository.ParkingGateRepository;
import ParkingLot.repository.ParkingLotRepository;
import ParkingLot.repository.ParkingSpotRepository;

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
        parkingLot.setGateList(List.of(entrygate,entrygate));
        parkingGateRepository.set(entrygate);
        parkingGateRepository.set(exitgate);


    }


}
