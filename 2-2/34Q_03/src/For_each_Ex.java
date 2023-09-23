class Person {
	private String name;
	private int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String show() {
		return ("���[�̸� : " + name + ", ���� : " + age + "]");
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
}

class Student extends Person {
	protected int id;

	public Student(String name, int age, int id) {
		super(name, age);
		this.id = id;
	}

	public String show() {
		return ("�л�[�̸� : " + getName() + ", ���� : " + getAge() + ", �й� : " + id + "]");
	}
}

class ForeignStudent extends Student {
	protected String nationality;

	public ForeignStudent(String name, int age, int id, String nationality) {
		super(name, age, id);
		this.nationality = nationality;
	}

	public String show() {
		return ("�ܱ��л�[�̸� : " + getName() + ", ���� : " + getAge() 
					+ ", �й� : " + id + ", ���� : " + nationality + "]");
	}
}

public class For_each_Ex {
	public static void main(String[] args) {
		Person p[] = new Person[3];
		p[0] = new Person("�浿��", 22);
		p[1] = new Student("Ȳ����", 23, 100);
		p[2] = new ForeignStudent("Amy", 30, 200, "U.S.A");

		String[] a = { p[0].show(), p[1].show(), p[2].show() };
		for (String show : a)
			System.out.println(show);
	}
}