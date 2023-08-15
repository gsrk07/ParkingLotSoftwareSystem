package ParkingLot.exceptions;

public class ParkingSpotNotFoundException extends RuntimeException{

    public ParkingSpotNotFoundException(String message) {
        super(message);
    }
}
