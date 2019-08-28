package com.stackroute;

public class Event {

    public Event(String title, String city, String type, String price) {
        this.title = title;
        this.city = city;
        this.type = type;
        this.price = Integer.parseInt(price);
    }

    public String getTitle() {
        return title;
    }

    public String getCity() {
        return city;
    }

    public String getType() {
        return type;
    }

    public int getPrice() {
        return price;
    }

    String title, city, type;
    int price;

    @Override
    public String toString() {
        return "Event : " +
                "title='" + title + '\'' +
                ", city='" + city + '\'' +
                ", type='" + type + '\'' +
                ", price=" + price +
                '}';
    }


}

