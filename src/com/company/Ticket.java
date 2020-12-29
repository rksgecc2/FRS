package com.company;

import java.time.LocalDateTime;

public abstract class Ticket {
    private String pnr;
    private String from;
    private String to;
    private String departureTimeStamp;
    private String arrivalTimeStamp;
    private boolean cancelled;

    private Flight flight;
    private Passenger passenger;

    public Ticket(String pnr, String from, String to, String departureTimeStamp, String arrivalTimeStamp, boolean cancelled, Flight flight, Passenger passenger) {
        this.pnr = pnr;
        this.from = from;
        this.to = to;
        this.departureTimeStamp = departureTimeStamp;
        this.arrivalTimeStamp = arrivalTimeStamp;
        this.cancelled = cancelled;
        this.flight = flight;
        this.passenger = passenger;
        flight.incrementBookingCounter();
    }

    public String getPnr() {
        return pnr;
    }

    public void setPnr(String pnr) {
        this.pnr = pnr;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getDepartureTimeStamp() {
        return departureTimeStamp;
    }

    public void setDepartureTimeStamp(String departureTimeStamp) {
        this.departureTimeStamp = departureTimeStamp;
    }

    public String getArrivalTimeStamp() {
        return arrivalTimeStamp;
    }

    public void setArrivalTimeStamp(String arrivalTimeStamp) {
        this.arrivalTimeStamp = arrivalTimeStamp;
    }

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }
    public void cancelTicket(){
        this.cancelled=true;
    }
    public int getFlightDuration(){
        LocalDateTime departureTimeStamp = LocalDateTime.parse(this.departureTimeStamp);
        LocalDateTime arrivalTimeStamp = LocalDateTime.parse(this.arrivalTimeStamp);
        int days = arrivalTimeStamp.getDayOfMonth()-departureTimeStamp.getDayOfMonth();
        int totalHours = (days*24)+ arrivalTimeStamp.getHour()-departureTimeStamp.getHour();
        return totalHours;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "pnr = '" + pnr + '\'' +
                ", from ='" + from + '\'' +
                ", to ='" + to + '\'' +
                ", departureTimeStamp ='" + departureTimeStamp + '\'' +
                ", arrivalTimeStamp='" + arrivalTimeStamp + '\'' +
                "}";
    }
}
