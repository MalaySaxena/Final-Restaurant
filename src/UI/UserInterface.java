package UI;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;


import menu.Menu;

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
			System.out.println("Welcome, I am Veronica, your assistant at Restaurent.");
			System.out.println("Veronica=> \t Would you like to see Menu?");
			System.out.print("Customer=> \t ");
			String answerToMenuQuery = keyboard.next();
			if (answerToMenuQuery.toLowerCase() == "yes" || answerToMenuQuery.toLowerCase().charAt(0) == 'y'
					|| answerToMenuQuery.toLowerCase() == "yes, please." || answerToMenuQuery.toLowerCase() == "sure") {
				Menu menu = new Menu();
				menu.displayMenu();
				try {
					TimeUnit.SECONDS.sleep(42);
				} catch (InterruptedException e) {
					System.out.println("sleeped for 42 seconds");
				} finally {
					System.out.println("\nVeronica=> \t Would you like to place order?");
					System.out.print("Customer=> \t ");
					String answerToOrderQuery = keyboard.next();
					if (answerToOrderQuery.toLowerCase() == "yes" || answerToOrderQuery.toLowerCase().charAt(0) == 'y'
							|| answerToOrderQuery.toLowerCase() == "yes, please."
							|| answerToOrderQuery.toLowerCase() == "sure") {
						System.out.println("\nVeronica=> \t Enter Order please.");
						
						System.out.println("\nVeronica=> \t From Main menu, what you would like to have?");
						
						
						
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
							if (answerToOrderQuery.toLowerCase() == "yes" || answerToOrderQuery.toLowerCase().charAt(0) == 'y'
									|| answerToOrderQuery.toLowerCase() == "yes, please."
									|| answerToOrderQuery.toLowerCase() == "sure") {
								System.out.println("\nVeronica=> \t Enter Order please.");
								
								System.out.println("\nVeronica=> \t From Main menu, what you would like to have?");
								
								
								
							}
							else {
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
			break;
		default:
			System.out.println("Pls. enter either (1/2):");
			break;
		}
		keyboard.close();
	}

}
