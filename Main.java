package bill;

import java.util.Scanner;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		System.out
				.println("--------------------------------Welcome to Pizzamania----------------------------------\n");
		System.out.println("Which Pizza: (1.Veg Pizza   2.Non-Veg Pizza  3.Delux Pizza   4.Delux Non-Veg Pizza)====>");
		Scanner sc = new Scanner(System.in);
		int ch = sc.nextInt();

		switch (ch) {
		case 1:
			pizza vegPizza = new pizza(true);
			vegPizza.addExtraToppings();
			vegPizza.addExtraCheese();
			vegPizza.getBill();
			break;
		case 2:
			pizza nonvegPizza = new pizza(false);
			nonvegPizza.addExtraToppings();
			nonvegPizza.addExtraCheese();
			nonvegPizza.takeAway();
			nonvegPizza.getBill();
			break;

		case 3:
			DeluxPizza veg = new DeluxPizza(true);
			veg.basePizzaPrice = 550;
			veg.addExtraToppings();
			veg.addExtraCheese();
			veg.takeAway();
			veg.getBill();
			break;
		case 4:
			DeluxPizza nonveg = new DeluxPizza(false);
			nonveg.basePizzaPrice = 650;
			nonveg.addExtraToppings();
			nonveg.addExtraCheese();
			nonveg.takeAway();
			nonveg.getBill();
			break;

		default:
			System.out.println("Sorry Enter again !!");
			return;

		}

		sc.close();

	}

}
