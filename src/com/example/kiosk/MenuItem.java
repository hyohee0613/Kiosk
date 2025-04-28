package com.example.kiosk;

import java.util.ArrayList;
import java.util.List;

public class MenuItem {

    // 속성
    String name;
    double price;
    String description;
//    List<MenuItem> menuItems = new ArrayList<>();

    //생성자
    public MenuItem (String name, double price, String description) {
        this.name = name;
        this.price = price;
        this.description = description;
    }

    //기능
    @Override
    public String toString() {
        return name + " | w " + price + " | " + description;
    }
}
