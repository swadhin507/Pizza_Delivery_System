package bill;

public class DeluxPizza extends pizza {
	public DeluxPizza(Boolean veg) {
		super(veg);
		// super .addExtraCheese();
		// super .addExtraToppings();
	}

	public void addExtraCheese() {

		this.price += extraCheesePrice;

	}

	public void addExtraToppings() {

		this.price += extraToppingsPrice;

	}
}