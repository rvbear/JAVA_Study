package Week2.Q2;

import java.io.*;

public class Q2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        LManager lManager = new LManager();
        lManager.init();

        System.out.print("- 연구소 ID (전체보기는 0) : ");
        int choice = Integer.parseInt(br.readLine());

        if(choice == 0) {
            System.out.println("------------------------");
            System.out.println("연구소 ID\t연구소명");
            System.out.println("------------------------");
            lManager.printAll();
            System.out.println("------------------------");
        } else if(choice <= lManager.index) {
            System.out.println("------------------------");
            System.out.println("연구소 ID\t연구소명");
            System.out.println("------------------------");
            lManager.printOne(choice);
            System.out.println("------------------------");
        } else {
            System.out.println("존재하지 않는 ID 입니다.");
        }
    }
}