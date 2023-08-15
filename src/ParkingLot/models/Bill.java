package ParkingLot.models;

import java.time.LocalDateTime;

public class Bill extends  BaseModel{

    private LocalDateTime exittime;

    private int amount;
    private Ticket ticket;

    private Gate gate; // gate at which Bill was generated.

    public LocalDateTime getExittime() {
        return exittime;
    }

    public void setExittime(LocalDateTime exittime) {
        this.exittime = exittime;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public Gate getGate() {
        return gate;
    }

    public void setGate(Gate gate) {
        this.gate = gate;
    }
}
