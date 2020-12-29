package com.company;

public class TouristTicket extends Ticket {
    private String hotelAddress;
    private String[] selectedTouristLocations = new String[5];

    public TouristTicket(String pnr, String from, String to, String departureTimeStamp, String arrivalTimeStamp, boolean cancelled, Flight flight, Passenger passenger, String hotelAddress, String[] selectedTouristLocations) {
        super(pnr, from, to, departureTimeStamp, arrivalTimeStamp, cancelled, flight, passenger);
        this.hotelAddress = hotelAddress;
        this.selectedTouristLocations = selectedTouristLocations;
    }

    public String getHotelAddress() {
        return hotelAddress;
    }

    public String[] getSelectedTouristLocations() {
        return selectedTouristLocations;
    }
    public void removeTouristLocation(String location){
        for(int i =0;i< selectedTouristLocations.length;i++){
            if (selectedTouristLocations[i]==location){
                for (int j=i;j<selectedTouristLocations.length-1;j++){
                    selectedTouristLocations[j]=selectedTouristLocations[j+1];
                }
            }
        }
    }
    public void addTouristLocation(String location){
        if (selectedTouristLocations.length<5){
            for(int i=0;i<selectedTouristLocations.length;i++){
                if(selectedTouristLocations[i]==null){
                    selectedTouristLocations[i] = location;
                }
            }
        }
    }
}

