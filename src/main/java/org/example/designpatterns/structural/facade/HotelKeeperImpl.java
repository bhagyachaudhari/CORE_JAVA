package org.example.designpatterns.structural.facade;

public class HotelKeeperImpl implements HotelKeeper{
    @Override
    public void getVegMenu() {
        Hotel hotel = new VegRestaurant();
        Menu vegMenu = hotel.getMenu();
        vegMenu.menuList();
    }

    @Override
    public void getNonVegMenu() {
        Hotel hotel = new NonVegRestaurant();
        Menu vegMenu = hotel.getMenu();
        vegMenu.menuList();
    }

    @Override
    public void getVegNonVegBothMenu() {
        Hotel hotel = new VegNonVegBothRestaurant();
        Menu vegMenu = hotel.getMenu();
        vegMenu.menuList();
    }
}
