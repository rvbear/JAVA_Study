import java.util.*;

class GStack<T> {
	int tos;
	Object[] stck;

	public GStack() {
		tos = 0;
		stck = new Object[5]; // 배열의 크기를 5로 수정
	}

	public boolean isFull(int tos) { // isFull 메소드 정의
		return tos == 5;
	}

	public boolean isEmpty(int tos) { // isEmpty 메소드 정의
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

		while (stringStack.isFull(stringStack.tos) == false) { // 스택이 full일 경우
			System.out.print("입력 >> ");
			String word = scan.next();
			// 사용자가 exit 입력했을 경우
			if (word.equals("exit"))
				break;
			stringStack.push(word);
		}

		// 입력된 역순으로 출력
		while (stringStack.isEmpty(stringStack.tos) == false)
			System.out.println(stringStack.pop());

		scan.close();
	}
}