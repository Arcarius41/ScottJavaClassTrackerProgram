package school;
import util.Displayable;

public class Teacher extends Person implements Displayable {
	
	//private field
	private String subject;

	//no args constructor
	public Teacher () {}

	//constructor
    /**
     * 
     * @param fn
     * @param ln
     * @param sub
     */
	public Teacher (String fn, String ln, String sub) {
		setFirstName(fn);
		setLastName(ln);
		setSubject(sub);
	}

	//set subject
    /**
     * 
     * @param sub
     */
	public void setSubject (String sub) {
		subject = sub;
	}

	//get subject
    /**
     * 
     * @return
     */
	public String getSubject () {
		return subject;
	}

	@Override
	public String display () {
		return getFullName() + " teaches " + subject; 
	}
}