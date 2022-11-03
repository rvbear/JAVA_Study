import java.util.Scanner;

class MemberManager {
	private int index = 0;
	Scanner scanner = new Scanner(System.in);
	Member m[] = new Member[50];

	public MemberManager() {
	}

	public void addMentor() {
		System.out.print("학번 : ");
		int hak = scanner.nextInt();
		System.out.print("이름 : ");
		String name = scanner.next();
		System.out.print("회사 : ");
		String org = scanner.next();
		int id = index + 1;
		if (index < 50) {
			m[index++] = new Mentor(id, hak, name, org);
			System.out.println("추가 성공!");
		} else
			System.out.println("추가 실패..");
	}

	public void addMentee() {
		System.out.print("학번 : ");
		int hak = scanner.nextInt();
		System.out.print("이름 : ");
		String name = scanner.next();
		System.out.print("전공 : ");
		String major = scanner.next();
		int id = index + 1;
		if (index < 50) {
			m[index++] = new Mentee(id, hak, name, major);
			System.out.println("추가 성공!");
		} else
			System.out.println("추가 실패..");
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