import java.util.Scanner;

class MemberManager {
	private int index = 0;
	Scanner scanner = new Scanner(System.in);
	Member m[] = new Member[50];

	public MemberManager() {
	}

	public void addMentor() {
		System.out.print("�й� : ");
		int hak = scanner.nextInt();
		System.out.print("�̸� : ");
		String name = scanner.next();
		System.out.print("ȸ�� : ");
		String org = scanner.next();
		int id = index + 1;
		if (index < 50) {
			m[index++] = new Mentor(id, hak, name, org);
			System.out.println("�߰� ����!");
		} else
			System.out.println("�߰� ����..");
	}

	public void addMentee() {
		System.out.print("�й� : ");
		int hak = scanner.nextInt();
		System.out.print("�̸� : ");
		String name = scanner.next();
		System.out.print("���� : ");
		String major = scanner.next();
		int id = index + 1;
		if (index < 50) {
			m[index++] = new Mentee(id, hak, name, major);
			System.out.println("�߰� ����!");
		} else
			System.out.println("�߰� ����..");
	}

	public void ShowofMentor() {
		for (int i = 0; i < index; i++)
			if (m[i] instanceof Mentor)
				m[i].Show();
	}

	public void ShowofMentee() {
		for (int i = 0; i < index; i++)
			if (m[i] instanceof Mentee)
				m[i].Show();
	}

	public void Show() {
		for (int i = 0; i < index; i++)
			m[i].Show();
	}
}