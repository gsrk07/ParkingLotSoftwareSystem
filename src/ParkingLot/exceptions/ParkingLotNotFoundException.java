package ParkingLot.exceptions;

public class ParkingLotNotFoundException extends  RuntimeException{

    public ParkingLotNotFoundException(String message) {
        super(message);
    }

    public ParkingLotNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
