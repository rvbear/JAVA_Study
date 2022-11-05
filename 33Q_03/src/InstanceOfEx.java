import java.util.Scanner;

class Person {
	static void print() {
		System.out.println("Person");
	}
}

class Student extends Person {
	static void print() {
		System.out.println("Student");
	}
}

class Researcher extends Person {
	static void print() {
		System.out.println("Researcher");
	}
}

class Professor extends Researcher {
	static void print() {
		System.out.println("Professor");
	}
}

public class InstanceOfEx {
	static void print(Person p) {
		if (p instanceof Person)
			Person.print();
		if (p instanceof Student)
			Student.print();
		if (p instanceof Researcher)
			Researcher.print();
		if (p instanceof Professor)
			Professor.print();
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println("1. Person");
			System.out.println("2. Student");
			System.out.println("3. Researcher");
			System.out.println("4. Professor");
			System.out.print("Your choice >> ");
			int choice = scanner.nextInt();
			switch (choice) {
			case 1:
				print(new Person());
				break;
			case 2:
				print(new Student());
				break;
			case 3:
				print(new Researcher());
				break;
			case 4:
				print(new Professor());
				break;
			default:
				System.out.println("잘못된 입력입니다.");
				scanner.close();
				return;
			}
		}
	}
}