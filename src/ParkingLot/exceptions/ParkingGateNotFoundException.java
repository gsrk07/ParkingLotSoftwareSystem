package ParkingLot.exceptions;

public class ParkingGateNotFoundException extends RuntimeException{

    public ParkingGateNotFoundException(String message) {
        super(message);
    }
}
