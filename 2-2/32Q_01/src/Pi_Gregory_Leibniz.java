import java.util.Scanner;

public class Pi_Gregory_Leibniz {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double Pi = 4;
		System.out.print("반복횟수를 입력하세요: ");
		int num = scanner.nextInt();

		for (int i = 1; i < num; i++) {
			if (i % 2 != 0)
				Pi += (-4) / (double)(2 * i + 1);
			else
				Pi += (4 / (double)(2 * i + 1));
		}

		System.out.println("Pi = " + Pi);
		scanner.close();
	}
}