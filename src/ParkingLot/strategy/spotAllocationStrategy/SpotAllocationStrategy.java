package ParkingLot.strategy.spotAllocationStrategy;

import ParkingLot.models.Gate;
import ParkingLot.models.ParkingSpot;
import ParkingLot.models.VehicleType;

public interface SpotAllocationStrategy {

    /***
     *
     * hERE WE WILL PASS GATE AS WELL SINCE, IF A VEHICLE ENTERS, WE WILL FIRST CHECK WITH THE HELP OF GATE
     * THE FLOOR NUMBER AND FOR ANY VACANT SPOTS AVAILABLE. IF YES, THEN WE WILL ASSIGN IT IN THE SAME FLOOR.
     * IF NOT WE CAN THEN ASSIGN IT IN A DIFFERENT FLOOR.
     *
     */
    ParkingSpot getSpot(VehicleType vehicleType, Gate gate);
}
