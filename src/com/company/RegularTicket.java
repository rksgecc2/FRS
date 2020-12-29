package com.company;

public class RegularTicket extends Ticket{
    private String specialServices;

    public RegularTicket(String pnr, String from, String to, String departureTimeStamp, String arrivalTimeStamp, boolean cancelled, Flight flight, Passenger passenger, String specialServices) {
        super(pnr, from, to, departureTimeStamp, arrivalTimeStamp, cancelled, flight, passenger);
        this.specialServices = specialServices;
    }

    public String getSpecialServices() {
        return specialServices;
    }

    public void updateSpecialServices(String specialServices) {
        this.specialServices = specialServices;
    }
}

