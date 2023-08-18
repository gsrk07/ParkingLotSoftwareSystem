package ParkingLot.dto;

import ParkingLot.models.ParkingSpot;
import ParkingLot.models.ResponseStatus;
import ParkingLot.models.Ticket;

public class IssueTicketResponseDto {

    private ResponseStatus responseStatus;

    private String failurereason;

    private Ticket ticket;

    public ResponseStatus getResponseStatus() {
        return responseStatus;
    }

    public void setResponseStatus(ResponseStatus responseStatus) {
        this.responseStatus = responseStatus;
    }

    public String getFailurereason() {
        return failurereason;
    }

    public void setFailurereason(String failurereason) {
        this.failurereason = failurereason;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }
}
