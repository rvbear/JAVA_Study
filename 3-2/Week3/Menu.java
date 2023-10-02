package Week3.Q3;

import java.io.*;

class Menu {
    public int Menu_UI(BufferedReader br) throws IOException {      // 기본 UI 실행 메서드
        System.out.println("-------< 메 뉴 >-------");
        System.out.println("1. 학생 추가");
        System.out.println("2. 교수 추가");
        System.out.println();
        System.out.println("3. 학생목록 출력");
        System.out.println("4. 교수목록 출력");
        System.out.println();
        System.out.println("5. 전체 구성원 출력");
        System.out.println("6. 연구소별 구성원 출력");
        System.out.println();
        System.out.println("9. 화면정리");
        System.out.println("0. 종료");
        System.out.println("----------------------");
        System.out.print("선택 >> ");
        int choice = Integer.parseInt(br.readLine());
        return choice;
    }
}
