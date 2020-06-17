package main;

import java.util.Scanner;

import actor.Actor;
import director.Director;
import film.Film;

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
		Film newFilm;
		String title = "";
		Actor[] leadActors;
		int numOfLeadActors = -1;
		Actor[] supActors = new Actor[10];
		int numberOfSupActors;
		Director[] directors;
		int numOfDirs;
		int rating;

		System.out.println("New movie entry!");

		System.out.println("Enter the title of the film");

		title = sc.nextLine();

		numOfLeadActors = getNumberOfLeadActors();
		

		leadActors = new Actor[numOfLeadActors];
		for (int i = 0; i < numOfLeadActors; i++) {
			String firstName, lastName;
			Actor temp = null;
			System.out.println("Enter actor's first name");
			firstName = sc.next();
			System.out.println("Enter actor's last name");
			lastName = sc.next();
			temp = new Actor(firstName, lastName);
			leadActors[i] = temp;

		}

		System.out.println("How many supporting actors?");
		numberOfSupActors = sc.nextInt();
		supActors = new Actor[numberOfSupActors];
		for (int i = 0; i < numberOfSupActors; i++) {
			String firstName, lastName;
			Actor temp = null;
			System.out.println("Enter actor's first name");
			firstName = sc.next();
			System.out.println("Enter actor's last name");
			lastName = sc.next();
			temp = new Actor(firstName, lastName);
			supActors[i] = temp;

		}

		System.out.print("How many directors?");
		numOfDirs = sc.nextInt();
		directors = new Director[numOfDirs];
		for (int i = 0; i < numOfDirs; i++) {
			String firstName, lastName;
			Director temp = null;
			System.out.println("Enter actor's first name");
			firstName = sc.next();
			System.out.println("Enter actor's last name");
			lastName = sc.next();
			temp = new Director(firstName, lastName);
			directors[i] = temp;

		}

		System.out.println("What is your rating?");
		rating = sc.nextInt();
		newFilm = new Film(title, leadActors, supActors, directors, rating);
		System.out.println(newFilm.toString());

	}
	/**
	 * Retrieves number of actors
	 * @return
	 */
	private int getNumberOfLeadActors() {
		int numOfLeadActors = -1;
		do {
			System.out.println("How many lead actors?");
			while (!sc.hasNextInt()) {
				System.out.println("That's not a number!");
				sc.next(); // this is important!
			}
			numOfLeadActors = sc.nextInt();
		} while (numOfLeadActors <= 0);
		return numOfLeadActors;
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
			userMenuSelection = sc.nextLine();
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
