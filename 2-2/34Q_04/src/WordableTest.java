interface Wordable{
	void word();
}

public class WordableTest {
	public static void main(String[] args) {
		Wordable[] m = {
				() -> System.out.println("����"),
				() -> System.out.println("����"),
				() -> System.out.println("�ٸ�"),
				() -> System.out.println("����")
		};
		
		
		for(Wordable s : m)
				s.word();
	}
}