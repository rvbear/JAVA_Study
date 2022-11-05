import java.util.Scanner;

public class FindBomb2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt(); // ��
		int m = in.nextInt(); // ��
		double p = in.nextDouble(); // Ȯ��
		String[][] Bomb = new String[n][m]; // ���� ���� ����
		for (int i = 0; i < n; i++)
			for (int j = 0; j < m; j++) {
				int a = (int) (Math.random() * 100 + 1);
				if (a < 100 * p)
					Bomb[i][j] = "*";
				else
					Bomb[i][j] = "_";
			}
			
		// ���� ���� ���� ���
		for (int i = 0; i < n; i++)
			for (int j = 0; j < m; j++)
				System.out.print(Bomb[i][j]);
			System.out.println();
			
		// �ֺ� ���� ���
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				int count = 0;
				if (Bomb[i][j].equals("*")) {
					System.out.print("*");
				} else {
					if (i == 0 && j == 0) { // ù��° ��� ù��° ���� ������ ����
						for (int ii = 0; ii <= i + 1 && ii <= n - 1; ii++)
							for (int jj = 0; jj <= j + 1 && jj <= m - 1; jj++)
								if (Bomb[ii][jj].equals("*"))
									count++;
					} else if (i == 0 && j > 0) { // ù��° ��
						for (int ii = 0; ii <= i + 1 && ii <= n - 1; ii++)
							for (int jj = j - 1; jj <= j + 1 && jj <= m - 1; jj++)
								if (Bomb[ii][jj].equals("*"))
									count++;
					} else if (i > 0 && j == 0) { // ù��° ��
						for (int ii = i - 1; ii <= i + 1 && ii <= n - 1; ii++)
							for (int jj = 0; jj <= j + 1 && jj <= m - 1; jj++)
								if (Bomb[ii][jj].equals("*"))
									count++;
					} else { // ������
						for (int ii = i - 1; ii <= i + 1 && ii <= n - 1; ii++)
							for (int jj = j - 1; jj <= j + 1 && jj <= m - 1; jj++)
								if (Bomb[ii][jj].equals("*"))
									count++;
					}
					System.out.print(count);
				}
			}
			System.out.println();
		}
		in.close();
	}
}