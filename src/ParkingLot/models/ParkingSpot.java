package ParkingLot.models;

public class ParkingSpot extends BaseModel{

    private int numberofspot;

    private VehicleType supportedvehicleType;

    private Status status;
    private Vehicle vehicle;

    public int getNumberofspot() {
        return numberofspot;
    }

    public void setNumberofspot(int numberofspot) {
        this.numberofspot = numberofspot;
    }

    public VehicleType getSupportedvehicleType() {
        return supportedvehicleType;
    }

    public void setSupportedvehicleType(VehicleType supportedvehicleType) {
        this.supportedvehicleType = supportedvehicleType;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
}

// in the code we replicate real-time world

// So instead of parking spot containing floor details, Parking floor will have the list<ParkingSpots>
// in db since we represent cardinalities, we then can have the parking_Floor_id in Parkingspot table.