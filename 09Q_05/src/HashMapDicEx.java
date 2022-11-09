import java.util.*;

public class HashMapDicEx {
	public static void main(String[] args) {
		// ���� �ܾ�� �ѱ� �ܾ��� ���� �����ϴ� HashMap �÷��� ����
		HashMap<String, String> dic = new HashMap<String, String>();

		Scanner scanner = new Scanner(System.in);

		// 3���� (key, value) ���� dic�� ����
		for (int i = 0; i < 3; i++) {
			System.out.print("���� �ܾ� �Է� >> ");
			String E_word = scanner.next();
			String kor = dic.get(E_word);
			if (kor == null) {
				System.out.print("�ѱ� �ܾ� �Է� >> ");
				String K_word = scanner.next();
				dic.put(E_word, K_word);
				System.out.println("�߰� ����!");
			} else {
				System.out.println("�̹� �ִ� �ܾ��Դϴ�.");
				i--;
			}
		}

		// ���� �ܾ �Է¹ް� �ѱ� �ܾ� �˻�. "exit" �Է¹����� ����
		while (true) {
			System.out.print("ã�� ���� �ܾ��? ");
			String eng = scanner.next();
			if (eng.equals("exit")) {
				System.out.println("�����մϴ�...");
				break;
			}
			// �ؽøʿ��� 'Ű' eng�� '��' kor �˻�
			String kor = dic.get(eng);
			if (kor == null)
				System.out.println(eng + "�� ���� �ܾ��Դϴ�.");
			else
				System.out.println(kor);
		}
		scanner.close();
	}
}