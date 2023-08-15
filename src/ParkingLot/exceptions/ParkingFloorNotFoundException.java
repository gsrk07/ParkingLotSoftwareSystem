package ParkingLot.exceptions;

public class ParkingFloorNotFoundException extends RuntimeException{
    public ParkingFloorNotFoundException(String message) {
        super(message);
    }
}
