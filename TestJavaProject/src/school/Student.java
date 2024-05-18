package school;
import util.Displayable;

public class Student extends Person implements Displayable {
	
	//private fields
	private int studentId;
	private int finalGrade;

	//no args constructor
	public Student () {}

	//constructor
    /**
     * 
     * @param fn
     * @param ln
     * @param id
     * @param grade
     */
	public Student (String fn, String ln, int id, int grade) {
		setFirstName(fn);
		setLastName(ln);
		setStudentID(id);
		setFinalGrade(grade);
	}

	//set student ID
    /**
     * 
     * @param sId
     */
	public void setStudentID (int sId) {
		studentId = sId;
	}

	//set final grade
    /**
     * 
     * @param fg
     */
	public void setFinalGrade (int fg) {
		finalGrade = fg;
	}

	//get student ID
    /**
     * 
     * @return
     */
	public int getStudentID () {
		return studentId;
	}

	//get final grade
    /**
     * 
     * @return
     */
	public int getFinalGrade () {
		return finalGrade;
	}

	@Override
	public String display () {
		return "Student ID: " + studentId + " 	" + getFullName() 
			+ " 	Final Grade: " + finalGrade;
	}
}