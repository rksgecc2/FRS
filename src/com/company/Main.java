package com.company;

public class Main {

    public static void main(String[] args) {
        Passenger passenger = new Passenger("10th Street", "Bangalore","Karnataka","Rohit","1234","rksgecc2@gmail.com");
        Flight flight = new Flight("1234", "Airbus",120,20);
        RegularTicket regularTicket= new RegularTicket("1234","CCU","BLR","12/12/20","12/12/20",false,flight,passenger,"fooding");
        String hotelAddress = "Hotel Grand, Ring Road, Bangalore";
        String[] locations = {"Ooty","Mysore"};
        TouristTicket touristTicket= new TouristTicket("Tourist-1234","CCU","BLR","12/12/20","12/12/20",false,flight,passenger,hotelAddress,locations);
        printTicketDetails(regularTicket);
        printTicketDetails(touristTicket);

    }
    public static void printTicketDetails(Ticket ticket){
        System.out.println(ticket.toString());
    }
	// write your code here
    }

