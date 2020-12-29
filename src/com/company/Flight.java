package com.company;

public class Flight {
    private String flightNumber;
    private String airLine;
    public int capacity;
    private int bookedSeat;

    public Flight(String flightNumber, String airLine, int capacity, int bookedSeat) {
        this.flightNumber = flightNumber;
        this.airLine = airLine;
        this.capacity = capacity;
        this.bookedSeat = bookedSeat;
    }
    public String getFlightDetails(){
        return "Flight Number "+this.flightNumber+", Airline "+this.airLine+", Capacity "+this.capacity+", booked Seats "+this.bookedSeat;
    }
    public boolean checkAvailability(){
        if (capacity<bookedSeat)
            return true;
        else
            return false;
    }
    public void incrementBookingCounter(){
        bookedSeat++;
    }
}
