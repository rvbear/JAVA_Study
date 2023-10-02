package Week3.Q3;

import java.io.*;

class MManager {
    Student[] sList;
    int index;

    public MManager() {     // 생성자
        sList = new Student[50];
        index = 0;
    }

    public void init(LManager lManager) {       // 기본값 설정
        index = 0;
        lManager.init();
        sList[index++] = new Student(index, "김철수", "컴퓨터공학", 1, lManager.lList[2]);
        sList[index++] = new Student(index, "홍길동", "소프트웨어", 2, lManager.lList[0]);
        sList[index++] = new Student(index, "김동수", "컴퓨터공학", 3, lManager.lList[3]);
        sList[index++] = new Student(index, "이철희", "소프트웨어", 4, lManager.lList[0]);
    }

    public void printAll() {        // 학생 list에 있는 모든 값을 출력
        System.out.println("----------------------------------------------------");
        System.out.println("학생ID\t이름\t\t전공\t\t\t학년\t연구소ID\t연구소명");
        System.out.println("----------------------------------------------------");
        for(Student s : sList) {
            if(s != null) {
                s.print();
            }
        }
        System.out.println("----------------------------------------------------");
    }

    public void AddStudent(LManager lManager, BufferedReader br) throws IOException {       // 학생 추가 메서드
        System.out.println("<< 학생 추가 >>");
        System.out.println("- id : " + (index + 1));
        System.out.print("- 이름 : ");
        String name = br.readLine();
        System.out.print("- 학과 : ");
        String major = br.readLine();
        System.out.print("- 학년 : ");
        int grade = Integer.parseInt(br.readLine());
        Lab lab = lManager.Select_lab(br);
        if(index < 50) {
            sList[index++] = new Student(index, name, major, grade, lab);
            System.out.println("학생 추가 완료!");
        } else {
            System.out.println("학생 인원 초과..");
        }
    }
}