import java.util.*;

public class HashMapDicEx {
	public static void main(String[] args) {
		// 영어 단어와 한글 단어의 쌍을 저장하는 HashMap 컬렉션 생성
		HashMap<String, String> dic = new HashMap<String, String>();

		Scanner scanner = new Scanner(System.in);

		// 3개의 (key, value) 쌍을 dic에 저장
		for (int i = 0; i < 3; i++) {
			System.out.print("영어 단어 입력 >> ");
			String E_word = scanner.next();
			String kor = dic.get(E_word);
			if (kor == null) {
				System.out.print("한글 단어 입력 >> ");
				String K_word = scanner.next();
				dic.put(E_word, K_word);
				System.out.println("추가 성공!");
			} else {
				System.out.println("이미 있는 단어입니다.");
				i--;
			}
		}

		// 영어 단어를 입력받고 한글 단어 검색. "exit" 입력받으면 종료
		while (true) {
			System.out.print("찾고 싶은 단어는? ");
			String eng = scanner.next();
			if (eng.equals("exit")) {
				System.out.println("종료합니다...");
				break;
			}
			// 해시맵에서 '키' eng의 '값' kor 검색
			String kor = dic.get(eng);
			if (kor == null)
				System.out.println(eng + "는 없는 단어입니다.");
			else
				System.out.println(kor);
		}
		scanner.close();
	}
}