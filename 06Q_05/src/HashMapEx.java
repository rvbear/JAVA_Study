import java.util.*;

class Student {
	private int id; // 학번
	private String name; // 이름
	private int grade; // 학년
	private String department; // 전공

	public Student(int id, String name, int grade, String department) {
		this.id = id;
		this.name = name;
		this.grade = grade;
		this.department = department;
	}

	public String toString() { // @override
		return "[ 학번 : " + id + " ]\n"  
				+ "[ 이름 : " + name + " ]\n"  
				+ "[ 학년 : " + grade + " ]\n"  
				+ "[ 전공 : " + department + " ]";
	}
}

public class HashMapEx {
	public static void main(String[] args) {
		HashMap<Integer, Student> smap = new HashMap<Integer, Student>();
		// 키값은 학번, 데이터는 Student 객체
		Scanner scan = new Scanner(System.in);
		while (true) {
			System.out.println("-- 메뉴 --");
			System.out.println("1. 추가");
			System.out.println("2. 찾기");
			System.out.println("3. 삭제");
			System.out.println("4. 출력");
			System.out.println("0. 종료");
			System.out.print("선택 >> ");
			int choice = scan.nextInt();
			System.out.println();
			switch (choice) {
			case 1:
				System.out.print("학번 : ");
				int id = scan.nextInt();
				System.out.print("이름 : ");
				String name = scan.next();
				System.out.print("학년 : ");
				int grade = scan.nextInt();
				System.out.print("전공 : ");
				String department = scan.next();
				smap.put(id, new Student(id, name, grade, department));
				System.out.println("추가 성공!");
				System.out.println();
				break;
			case 2:
				System.out.print("찾으시는 학생의 학번 입력 >> ");
				id = scan.nextInt();
				if(smap.get(id) == null)
					System.out.println("해당 학번을 가진 학생을 찾을 수 없습니다.");
				else {
					Student find = smap.get(id);
					System.out.println(find);
				}
				System.out.println();
				break;
			case 3:
				System.out.print("삭제할 학생의 학번 입력 >> ");
				id = scan.nextInt();
				if(smap.get(id) == null)
					System.out.println("해당 학번을 가진 학생을 찾을 수 없습니다.");
				else {
					smap.remove(id);
					System.out.println("삭제 완료!");
				}
				System.out.println();
				break;
			case 4:
				Set<Integer> keys = smap.keySet();
				Iterator<Integer> it = keys.iterator();
				if(it.hasNext() == false) 
					System.out.println("입력된 학생이 없습니다.");
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
				System.out.println("종료되었습니다. 감사합니다.");
				scan.close();
				return;
			default:
				System.out.println("잘못된 입력입니다.");
				System.out.println();
				break;
			}
		}
	}
}