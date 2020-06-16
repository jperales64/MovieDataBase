package film;

import actor.Actor;
import director.Director;

public class Film {
	private String title;
	private Actor[] leadActors;
	private Actor[] supActors;
	private Director[] directors;
	private int rating;
	
	public Film(String title, Actor[] leadActors, Actor[] supActors, Director[] directors, int rating) {
	
		this.title = title;
		this.leadActors = leadActors;
		this.supActors = supActors;
		this.directors = directors;
		this.rating = rating;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Actor[] getLeadActors() {
		return leadActors;
	}

	public void setLeadActors(Actor[] leadActors) {
		this.leadActors = leadActors;
	}

	public Actor[] getSupActors() {
		return supActors;
	}

	public void setSupActors(Actor[] supActors) {
		this.supActors = supActors;
	}

	public Director[] getDirectors() {
		return directors;
	}

	public void setDirectors(Director[] directors) {
		this.directors = directors;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}
	
	public String toString() { 
		
		String leadActorsStr = ""; 
		for(int i = 0; i < leadActors.length; i ++) leadActorsStr +=(leadActors[i].toString() + " ");
		
		String supActorStr = ""; 
		for(int i = 0; i < supActors.length; i ++) supActorStr +=(supActors[i].toString() + " ");
		
		String directorStr = ""; 
		for(int i = 0; i < directors.length; i ++) directorStr +=(directors[i].toString() + " ");
		
		String str = "Title: " + title + "\nLead Actors: " + leadActorsStr + "\nSupporting Actors: " + supActorStr+ "\nDiretors: " + directorStr + "\nRating: " + Integer.toString(rating);
		
		
		
		return str;
		
	}
	
	
}
