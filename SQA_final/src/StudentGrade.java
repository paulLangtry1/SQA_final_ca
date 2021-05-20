import java.util.HashMap;

public class StudentGrade 
{
	String Studentname;
	HashMap<String,Integer> grade = new HashMap();
	
	public StudentGrade(String studentName, HashMap<String, Integer> grade) 
	{
		super();
		this.Studentname = studentName;
		this.grade = grade;
	}
	
	public String getStudentName() {
		return Studentname;
	}
	public void setStudentName(String studentName) {
		this.Studentname = studentName;
	}
	public HashMap<String, Integer> getGrade() {
		return grade;
	}
	public void setGrade(HashMap<String, Integer> grade) {
		this.grade = grade;
	}

}
