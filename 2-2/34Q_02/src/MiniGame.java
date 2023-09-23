import java.util.Scanner;

public class MiniGame {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("n���� �Է��ϼ���: ");
		int n = scanner.nextInt();
		System.out.print("m���� �Է��ϼ���: ");
		int m = scanner.nextInt();
		System.out.print("p���� �Է��ϼ���: ");
		double p = scanner.nextDouble();

		String Array[][] = new String[n][m];

		// ���ڸ� ��Ŀ� �Է��ϴ� �ڵ�
		for (int i = 0; i < n; i++)
			for (int j = 0; j < m; j++) {
				int a = (int) (Math.random() * 100 + 1);
				if (a < (int) (100 * p))
					Array[i][j] = "*";
				else
					Array[i][j] = "-";
			}
		
		// ����� ���� ���
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++)
				System.out.print(Array[i][j]);
			System.out.println();
		}
		System.out.println();
		
		int count = 0, ii, jj;
		// ������ ���� �ľ�
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