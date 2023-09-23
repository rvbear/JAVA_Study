package Week1;

import java.io.*;

public class GameController {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true) {
            System.out.println("------시 작 화 면------");
            System.out.println("1. 업-다운 게임");
            System.out.println("2. 숫자야구 게임");
            System.out.println("0. 종료");
            System.out.println("---------------------");
            System.out.print("입력해주세요 >> ");
            int choice = Integer.parseInt(br.readLine());

            System.out.println();
            switch (choice) {
                case 1:
                    System.out.println("게임을 시작하겠습니다.");
                    UpDownGame updowngame = new UpDownGame(br);
                    updowngame.play();
                    break;
                case 2:
                    System.out.println("게임을 시작하겠습니다.");
                    NumberBaseball numberbaseball = new NumberBaseball(br);
                    numberbaseball.play();
                    break;
                case 0:
                    System.out.println("정말 종료하시겠습니까?");
                    System.out.println("1. Yes / 2. No");
                    System.out.print(">> ");
                    int result = Integer.parseInt(br.readLine());
                    if (result == 1) {
                        br.close();
                        return;
                    } else {
                        break;
                    }
            }
            System.out.println();
        }
    }
}