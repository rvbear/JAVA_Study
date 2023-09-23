import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		MemberManager mmg = new MemberManager();
		
		while(true) {
			System.out.println("< 메 뉴 >");
			System.out.println("1. 멘티 추가");
			System.out.println("2. 멘토 추가");			
			System.out.println("3. 멘티 목록 출력");			
			System.out.println("4. 멘토 목록 출력");			
			System.out.println("5. 전체 목록 출력");			
			System.out.println("9. 종료");			
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
				System.out.println("종료되었습니다.");
				return;
			default:
				System.out.println("잘못된 입력입니다.");
			}
		}
	}
}