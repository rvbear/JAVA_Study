import java.util.Scanner;

public class MiniGame {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("n값을 입력하세요: ");
		int n = scanner.nextInt();
		System.out.print("m값을 입력하세요: ");
		int m = scanner.nextInt();
		System.out.print("p값을 입력하세요: ");
		double p = scanner.nextDouble();

		String Array[][] = new String[n][m];

		// 지뢰를 행렬에 입력하는 코드
		for (int i = 0; i < n; i++)
			for (int j = 0; j < m; j++) {
				int a = (int) (Math.random() * 100 + 1);
				if (a < (int) (100 * p))
					Array[i][j] = "*";
				else
					Array[i][j] = "-";
			}
		
		// 행렬의 값을 출력
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++)
				System.out.print(Array[i][j]);
			System.out.println();
		}
		System.out.println();
		
		int count = 0, ii, jj;
		// 지뢰의 개수 파악
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				switch (Array[i][j]) {
				case "*":
					System.out.print("*");
					break;
				default:
					count = 0;
					for (ii = (i > 0) ? i - 1 : 0; ii <= i + 1 && ii <= n - 1; ii++) {
						for (jj = (j > 0) ? j - 1 : 0; jj <= j + 1 && jj <= m - 1; jj++)
							if (Array[ii][jj].equals("*"))
								count++;
					}
					System.out.print(count);
					break;
				}
			}
			System.out.println();
		}
		scanner.close();
	}
}