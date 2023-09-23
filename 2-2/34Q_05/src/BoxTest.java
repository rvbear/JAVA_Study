class Box<T> {
	private T item;

	public void set(T item) {
		this.item = item;
	}

	public T get() {
		return item;
	}
}

public class BoxTest {
	public static void main(String[] args) {
		Box<Integer> i = new Box<>();
		i.set(Integer.valueOf(100));
		System.out.println(i.get());

		Box<String> s = new Box<>();
		s.set("�����̳�!");
		System.out.println(s.get());
	}
}