import java.util.Scanner;

public class CheckoutApp {
	public static void main(String[] args){

		Scanner input = new Scanner(System.in);

		String[] userItems = new String[100];
		int[] itemQuantity = new int[100];
		double[] itemPrice = new double[100];
		double[] total = new double[100];

		int index = 0;

		System.out.print("Enter customer name: ");
		String customer = input.nextLine();

		while (true){

			System.out.print("Enter product name: ");
			userItems[index] = input.next();

			System.out.print("Enter Item Price: ");
			itemPrice[index] = input.nextDouble();

			System.out.print("Enter quantity: ");
			itemQuantity[index] = input.nextInt();

			total[index] = itemPrice[index] * itemQuantity[index];

			index++;

			System.out.print("Add more userItems? (yes/no): ");
			String choice = input.next();
			if (choice.equalsIgnoreCase("no")) break;

		}

		double subtotal = 0;

		for (int count = 0; count < index; count++){
		subtotal += total[count];
		}

		double discount = subtotal * 0.10;
		double vat = subtotal * 0.075;
		double billTotal = subtotal - discount + vat;


		System.out.println("\n===== RECEIPT =====");
		System.out.println("Customer name: " + customer);
		System.out.println("-------------------------");

		for (int count = 0; count < index; count++){
			System.out.println(userItems[count] + " x" + itemQuantity[count] +
				" @ " + itemPrice[count] + " = " + total[count]);
		}

		System.out.println("-------------------------");
		System.out.println("Subtotal: " + subtotal);
		System.out.println("Discount: " + discount);
		System.out.println("VAT (7.5%): " + vat);
		System.out.println("Bill Total: " + billTotal);

		System.out.print("Amount Paid: ");
		double paid = input.nextDouble();

		double balance = paid - billTotal;

		System.out.println("Balance: " + balance);
		System.out.println("==================");
		System.out.println("    THANK YOU");

	}
}
