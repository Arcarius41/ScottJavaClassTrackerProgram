package school;
import util.Displayable;
import java.util.*;

public class Classroom extends Person implements Displayable {

	//private fields
	private int roomNumber;
	private Displayable teacher;
	private ArrayList<Displayable> students; 

	//no args constructor
	public Classroom () {}

	//constructor
    /**
     * 
     * @param rn
     * @param teach
     * @param s
     */
	public Classroom (int rn, Displayable teach, ArrayList<Displayable> s) {
		setRoomNumber(rn);
		setTeacher(teach);
		setStudents(s);
	}
	
	//set room number
    /**
     * 
     * @param rn
     */
	public void setRoomNumber (int rn) {
		roomNumber = rn;
	}

	//set teacher
    /**
     * 
     * @param teach
     */
	public void setTeacher (Displayable teach) {
		teacher = teach;
	}

	//set students
    /**
     * 
     * @param s
     */
	public void setStudents (ArrayList<Displayable> s) {
		students = s;
	}

	//get room number
    /**
     * 
     * @return
     */
	public int getRoomNumber () {
		return roomNumber;
	}

	//get teacher
    /**
     * 
     * @return
     */
	public Displayable getTeacher () {
		return teacher;
	}

	//get students
    /**
     * 
     * @return
     */
	public ArrayList<Displayable> getStudents () {
		return students;
	}

	@Override
	public String display () {
		return  "Room Number: " + roomNumber;
	}

}