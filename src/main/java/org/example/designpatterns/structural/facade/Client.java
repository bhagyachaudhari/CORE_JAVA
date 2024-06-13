package org.example.designpatterns.structural.facade;

public class Client {
    public static void main(String[] args) {
        HotelKeeper hotelKeeper = new HotelKeeperImpl();
        System.out.println("***** Veg Menu *****");
        hotelKeeper.getVegMenu();
        System.out.println("***** Non Veg Menu *****");
        hotelKeeper.getNonVegMenu();
        System.out.println("***** Both Veg Non Veg Menu *****");
        hotelKeeper.getVegNonVegBothMenu();
    }
}
