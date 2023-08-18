package ParkingLot.strategy.feeCalculationStrategy;

import ParkingLot.models.ParkingFloor;
import ParkingLot.models.Ticket;
import ParkingLot.models.VehicleType;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class LowFeeCalculationStrategy implements FeeCalculationStrategy{

    private static final int PER_MIN_2_WHEELER = 2;
    private static final int PER_MIN_4_WHEELER = 5;

    @Override
    public long getAmount(Ticket ticket) {

        LocalDateTime entrytime = ticket.getEntrytime();
        LocalDateTime currenttime = LocalDateTime.now();
        long numberofminutes = ChronoUnit.MINUTES.between(currenttime,entrytime);

        if(ticket.getVehicle().getVehicleType().equals(VehicleType.TWO_WHEELER)){
            return numberofminutes * PER_MIN_2_WHEELER;
        }
        else {
            return numberofminutes * PER_MIN_4_WHEELER;
        }
    }
}
