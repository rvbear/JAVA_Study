import java.util.Scanner;

public class GradingSwitch {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		char grade, gAdd = ' ';
		System.out.print("정수를 입력하세요(0~100): ");
		int score = scanner.nextInt();
		if (score > 100 || score < 0) {
			System.out.println("잘못된 입력입니다.");
			scanner.close();
			return;
		}
		switch (score / 10) {
		case 10:
		case 9:
			grade = 'A';
			if (score > 95)
				gAdd = '+';
			else
				gAdd = '0';
			break;
		case 8:
			grade = 'B';
			if (score > 85)
				gAdd = '+';
			else
				gAdd = '0';
			break;
		case 7:
			grade = 'c';
			if (score > 75)
				gAdd = '+';
			else
				gAdd = '0';
			break;
		default:
			grade = 'F';
			break;
		}
		System.out.println("학점은 " + grade + gAdd + "입니다.");
		scanner.close();
	}
}