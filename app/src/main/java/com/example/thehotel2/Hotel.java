package com.example.thehotel2;

public class Hotel {
    int hotelImage;
    String price, hotelName, withsc;

    public String getWithsc() {
        return withsc;
    }

    public Hotel(int hotelImage, String price, String hotelName, String withsc) {
        this.hotelImage = hotelImage;
        this.price = price;
        this.hotelName = hotelName;
        this.withsc = withsc;
    }

    public void setWithsc(String withsc) {
        this.withsc = withsc;
    }

    public int getHotelImage() {
        return hotelImage;
    }

    public void setHotelImage(int hotelImage) {
        this.hotelImage = hotelImage;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }



}
