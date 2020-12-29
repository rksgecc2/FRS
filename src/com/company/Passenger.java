package com.company;

public class Passenger {
    public static int idCounter =0;
    private int id ;
    private static class Address{
        String street, city,state;
        public Address(String street, String city, String state) {
            this.street = street;
            this.state = state;
            this.city=city;
        }
        public String getAddressDetails(){
            return "Street : "+this.street+", City : "+this.city+", State: "+this.state;
        }
        public void updateAddressDetails(String street, String city, String state){
            this.street = street;
            this.city = city;
            this.state = state;
        }
    }
    private static class Contact{
        String name,phone,email;
        public Contact(String name, String phone, String email){
            this.name =name;
            this.phone = phone;
            this.email = email;
        }
        public String getContactDetails(){
            return "Name : "+this.name+", Phone : "+this.phone+", Email : "+this.email;
        }
        public void updateContactDetails(String name, String phone, String email){
            this.name = name;
            this.phone = phone;
            this.email = email;
        }
    }
    private Contact contact;
    private Address address;

    public Passenger(String street, String city, String state, String name, String phone, String email) {
        this.id = ++ idCounter;
        this.address = new Address(street,city,state);
        this.contact = new Contact(name,phone,email);
    }

    public int getId() {
        return this.id;
    }

    public String getAddress() {
        return this.address.getAddressDetails();
    }

    public String getContact() {
        return this.contact.getContactDetails();
    }
    public static int getPassengerCount(){
        return idCounter;
    }
}
