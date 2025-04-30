package com.example.kiosk;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Kiosk {

    //키오스크 프로그램의 메뉴를 관리하고 사용자 입력을 처리하는 클래스

    public List<Menu> menu;


    public Kiosk(List<Menu> menu) {
        this.menu = menu;
    }


    //기능
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

            if (input == 1) {
                Menu menu1 = menu.get(0);
                System.out.println("[BURGER MENU]");
                menu1.printcategory();
                break;
            } else if (input == 2) {
                Menu menu2 = menu.get(1);
                System.out.println("[DRINK MENU]");
                menu2.printcategory();
                break;
            } else if (input == 3) {
                Menu menu3 = menu.get(2);
                System.out.println("[SIDE MENU]");
                menu3.printcategory();
                break;
            } else if (input == 4) {
                System.out.println("4번 선택");
                break;
            } else if (input == 0) {
                System.out.println("종료합니다.");
                break;
            } else {
                System.out.println("다시 입력해주세요");
            }

        } catch (InputMismatchException e) {
            scan.next();
            System.out.println("다시 입력해주세요");
        }

            }
        }

    }



