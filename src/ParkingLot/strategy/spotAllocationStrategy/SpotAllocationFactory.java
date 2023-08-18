package ParkingLot.strategy.spotAllocationStrategy;

import ParkingLot.repository.ParkingLotRepository;

public class SpotAllocationFactory {

    public static SpotAllocationStrategy getSpotAllocationStrategy(ParkingLotRepository parkingLotRepository) {

        return new DesiredSpotAllocationStrategy(parkingLotRepository);
    }
}
