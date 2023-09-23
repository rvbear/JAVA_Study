package main;
import box.Box;

public class Main {
	public static void main(String[] args) {
		Box bb = new Box(20, 20, 30);

		bb.Show();
		bb.getVolume();
		bb.getArea();
	}
}