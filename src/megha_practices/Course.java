package megha_practices;

import java.util.Comparator;


public class Course  {

	int couresId;
	String courseName;
	String studentName;
	/**
	 * @param couresId
	 * @param courseName
	 * @param studentName
	 */
	public Course(int couresId, String courseName, String studentName) {
		super();
		this.couresId = couresId;
		this.courseName = courseName;
		this.studentName = studentName;
	}
	/**
	 * @return the couresId
	 */
	public int getCouresId() {
		return couresId;
	}
	/**
	 * @return the courseName
	 */
	public String getCourseName() {
		return courseName;
	}
	/**
	 * @return the studentName
	 */
	public String getStudentName() {
		return studentName;
	}
	@Override
	public String toString() {
		return "Course [couresId=" + couresId + ", courseName=" + courseName + ", studentName=" + studentName + "]";
	}
	
	
	
	/*public int compareTo(Course o) {
		System.out.println("from compareTo Method");
		return this.studentName.compareTo(o.studentName);

	}*/
}
