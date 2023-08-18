package ParkingLot;

import ParkingLot.models.ParkingLot;
import ParkingLot.service.InitialisationService;

/***
 *
 * This class is solely created at the time of finishing the Parking Lot initialisation Service and to test
 * our parking lot. Like how parking lot is looking, the parking floors, the parking spots per each floor etc.
 */
public class Main {

    private InitialisationService initialisationService;

    public Main() {
        this.initialisationService = new InitialisationService();
    }

    public static void main(String[] args) {
        // this is just a jugaad technique to test our initialisation service of parking lot.
        Main main = new Main();
        ParkingLot parkingLot = main.initialisationService.initialise();
    }
}
