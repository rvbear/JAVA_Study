import java.util.Scanner;

public class FindMiddlenumber {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("정수 3개 입력>>");
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		int num3 = scanner.nextInt();
		
		if(num1>=num2&&num1<=num3)			// 2 < 1 < 3
			System.out.println("중간 값은 "+num1);
		else if(num1>=num3&&num1<=num2)		// 3 < 1 < 2
			System.out.println("중간 값은 "+num1);
		else if(num2>=num1&&num2<=num3)		// 1 < 2 < 3
			System.out.println("중간 값은 "+num2);
		else if(num2>=num3&&num2<=num1)		// 3 < 2 < 1
			System.out.println("중간 값은 "+num2);
		else if(num3>=num1&&num3<=num2)		// 1 < 3 < 2
			System.out.println("중간 값은 "+num3);
		else								// 2 < 3 < 1
			System.out.println("중간 값은 "+num3);
		
		scanner.close();
	}
}