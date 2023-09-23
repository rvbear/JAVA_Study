import java.util.Scanner;

public class ArrayAccess {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int intArray[] = new int[5]; // 배열 생성

		int min = 100; // 현재 가장 작은 수
		int turn = 0; // 현재 가장 작은 수의 위치

		System.out.println("양수 5개를 입력하세요.");
		int i = 0;
		while (i < 5) {
			int num = scanner.nextInt();
			if (num < 0 || num > 100) // 입력받은 값이 음수이거나 100보다 클 경우
				continue; // while문 처음으로 돌아감
			intArray[i] = num; // 값을 배열에 저장
			if (intArray[i] < min) { // 배열에 있는 값이 min에 있는 값보다 작다면
				min = intArray[i]; // min값을 바꿔주고
				turn = i + 1; // 배열의 (인덱스 + 1)값을 저장
			}
			i++;
		}

		System.out.println("가장 작은 수는 " + min + "이며, 그 값은 " + turn + "번째에 있습니다.");
		scanner.close();
	}
}