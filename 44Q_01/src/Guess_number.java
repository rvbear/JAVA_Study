import java.util.Scanner;

public class Guess_number {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int i = (int)(Math.random()*100+1);
		int count = 0;
		while(true) {
			System.out.print("������ �����Ͽ� ���ÿ�: ");
			int find = scanner.nextInt();
			count++;
			if(i == find) {
				System.out.println("�����մϴ�. �õ�Ƚ��="+count);
				scanner.close();
				return;
			}
			else if(i < find)
				System.out.println("������ ������ �����ϴ�.");
			else
				System.out.println("������ ������ �����ϴ�.");
		}
	}
}