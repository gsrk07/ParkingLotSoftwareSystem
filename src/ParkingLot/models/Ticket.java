package ParkingLot.models;

import java.time.LocalDateTime;

public class Ticket extends  BaseModel{

    private LocalDateTime entrytime;

    private Vehicle vehicle;

    private ParkingSpot parkingSpot;

    public LocalDateTime getEntrytime() {
        return entrytime;
    }

    public void setEntrytime(LocalDateTime entrytime) {
        this.entrytime = entrytime;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public ParkingSpot getParkingSpot() {
        return parkingSpot;
    }

    public void setParkingSpot(ParkingSpot parkingSpot) {
        this.parkingSpot = parkingSpot;
    }
}
