import java.util.ArrayList;

class Pizza {
	String topping;
	int price;
	static int count = 0;

	public Pizza(String topping, int price) {
		this.topping = topping;
		this.price = price;
	}

	public void ShowInfo() {
		System.out.println(topping + "의 가격은 " + price + "원 입니다");
	}
}

public class PizzaTest2 {
	public static void main(String[] args) {
		ArrayList<Pizza> list = new ArrayList<>();
		list.add(new Pizza("Super Supreme", 10000));
		list.add(new Pizza("Cheese", 12000));
		list.add(new Pizza("Pepperoni", 14000));
		list.add(new Pizza("Pepperoni Delux", 16000));
		list.add(new Pizza("Chesse Delux", 16000));

		for (int i = 0; i < list.size(); i++)
			list.get(i).ShowInfo();
	}
}