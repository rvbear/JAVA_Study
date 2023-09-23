class Pizza {
	int radius;
	String toppings;

	public Pizza() {
		this(10, "페퍼로니");
	}

	public Pizza(int inch) {
		this(inch, "치즈");
	}

	public Pizza(int radius, String toppings) {
		this.radius = radius;
		this.toppings = toppings;
	}

	public Pizza whoLargest(Pizza obj1, Pizza obj2) {
		if (obj1.radius > obj2.radius)
			return obj1;
		return obj2;
	}
}

public class PizzaTestAll {
	public static void main(String[] args) {
		Pizza obj1 = new Pizza();
		Pizza obj2 = new Pizza(14);
		Pizza obj3 = new Pizza(18, "포테이토");

		Pizza largest = obj1.whoLargest(obj1, obj2);
		System.out.println(largest.radius + "인치 크기의 " + largest.toppings + "피자가 더 크다");

		largest = obj1.whoLargest(obj2, obj3);
		System.out.println(largest.radius + "인치 크기의 " + largest.toppings + "피자가 더 크다");
	}
}