package Week3.Q3;

import java.io.*;

public class LManager {
    Lab[] lList;
    int index;

    public LManager() {         // 생성자
        lList = new Lab[50];
        index = 0;
    }

    public void init() {        // 기본값 설정
        lList[index++] = new Lab(1, "객체지향연구소");
        lList[index++] = new Lab(2, "Cpp연구소");
        lList[index++] = new Lab(3, "웹연구소");
        lList[index++] = new Lab(4, "Java연구소");
    }

    public void printAll() {        // llist에 있는 모든 값을 출력
        System.out.println("------------------------");
        System.out.println("연구소 ID\t연구소명");
        System.out.println("------------------------");
        for(Lab l : lList) {
            if(l != null) {
                l.print();
            }
        }
        System.out.println("------------------------");
    }

    public Lab Select_lab(BufferedReader br) throws IOException {       // 학생 추가시 연구실 선택할 때 실행하는 메서드
        System.out.println("<< 연구실 선택 >>");
        int choice = 0;
        while(true) {
            printAll();
            System.out.print("선택 >> ");
            choice = Integer.parseInt(br.readLine());
            if (choice <= index) {
                break;
            }
        }
        return lList[choice-1];
    }

    public void printOne(int id) {
        lList[id-1].print();
    }
}