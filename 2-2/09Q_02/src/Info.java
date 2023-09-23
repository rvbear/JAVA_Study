import java.util.Scanner;

public class Info {
	private int hak;
	private String name;
	private String department;
	private String hobby;

	public Info(int hak, String name, String department) {
		this(hak, name, department, "코딩");
	}

	public Info(int hak, String name, String department, String hobby) {
		this.hak = hak;
		this.name = name;
		this.department = department;
		this.hobby = hobby;
	}

	public void Show() {
		System.out.println("학번 : " + this.hak);
		System.out.println("이름 : " + this.name);
		System.out.println("학과 : " + this.department);
		System.out.println("취미 : " + this.hobby);
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("개인정보 입력 : ");
		System.out.print("취미가 없는 경우 1을 있는 경우 2를 입력해주세요 >> ");
		int choice = scanner.nextInt();

		if (choice == 1) {
			System.out.println("학번, 이름, 학과를 순서대로 개인정보를 입력해주세요.");
			int hak = scanner.nextInt();
			String name = scanner.next();
			String department = scanner.next();
			Info info = new Info(hak, name, department);
			info.Show();
		} else if (choice == 2) {
			System.out.println("학번, 이름, 학과, 취미를 순서대로 개인정보를 입력해주세요.");
			int hak = scanner.nextInt();
			String name = scanner.next();
			String department = scanner.next();
			String hobby = scanner.next();
			Info info = new Info(hak, name, department, hobby);
			info.Show();
		} else
			System.out.println("잘못된 입력입니다.");
		
		scanner.close();
	}
}