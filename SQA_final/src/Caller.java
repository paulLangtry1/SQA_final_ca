import java.util.ArrayList;
import java.util.HashMap;

public class Caller 
{

	//this acts as the driver class to run my test
	
	ArrayList<Rubric> rubrics = new ArrayList<Rubric>();
	ArrayList<StudentGrade> studentGrades = new ArrayList<StudentGrade>();
	
	public Caller()
	{
		
	}
	
	public Rubric createRubric(ArrayList<String> criteria,ArrayList<StudentGrade>studentgrades, String title)
	{
		Rubric rubric = new Rubric(title);
		rubric.setCriteria(criteria);
		rubric.setStudentGrade(studentgrades);
		rubrics.add(rubric);
		
		
		return rubric;
	}
	
	public StudentGrade creategrade(String studentName,HashMap<String,Integer>Studentresult) 
	{
		StudentGrade studentGrade = new StudentGrade(studentName,Studentresult);
		studentGrades.add(studentGrade);
		return studentGrade;
	}
	
	
	public ArrayList<Rubric> getAllRubrics() 
	{
		return rubrics;
	}

	public Rubric getSpecificRubric(String title) //get rubric by title (name)
	{

		for (Rubric rubric : rubrics)
		{
			if (rubric.getTitle().equalsIgnoreCase(title)) 
			{
				return rubric;
			}
		}
		return null;
	}
}
