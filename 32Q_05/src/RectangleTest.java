interface Comparable {
	int compareTo(Object otehr); // -1, 0, 1 반환
}

class Rectangle implements Comparable {
	private int width;
	private int height;

	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}

	public int compareTo(Object other) {
		Rectangle a = (Rectangle) other;
		int temp = width * height - a.height * a.width;
		if (temp > 0)
			return 1;
		else if (temp == 0)
			return 0;
		else
			return -1;
	}

	public String print() {
		return "Rectangle [ width = " + width + ", height = " + height + " ]";
	}
}

public class RectangleTest {
	public static void main(String[] args) {
		Rectangle a = new Rectangle(100, 30);
		Rectangle b = new Rectangle(200, 10);
		System.out.println(a.print());
		System.out.println(b.print());
		if (a.compareTo(b) > 0)
			System.out.println(a.print() + "가 더 큽니다.");
		else if (a.compareTo(b) == 0)
			System.out.println("두 객체의 크기는 같습니다.");
		else
			System.out.println(b.print() + "가 더 큽니다.");
	}
}