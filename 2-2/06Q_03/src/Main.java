import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		MemberManager mmg = new MemberManager();
		
		while(true) {
			System.out.println("< �� �� >");
			System.out.println("1. ��Ƽ �߰�");
			System.out.println("2. ���� �߰�");			
			System.out.println("3. ��Ƽ ��� ���");			
			System.out.println("4. ���� ��� ���");			
			System.out.println("5. ��ü ��� ���");			
			System.out.println("9. ����");			
			System.out.print("Your choice >> ");
			int choice = scanner.nextInt();
			switch(choice) {
			case 1:
				mmg.addMentee();
				break;
			case 2:
				mmg.addMentor();
				break;
			case 3:
				mmg.ShowofMentee();
				break;
			case 4:
				mmg.ShowofMentor();
				break;
			case 5:
				mmg.Show();
				break;
			case 9:
				scanner.close();
				System.out.println("����Ǿ����ϴ�.");
				return;
			default:
				System.out.println("�߸��� �Է��Դϴ�.");
			}
		}
	}
}