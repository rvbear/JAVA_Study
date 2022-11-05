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
		System.out.println("������ ����, ����, ���̴� " + width + ", " + length + ", " + high + "�Դϴ�.");
	}

	public void getVolume() {
		volume = width * length * high;
		System.out.println("������ ���Ǵ� " + volume + "�Դϴ�.");
	}

	public void getArea() {
		area = 2 * ((width * length) + (width * high) + (length * high));
		System.out.println("������ �ѳ��̴� " + area + "�Դϴ�.");
	}
}