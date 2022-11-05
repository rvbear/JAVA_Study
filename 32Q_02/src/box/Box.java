package box;
public class Box {
	private int width;
	private int length;
	private int high;
	private double volume;
	private double area;

	public Box(int width, int length, int high) {
		this.width = width;
		this.length = length;
		this.high = high;
	}

	public void Show() {
		System.out.println("상자의 가로, 세로, 높이는 " + width + ", " + length + ", " + high + "입니다.");
	}

	public void getVolume() {
		volume = width * length * high;
		System.out.println("상자의 부피는 " + volume + "입니다.");
	}

	public void getArea() {
		area = 2 * ((width * length) + (width * high) + (length * high));
		System.out.println("상자의 겉넓이는 " + area + "입니다.");
	}
}