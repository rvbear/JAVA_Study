import java.util.Scanner;

public class Rock_Paper_Scissors {
	public static String input(String a) {
		Scanner scanner = new Scanner(System.in);
		System.out.print(a);
		String i = scanner.next();
		
		return i;
	}

	public static void whowin(String c, String y) {
		if ((c.equals("r") && y.equals("r")) || (c.equals("p") && y.equals("p")) || (c.equals("s") && y.equals("s")))
			System.out.println("���º�!");
		else if ((c.equals("r") && y.equals("p")) || (c.equals("p") && y.equals("s"))
				|| (c.equals("s") && y.equals("r")))
			System.out.println("����, ��!");
		else if ((c.equals("s") && y.equals("p")) || (c.equals("r") && y.equals("s"))
				|| (c.equals("p") && y.equals("r")))
			System.out.println("ö��, ��!");
		else
			System.out.println("�߸��� �Է��Դϴ�.");
	}

	public static void main(String[] args) {
		String c = input("ö�� : ");
		String y = input("���� : ");

		whowin(c, y);
	}
}