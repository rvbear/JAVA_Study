import java.util.Scanner;

public class Info {
	private int hak;
	private String name;
	private String department;
	private String hobby;

	public Info(int hak, String name, String department) {
		this(hak, name, department, "�ڵ�");
	}

	public Info(int hak, String name, String department, String hobby) {
		this.hak = hak;
		this.name = name;
		this.department = department;
		this.hobby = hobby;
	}

	public void Show() {
		System.out.println("�й� : " + this.hak);
		System.out.println("�̸� : " + this.name);
		System.out.println("�а� : " + this.department);
		System.out.println("��� : " + this.hobby);
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("�������� �Է� : ");
		System.out.print("��̰� ���� ��� 1�� �ִ� ��� 2�� �Է����ּ��� >> ");
		int choice = scanner.nextInt();

		if (choice == 1) {
			System.out.println("�й�, �̸�, �а��� ������� ���������� �Է����ּ���.");
			int hak = scanner.nextInt();
			String name = scanner.next();
			String department = scanner.next();
			Info info = new Info(hak, name, department);
			info.Show();
		} else if (choice == 2) {
			System.out.println("�й�, �̸�, �а�, ��̸� ������� ���������� �Է����ּ���.");
			int hak = scanner.nextInt();
			String name = scanner.next();
			String department = scanner.next();
			String hobby = scanner.next();
			Info info = new Info(hak, name, department, hobby);
			info.Show();
		} else
			System.out.println("�߸��� �Է��Դϴ�.");
		
		scanner.close();
	}
}