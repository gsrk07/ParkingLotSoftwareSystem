package ParkingLot.strategy.feeCalculationStrategy;

import ParkingLot.models.Ticket;
import ParkingLot.models.VehicleType;

public interface FeeCalculationStrategy {


    long getAmount(Ticket ticket);
}
