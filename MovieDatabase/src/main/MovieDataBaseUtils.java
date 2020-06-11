package main;

import java.util.Scanner;

public class MovieDataBaseUtils {
	// scanner
	static Scanner sc = new Scanner(System.in);

	/**
	 * Prints startup Message
	 */
	public void programStart() {
		String menuSeleciton;

		System.out.println("Welcome to MovieDataBase");
		System.out.println("Menu\n" + "1. New Movie\n" + "2. Search Movies");

		menuSeleciton = getUserMenuSelection();

		menuWiz(menuSeleciton);

	}

	/**
	 * Runs appropriate method based off of user menu selection
	 * 
	 * @param menuSeleciton user's menu selection
	 */
	private void menuWiz(String menuSeleciton) {

		if (menuSeleciton.equals("1")) {
			newMovieCreation();
		}
	}

	private void newMovieCreation() {
		System.out.println("woot");

	}

	/**
	 * Returns users menu selection
	 * 
	 * @return userMenuSelection
	 */
	private String getUserMenuSelection() {
		String userMenuSelection = new String();

		boolean validEntry = false;

		while (!validEntry) {
			userMenuSelection = sc.next();
			switch (userMenuSelection) {
			case "1":
				validEntry = true;
				break;
			case "2":
				validEntry = true;
				break;

			default:
				System.out.println("Please enter valid selection");

			}
		}
		return userMenuSelection;
	}
}
