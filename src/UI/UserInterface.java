package UI;

/*
 * This class, contains main method.
 * This class will interact with user.
 * */
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import menu.Menu;
import order.Order;
import order.Customer;

public class UserInterface {

	public static void main(String[] args) {
		// This format the time in form of HH and MM
		SimpleDateFormat parser = new SimpleDateFormat("HH:mm");

		// to get the current time of system
		Timestamp now = new Timestamp(new Date().getTime());

		// creating object of Scanner as keyboard, so it's easier to understand user is
		// giving input through System keyboard
		Scanner keyboard = new Scanner(System.in);

		System.out.println("Welcome To GS Restaurent");

		// If the time of entry is between 10am to 9pm cafe is OPEN
		if (parser.format(now).compareTo(("10:00")) > 0 && parser.format(now).compareTo(("21:00")) < 0) {
			System.out.println("-----------------------------------------");
			System.out.println("-----------------------------------------");

			Customer customer = new Customer();
			System.out.println("Welcome, I am Veronica, your assistant at Restaurent.");
			System.out.println("Veronica=> \t Would you like to see Menu?");
			System.out.print("Customer=> \t ");
			String answerToQuery = keyboard.next();
			if (responseYes(answerToQuery)) {
				Menu menu = new Menu();
				menu.displayMenu();
				processing(90000);
				// to decide what user would like to have, he/she is given a 10 second break.
				try {
					TimeUnit.SECONDS.sleep(10); //
				} catch (InterruptedException e) {
					System.out.println("sleeped for 10 seconds");
				} finally {
					System.out.println("\nVeronica=> \t Would you like to place order?");
					System.out.print("Customer=> \t ");
					answerToQuery = keyboard.next();

					// if the answer is yes, then we will proceed to collect order
					if (responseYes(answerToQuery)) {
						collectOrder(customer, keyboard, menu);
					}
					// else we will wait for 20 seconds for final time
					else {
						try {
							System.out.println("\n Veronica=> \t Okay I will collect order after few some time?");
							TimeUnit.SECONDS.sleep(20);
						} catch (InterruptedException e) {
							System.out.println("sleeped for 20 seconds");
						} finally {
							System.out.println("\n Veronica=> \t Do you wish to give order?(yes/no):");
							answerToQuery = keyboard.next();
							if (responseYes(answerToQuery)) {
								collectOrder(customer, keyboard, menu);
							} else {
								System.out.println("Oh, ?");
							}
						}

					}

				}

			} else {
				System.out.println("Oh, ?");
			}

		}
		// if shop is closed
		else

		{
			System.out.println("Shop is closed Now, come between 10am - 9pm");
		}
		System.out.println("--------------------------------------------");
		System.out.println("--------------------------------------------");
		System.out.println("GS Restaurent - BTech 2nd year java project");
		System.out.println("--------------------------------------------");
		System.out.println("--------------------------------------------");
		System.out.println("Manager:- Malay Saxena        (0801CS181037)");
		System.out.println("Chef:-    Ajinkya Taranekar   (0801CS181008)");
		System.out.println("Pesonal Assistant:- Veronica");
		System.out.println("--------------------------------------------");
		System.out.println("--------------------------------------------");
		System.out.println("Thank You.");
		System.out.println("Veronica=> Any feedback... :)");
		System.out.print("Judges=> \t");
		keyboard.next();
		System.out.println("\n--------------------------------------------");
		System.out.println("--------------------------------------------");

		keyboard.close();

	}

	static boolean responseYes(String answerToQuery) {
		if (answerToQuery.toLowerCase() == "yes" || answerToQuery.toLowerCase().charAt(0) == 'y'
				|| answerToQuery.toLowerCase() == "yes, please." || answerToQuery.toLowerCase() == "sure")
			return true;
		return false;
	}

	

	public static void processing(int time) {
		Thread t = new Thread() {
			public void run() {
				System.out.print("Processing [");
				for (int i = 0; i < 100; i+=3) {
					System.out.print("=");
					if(i==99) {
						System.out.println(">] 100% \nProcessing done");		
					}
					try {
						Thread.sleep(time/300);
					} catch (Exception e) {
					}

				}
			}
		};
		t.start();
	}

	static void collectOrder(Customer customer, Scanner keyboard, Menu menu) {
		System.out.println("Veronica=> \t May I have your name please.(Enter name)");
		// To get customer Name
		System.out.print("Customer=> \t ");
		customer.setCustomerName(keyboard.next());

		// To get customer mobile number
		System.out.println("\nVeronica=> \t Also, May I have your mobile number please.(Enter mobile number)");
		System.out.print(customer.getCustomerName() + " ji=> \t ");
		customer.setCustomerMobileNumber(keyboard.next());

		System.out.println("\nVeronica=> \t Enter Order please.");
		Random r = new Random();
		// creating a random variable for table Number
		int tableNumber = r.nextInt(10) + 1;
		System.out.println("Veronica=> \t Your Table number is " + tableNumber);

		// asking user to start its order
		System.out.println("Veronica=> \t From Main menu, what you would like to have?");
		while (true) {
			System.out.print(customer.getCustomerName() + " ji=> \t ");
			int foodItemNumber = keyboard.nextInt() - 1;
			Order.collectOrder(foodItemNumber);
			System.out.println("\nVeronica=> \t Ok," + Menu.getDishName(foodItemNumber)
					+ " added, so would you like to have more (yes/no)?");
			String answerToOrderQuery = keyboard.next();
			if (answerToOrderQuery.equalsIgnoreCase("no"))
				break;
		}

		// display bill of the user
		System.out.println("Veronica=> \t Here is your Bill.");
		int bill = Order.placeBill(customer.getCustomerName(), customer.getCustomerMobileNumber(), tableNumber);
		System.out.println("Veronica=> \t Enter Amount displayed in Bill.");

		// get the bill amount
		System.out.print("Customer=> \t ");
		int billAmount = keyboard.nextInt();

		// if bill amount is grater than actual bill, return him bill.
		if (billAmount >= bill)
			System.out.println("\nVeronica=> \t Your change is Rs. " + (billAmount - bill) + "/-");

		System.out.println("Veronica=> \t Your order is being prepared");
		processing(Order.checkPreparationTime()*10000);
		// Order now collected is being prepared so, it got stop for a particular time
		try {
			TimeUnit.SECONDS.sleep(Order.checkPreparationTime()); //
		} catch (InterruptedException e) {
			System.out.println("sleeped for " + Order.checkPreparationTime() + " seconds");
		} finally {
			// finally enjoy the meal
			System.out.println("Veronica=> \t Enjoy your meal\n\n");
			
			
		}
	}
}
