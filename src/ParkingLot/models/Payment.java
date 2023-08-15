package ParkingLot.models;

import java.time.LocalDateTime;
import java.util.List;

public class Payment extends  BaseModel{

    private int amount;
    private LocalDateTime exittime;
    private PaymentMode paymentMode;

    private String transactionNo;

    private Bill bill;

    private Status paymentstatus;

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public LocalDateTime getExittime() {
        return exittime;
    }

    public void setExittime(LocalDateTime exittime) {
        this.exittime = exittime;
    }

    public PaymentMode getPaymentMode() {
        return paymentMode;
    }

    public void setPaymentMode(PaymentMode paymentMode) {
        this.paymentMode = paymentMode;
    }

    public String getTransactionNo() {
        return transactionNo;
    }

    public void setTransactionNo(String transactionNo) {
        this.transactionNo = transactionNo;
    }

    public Bill getBill() {
        return bill;
    }

    public void setBill(Bill bill) {
        this.bill = bill;
    }

    public Status getPaymentstatus() {
        return paymentstatus;
    }

    public void setPaymentstatus(Status paymentstatus) {
        this.paymentstatus = paymentstatus;
    }
}
