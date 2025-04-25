package com.example.kiosk;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("=================================================================");
        System.out.println("[SHAKESHACK MENU]");
        System.out.println("1. ShackBurger  | w 8.9 | 토마토, 양상추, 쉑소스가 토핑된 치즈버거");
        System.out.println("2. SmokeShack   | W 9.9 | 베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거");
        System.out.println("3. Cheeseburger | W 6.9 | 포테이토 번과 비프패티, 치즈가 토핑된 치즈버거");
        System.out.println("4. Hamburger    | W 5.4 | 비프패티를 기반으로 야채가 들어간 기본버거");
        System.out.println("0. 종료");
        System.out.println("=================================================================");

        System.out.println("원하시는 메뉴의 번호를 입력해주세요.");
        int input = scan.nextInt();

        switch (input) {
            case 1:
                System.out.println("1번 선택");
                break;
                case 2:
                    System.out.println("2번 선택");
                    break;
                    case 3:
                        System.out.println("3번 선택");
                        break;
                        case 4:
                            System.out.println("4번 선택");
                            break;
                            case 0:
                                System.out.println("종료합니다.");
                                break;
        }



    }
}
