import java.util.Scanner;

public class Guess_number {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int i = (int)(Math.random()*100+1);
		int count = 0;
		while(true) {
			System.out.print("정답을 추측하여 보시오: ");
			int find = scanner.nextInt();
			count++;
			if(i == find) {
				System.out.println("축하합니다. 시도횟수="+count);
				scanner.close();
				return;
			}
			else if(i < find)
				System.out.println("제시한 정수가 높습니다.");
			else
				System.out.println("제시한 정수가 낮습니다.");
		}
	}
}