package Week2.Q1;

public class Q1 {
    public static void main(String[] args) {
        Student student = new Student(1, "김철수", "컴퓨터공학", 1, 3, "객체지향연구소");
        System.out.println("------------------------------------------------");
        System.out.println("ID\t이름\t\t전공\t\t\t학년\t연구소ID\t연구소명");
        System.out.println("------------------------------------------------");
        student.print();
        System.out.println("------------------------------------------------");
    }
}