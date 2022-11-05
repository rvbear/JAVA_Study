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
			System.out.println("¹«½ÂºÎ!");
		else if ((c.equals("r") && y.equals("p")) || (c.equals("p") && y.equals("s"))
				|| (c.equals("s") && y.equals("r")))
			System.out.println("¿µÈñ, ½Â!");
		else if ((c.equals("s") && y.equals("p")) || (c.equals("r") && y.equals("s"))
				|| (c.equals("p") && y.equals("r")))
			System.out.println("Ã¶¼ö, ½Â!");
		else
			System.out.println("Àß¸øµÈ ÀÔ·ÂÀÔ´Ï´Ù.");
	}

	public static void main(String[] args) {
		String c = input("Ã¶¼ö : ");
		String y = input("¿µÈñ : ");

		whowin(c, y);
	}
}