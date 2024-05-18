package school;
import java.io.Serializable;


public abstract class Person implements Serializable {
	
	//private fields
	private String firstName;
	private String lastName;

	//no args constructor
	public Person () {}

	//set first name
    /**
     * 
     * @param fn
     */
	public void setFirstName(String fn) {
		firstName = fn;
	}

	//set last name
    /**
     * 
     * @param ln
     */
	public void setLastName(String ln) {
		lastName = ln;
	}

	//get first name
    /**
     * 
     * @return
     */
	public String getFirstName() {
		return firstName;
	}

	//get last name
    /**
     * 
     * @return
     */
	public String getLastName() {
		return lastName;
	}

	//get full name
    /**
     * 
     * @return
     */
	public String getFullName() {
		return firstName + " " + lastName;
	}

}