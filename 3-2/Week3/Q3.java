package Week3.Q3;

import java.io.*;

public class Q3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Menu menu = new Menu();                 // 메뉴 객체 생성
        MManager mManager = new MManager();     // 학생 관리 객체 생성
        LManager lManager = new LManager();     // 연구실 관리 객체 생성
        mManager.init(lManager);                // default 값 선언

        while(true) {
            int choice = menu.Menu_UI(br);      // menu 객체의 Menu_UI 메서드 실행하여 return 값 받아옴
            System.out.println();
            switch (choice) {                   // 받아온 값을 통해 원하는 동작 실행
                case 1:
                    mManager.AddStudent(lManager, br);
                    break;
                case 2:
                    break;
                case 3:
                    mManager.printAll();
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 9:
                    break;
                case 0:
                    System.out.println("종료합니다.");
                    br.close();
                    return;
                default:
                    System.out.println("잘못된 입력입니다.");
                    break;
            }
            System.out.println();
        }
    }
}
