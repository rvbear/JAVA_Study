import java.util.Scanner;

class Shape {
	public Shape next;

	public Shape() {
		next = null;
	}

	public void draw() {
		System.out.println("Shape");
	}
}

class Line extends Shape {
	public void draw() {
		System.out.println("Line");
	}
}

class Rect extends Shape {
	public void draw() {
		System.out.println("Rect");
	}
}

class Circle extends Shape {
	public void draw() {
		System.out.println("Circle");
	}
}

public class UsingOverride {
	public static void Show() {
		System.out.println("1. Line");
		System.out.println("2. Circle");
		System.out.println("3. Rect");
		System.out.print("Your Choice >> ");
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Shape start, obj, last;
		int array[] = new int[4];

		for (int i = 0; i < 4; i++) {
			Show();
			array[i] = scanner.nextInt();
			if (array[i] > 3)
				i--;
		}
		if (array[0] == 1) {
			start = new Line();
			last = start;
		} else if (array[0] == 2) {
			start = new Circle();
			last = start;
		} else {
			start = new Rect();
			last = start;
		}
		for (int i = 1; i < 4; i++) {
			switch (array[i]) {
			case 1:
				obj = new Line();
				last.next = obj;
				if (i < 3)
					last = obj;
				break;
			case 2:
				obj = new Circle();
				last.next = obj;
				if (i < 3)
					last = obj;
				break;
			case 3:
				obj = new Rect();
				last.next = obj;
				if (i < 3)
					last = obj;
				break;
			}
		}
		Shape p = start;
		while (p != null) {
			p.draw();
			p = p.next;
		}
		scanner.close();
	}
}