package com.ll;

import java.util.Scanner;

class App {
    void run() {
        System.out.println("== 명언 앱 ==");
        while (true) {
            System.out.print("명령) ");

            Scanner scanner = new Scanner(System.in);
            String cmd = scanner.nextLine();

            if (cmd.equals("종료")) {
                break;
            } else if (cmd.equals("등록")) {
                System.out.print("명언: ");
                String content = scanner.nextLine();

                System.out.print("작가: ");
                String authorName =scanner.nextLine();

                System.out.println("1번 명언이 등록되었습니다.");

            }

            //System.out.printf("입력하신 명령 : %s\n", cmd);
            // 위 라인은 아래 라인과 같은 뜻
            // System.out.print("입력하신 명령 : " + cmd + "\n");
        }

    }
}
