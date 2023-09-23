import java.util.*;

class Student {
	private int id; // �й�
	private String name; // �̸�
	private int grade; // �г�
	private String department; // ����

	public Student(int id, String name, int grade, String department) {
		this.id = id;
		this.name = name;
		this.grade = grade;
		this.department = department;
	}

	public String toString() { // @override
		return "[ �й� : " + id + " ]\n"  
				+ "[ �̸� : " + name + " ]\n"  
				+ "[ �г� : " + grade + " ]\n"  
				+ "[ ���� : " + department + " ]";
	}
}

public class HashMapEx {
	public static void main(String[] args) {
		HashMap<Integer, Student> smap = new HashMap<Integer, Student>();
		// Ű���� �й�, �����ʹ� Student ��ü
		Scanner scan = new Scanner(System.in);
		while (true) {
			System.out.println("-- �޴� --");
			System.out.println("1. �߰�");
			System.out.println("2. ã��");
			System.out.println("3. ����");
			System.out.println("4. ���");
			System.out.println("0. ����");
			System.out.print("���� >> ");
			int choice = scan.nextInt();
			System.out.println();
			switch (choice) {
			case 1:
				System.out.print("�й� : ");
				int id = scan.nextInt();
				System.out.print("�̸� : ");
				String name = scan.next();
				System.out.print("�г� : ");
				int grade = scan.nextInt();
				System.out.print("���� : ");
				String department = scan.next();
				smap.put(id, new Student(id, name, grade, department));
				System.out.println("�߰� ����!");
				System.out.println();
				break;
			case 2:
				System.out.print("ã���ô� �л��� �й� �Է� >> ");
				id = scan.nextInt();
				if(smap.get(id) == null)
					System.out.println("�ش� �й��� ���� �л��� ã�� �� �����ϴ�.");
				else {
					Student find = smap.get(id);
					System.out.println(find);
				}
				System.out.println();
				break;
			case 3:
				System.out.print("������ �л��� �й� �Է� >> ");
				id = scan.nextInt();
				if(smap.get(id) == null)
					System.out.println("�ش� �й��� ���� �л��� ã�� �� �����ϴ�.");
				else {
					smap.remove(id);
					System.out.println("���� �Ϸ�!");
				}
				System.out.println();
				break;
			case 4:
				Set<Integer> keys = smap.keySet();
				Iterator<Integer> it = keys.iterator();
				if(it.hasNext() == false) 
					System.out.println("�Էµ� �л��� �����ϴ�.");
				else {
					while (it.hasNext()) {
						id = it.next();
						Student find = smap.get(id);
						System.out.println("==================");
						System.out.println(find);
						System.out.println("==================");
					}
				}
				System.out.println();
				break;
			case 0:
				System.out.println("����Ǿ����ϴ�. �����մϴ�.");
				scan.close();
				return;
			default:
				System.out.println("�߸��� �Է��Դϴ�.");
				System.out.println();
				break;
			}
		}
	}
}