package assignment1;

import java.util.Scanner;

public class pizza_shop {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1. Cheese Burst Pizza 2.Farmhouse 3. Garlic Bread 4. Coke 5.Exit");

		int sum = 0, amount, ch;
		do {
			int qty;
			System.out.println("******************");
			System.out.println("Enter choice:");
			ch = sc.nextInt();

			switch (ch) {
			case 1:
				System.out.println("Order for Cheese Burst Pizza:: Price:250Rs");
				System.out.println("Enter Quantity?");
				qty = sc.nextInt();
				amount = qty * 250;
				System.out.println("Amount="+amount);
				System.out.println("Bill::"+(sum += amount));
				break;
			case 2:
				System.out.println("Order for Farmhouse pizza:: Price:150Rs");
				System.out.println("Enter Quantity?");
				qty = sc.nextInt();
				amount = qty * 150;
				System.out.println("Amount="+amount);
				System.out.println("Bill::"+(sum += amount));
				break;
			case 3:
				System.out.println("Order for Garlic bread:: Price:50Rs");
				System.out.println("Enter Quantity?");
				qty = sc.nextInt();
				amount = qty * 50;
				System.out.println("Amount="+amount);
				System.out.println("Bill::"+(sum += amount));
				break;
			case 4:
				System.out.println("Order for coke:: Price:25Rs ");
				System.out.println("Enter Quantity?");
				qty = sc.nextInt();
				amount = qty * 25;
				System.out.println("Amount="+amount);
				System.out.println("Bill::"+(sum += amount));
				break;
			case 5:
				System.out.println("Thank you! Visit again!! ");
				break;
			default:
				System.out.println("Please select choice from menu!");

			}

		} while (ch != 5);

	}

}