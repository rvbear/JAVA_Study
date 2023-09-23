import java.util.Scanner;

public class ArrayAccess {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int intArray[] = new int[5]; // �迭 ����

		int min = 100; // ���� ���� ���� ��
		int turn = 0; // ���� ���� ���� ���� ��ġ

		System.out.println("��� 5���� �Է��ϼ���.");
		int i = 0;
		while (i < 5) {
			int num = scanner.nextInt();
			if (num < 0 || num > 100) // �Է¹��� ���� �����̰ų� 100���� Ŭ ���
				continue; // while�� ó������ ���ư�
			intArray[i] = num; // ���� �迭�� ����
			if (intArray[i] < min) { // �迭�� �ִ� ���� min�� �ִ� ������ �۴ٸ�
				min = intArray[i]; // min���� �ٲ��ְ�
				turn = i + 1; // �迭�� (�ε��� + 1)���� ����
			}
			i++;
		}

		System.out.println("���� ���� ���� " + min + "�̸�, �� ���� " + turn + "��°�� �ֽ��ϴ�.");
		scanner.close();
	}
}