import java.util.*;

class GStack<T> {
	int tos;
	Object[] stck;

	public GStack() {
		tos = 0;
		stck = new Object[5]; // �迭�� ũ�⸦ 5�� ����
	}

	public boolean isFull(int tos) { // isFull �޼ҵ� ����
		return tos == 5;
	}

	public boolean isEmpty(int tos) { // isEmpty �޼ҵ� ����
		return tos == 0;
	}

	public void push(T item) {
		if (isFull(tos))
			return;
		else
			stck[tos++] = item;
	}

	public T pop() {
		if (isEmpty(tos))
			return null;
		return (T)stck[--tos];
	}
}

public class MyStack {
	public static void main(String[] args) {
		GStack<String> stringStack = new GStack<String>();
		Scanner scan = new Scanner(System.in);

		while (stringStack.isFull(stringStack.tos) == false) { // ������ full�� ���
			System.out.print("�Է� >> ");
			String word = scan.next();
			// ����ڰ� exit �Է����� ���
			if (word.equals("exit"))
				break;
			stringStack.push(word);
		}

		// �Էµ� �������� ���
		while (stringStack.isEmpty(stringStack.tos) == false)
			System.out.println(stringStack.pop());

		scan.close();
	}
}