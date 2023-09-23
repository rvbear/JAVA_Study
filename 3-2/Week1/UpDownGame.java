package Week1;

import java.io.*;

class UpDownGame {
    BufferedReader br;

    public UpDownGame(BufferedReader _br) {
        br = _br;
    }

    public void play() throws IOException {
        int question_num = (int)(Math.random() * 100) + 1;          // Math.random() * (최댓값 - 최솟값 + 1) + 최솟값
        int result_num, index = 1;
        while(true) {
            System.out.print("값을 입력해주세요 >> ");
            result_num = Integer.parseInt(br.readLine());
            if(result_num == question_num) {
                break;
            } else if(result_num < question_num) {
                System.out.println("값이 작습니다.");
            } else {
                System.out.println("값이 큽니다.");
            }
            index++;
        }

        System.out.println("정답입니다! " + index + "회만에 맞추셨습니다.");
    }
}
