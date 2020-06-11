package actor;
/**
 * Represents an Lead or supporting actor
 * @author jaime
 *
 */

public class Actor {
	
	private String firstName;
	private String lastName;
	
	/**
	 * 
	 * @param firstName The actor's first name
	 * @param lastName The actor's second name
	 */
	public Actor(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	/**
	 * 
	 * @return first name
	 */
	public String getFirstName() {
		return firstName;
	}
	
	/**
	 * 
	 * @param firstName
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	/**
	 * 
	 * @return lastname
	 */
	public String getLastName() {
		return lastName;
	}
	
	/**
	 * 
	 * @param lastName
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	
}
