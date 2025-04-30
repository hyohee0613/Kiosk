package com.example.kiosk;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Kiosk {

    //키오스크 프로그램의 메뉴를 관리하고 사용자 입력을 처리하는 클래스

    private List<Menu> menu;


    public Kiosk(List<Menu> menu) {
        this.menu = menu;
    }


    //기능

    public List<Menu> getMenu() {
        return menu;
    }

    public void start () {
        Scanner scan = new Scanner(System.in);

        while (true) {
        System.out.println("=================================================================");
        System.out.println("[MAIN MENU]");

        for (int i = 0; i < menu.size(); i++) {
            System.out.println((i + 1) + ". " + menu.get(i).getCategory());
        }

        System.out.println("0. 종료");
        System.out.println("=================================================================");

        System.out.println("원하시는 메뉴의 번호를 입력해주세요.");

        try {
            int input = scan.nextInt();

            if (input == 0) {
                System.out.println("주문을 종료합니다.");
                break;
            }

            if (input >= 1 && input <= menu.size()) {
                Menu selectMenu = menu.get(input - 1);
                System.out.println("[" + selectMenu.getCategory() + " MENU]");
                selectMenu.printcategory();

                System.out.println("0. 뒤로가기");
                System.out.println("원하시는 메뉴의 번호를 입력해주세요.");

                int inputItem = scan.nextInt();

                if (inputItem == 0) {
                    continue;   // 메인 메뉴로
                }

                List<MenuItem> items = selectMenu.getMenuItems();
                if (inputItem >= 1 && inputItem <= items.size()) {
                    MenuItem selectedItem = items.get(inputItem - 1);
                    System.out.println("선택한 메뉴: \n" + selectedItem);
                    break;

                } else {
                    System.out.println("올바른 번호를 입력해주세요.");
                }
            }

        } catch (InputMismatchException e) {
            scan.next();
            System.out.println("다시 입력해주세요");
        }

            }
        }

    }



