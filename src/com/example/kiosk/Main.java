package com.example.kiosk;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        List<MenuItem> burgerItems = new ArrayList<>();

        burgerItems.add(new MenuItem("ShackBurger", 8.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
        burgerItems.add(new MenuItem("SmokeShack", 9.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"));
        burgerItems.add(new MenuItem("Cheeseburger", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"));
        burgerItems.add(new MenuItem("Hamburger", 5.4, "비프패티를 기반으로 야채가 들어간 기본버거"));

        // Menu 생성 및 항목 추가
        Menu burger = new Menu("burger");
        for (MenuItem item : burgerItems) {
            burger.getMenuItems().add(item);
        }

        // 메뉴 리스트에 추가
        List<Menu> menu = new ArrayList<>();
        menu.add(burger);

        Kiosk kiosk = new Kiosk(menu);
        kiosk.start();




    }
}
