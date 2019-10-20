package UI;

import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import menu.Menu;
import order.Order;
import order.Customer;

public class UserInterface {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Welcome To GS Restaurent");
		System.out.println("---------------------------------");
		System.out.println("---------------------------------");

		System.out.println("Please enter your Choice(1-2):");
		System.out.println("1. Are you a Customer?");
		System.out.println("2. Are you a User?");

		System.out.println("---------------------------------");
		System.out.println("---------------------------------");
		int customerOruser = keyboard.nextInt();

		switch (customerOruser) {
		case 1:
			Customer customer = new Customer();
			System.out.println("Welcome, I am Veronica, your assistant at Restaurent.");
			System.out.println("Veronica=> \t Would you like to see Menu?");
			System.out.print("Customer=> \t ");
			String answerToMenuQuery = keyboard.next();
			if (answerToMenuQuery.toLowerCase() == "yes" || answerToMenuQuery.toLowerCase().charAt(0) == 'y'
					|| answerToMenuQuery.toLowerCase() == "yes, please." || answerToMenuQuery.toLowerCase() == "sure") {
				Menu menu = new Menu();
				menu.displayMenu();
				try {
					TimeUnit.SECONDS.sleep(30); //
				} catch (InterruptedException e) {
					System.out.println("sleeped for 30 seconds");
				} finally {
					System.out.println("\nVeronica=> \t Would you like to place order?");
					System.out.print("Customer=> \t ");
					String answerToOrderQuery = keyboard.next();
					if (answerToOrderQuery.toLowerCase() == "yes" || answerToOrderQuery.toLowerCase().charAt(0) == 'y'
							|| answerToOrderQuery.toLowerCase() == "yes, please."
							|| answerToOrderQuery.toLowerCase() == "sure") {
						System.out.println("Veronica=> \t May I have your name please.");
						System.out.print("Customer=> \t ");
						customer.setCustomerName(keyboard.next());

						System.out.println("\nVeronica=> \t Also, May I have your mobile number please.");
						System.out.print(customer.getCustomerName() + " ji=> \t ");
						customer.setCustomerMobileNumber(keyboard.next());

						System.out.println("\nVeronica=> \t Enter Order please.");
						Random r = new Random();
						int tableNumber = r.nextInt(10) + 1;
						System.out.println("Veronica=> \t Your Table number is " + tableNumber);

						System.out.println("Veronica=> \t From Main menu, what you would like to have?");
						while (true) {
							System.out.print(customer.getCustomerName() + " ji=> \t ");
							int foodItemNumber = keyboard.nextInt();
							Order.collectOrder(foodItemNumber);
							System.out.println("\nVeronica=> \t Ok," + menu.getDishName(foodItemNumber)
									+ " added, so would you like to have more (yes/no)?");
							answerToOrderQuery = keyboard.next();
							if (answerToOrderQuery.equalsIgnoreCase("no"))
								break;
						}
						
						System.out.println("Veronica=> \t Here is your Bill.");
						Order.placeBill();
						System.out.println("Veronica=> \t Enter Amount displayed in Bill.");
						System.out.print("Customer=> \t ");
						int billAmount = keyboard.nextInt();
						if(billAmount==Order.billAmount()) 
							System.out.println("\nVeronica=> \t Your change is" +(Order.billAmount()-billAmount));	
							
						System.out.println("Veronica=> \t Your order is being prepared");
						
						try {
							TimeUnit.SECONDS.sleep(Order.checkPreparationTime()); //
						} catch (InterruptedException e) {
							System.out.println("sleeped for "+Order.checkPreparationTime() +" seconds");
						} finally {
							
							System.out.println("Veronica=> \t Enjoy your meal");
									
						}
					}

					else {
						try {
							System.out.println("\n Veronica=> \t Okay I will collect order after few some time?");
							TimeUnit.SECONDS.sleep(42);
						} catch (InterruptedException e) {
							System.out.println("sleeped for 42 seconds");
						} finally {
							System.out.println("\n Veronica=> \t Do you wish to give order?(yes/no):");
							answerToOrderQuery = keyboard.next();
							if (answerToOrderQuery.toLowerCase() == "yes"
									|| answerToOrderQuery.toLowerCase().charAt(0) == 'y'
									|| answerToOrderQuery.toLowerCase() == "yes, please."
									|| answerToOrderQuery.toLowerCase() == "sure") {
								System.out.println("\nVeronica=> \t Enter Order please.");

								System.out.println("\nVeronica=> \t From Main menu, what you would like to have?");

							} else {
								break;
							}
						}

					}

				}

			} else {
				System.out.println("Oh, ?");
				break;
			}
			break;
		case 2:
			System.out.println("Welcome, I am Veronica, your assistant at Restaurent.");
			System.out.println("Veronica=> \t Confirm your presence user by entering username");
			System.out.print("User=> \t");
			String userName = keyboard.next(); // enter admin
			System.out.println("\nVeronica=> \t ok," + userName + " Enter your password.");
			System.out.print("Boss => \t"); // enter admin
			String userPassword = keyboard.next();
			if (userName.equalsIgnoreCase("admin") && userPassword.equalsIgnoreCase("admin")) {
				System.out.println("Veronica=> \t Welcome Boss");
				System.out.println("Veronica=> \t What would you like to do?");
				System.out.println("Veronica=> \t 1. Update FoodItem in Menu.");
				System.out.println("Veronica=> \t 2. Update Raw Materials");
				System.out.println("Veronica=> \t Enter your choice(1-2)");
				System.out.print("Boss => \t");
				int updateQuery = keyboard.nextInt();
				switch (updateQuery) {
				case 1:
					break;
				case 2:
					break;
				}

			} else {
				System.out.println("Veronica=> \t Don't be snoopy, else I'll call for security.");
			}
			break;
		default:
			System.out.println("Pls. enter either (1/2):");
			break;
		}
		keyboard.close();
	}

}
