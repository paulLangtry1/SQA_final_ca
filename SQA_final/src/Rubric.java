import java.util.ArrayList;

public class Rubric 
{
	ArrayList<String> criteria = new ArrayList<String>();
	ArrayList<StudentGrade> studentgrade = new ArrayList<StudentGrade>();
	String title;
	
	public Rubric(String title)
	{
		super();
		this.title = title;
	}
	
	public String getTitle()
	{
		return title;
	}
	public void setTitle()
	{
		this.title = title;
	}

	public ArrayList<StudentGrade> getStudentGrade()
	{
		return studentgrade;
	}
	public void setStudentGrade(ArrayList<StudentGrade> studentGrades)
	{
		this.studentgrade=studentgrade;
	}
	public ArrayList<String> getCriteria()
	{
		return criteria;
	}
	public void setCriteria(ArrayList<String> criteria)
	{
		this.criteria=criteria;
	}
	
}
