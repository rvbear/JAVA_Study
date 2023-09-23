package Week1;

import java.io.*;
import java.util.StringTokenizer;

class NumberBaseball {
    BufferedReader br;

    public NumberBaseball(BufferedReader _br) {
        br = _br;
    }

    public int[] make_question() {
        int[] make = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] question = new int[4];

        for(int i = 0; i < 4; i++) {
            int random = (int)(Math.random() * 9);
            question[i] = make[random];
        }

        return question;
    }

    public void play() throws IOException {
        int[] question = make_question();
        int count = 1;

        while(true) {
            System.out.println("숫자를 입력해주세요 (각 숫자마다 띄어쓰기 포함)");
            System.out.print(">> ");
            StringTokenizer stk = new StringTokenizer(br.readLine());
            if(stk.countTokens() != 4) {
                System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
                continue;
            }
            int strike = 0, ball = 0;
            for(int i = 0; i < 4; i++) {
                int answer = Integer.parseInt(stk.nextToken());
                for(int j = 0; j < 4; j++) {
                    if(question[j] == answer) {
                        if(i == j) {
                            strike++;
                        } else {
                            ball++;
                        }
                    }
                }
            }
            if(strike == 4) {
                System.out.println("정답을 맞추셨습니다! 도전횟수 : " + count);
                break;
            }
            System.out.println(strike + "S " + ball + "B");
            System.out.println();
            count++;
        }
    }
}