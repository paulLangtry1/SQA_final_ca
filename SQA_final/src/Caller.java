import java.util.ArrayList;
import java.util.Collections;
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
	public ArrayList<StudentGrade> getAllStudentGrades() 
	{
		return studentGrades;
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
	
	public ArrayList<StudentGrade>getAllStudentGradesBySpecificRubric(String title) //getting all grades with the matching specfic rubric
	{
		
		ArrayList<StudentGrade>specificRubric = new ArrayList<StudentGrade>();
		
		for(Rubric rubric : rubrics) {
			if(rubric.getTitle().equalsIgnoreCase(title)) 
			{
				for(StudentGrade grade: rubric.getStudentGrade()) 
				{
					specificRubric.add(grade);
				}
			}
		}
		return specificRubric;
	}
	
	public int getAverage(Rubric rubric, String criterion) {
		
		 int total =0;
		for(StudentGrade grade :rubric.getStudentGrade()) 
		{
			total = total+grade.getGrade().get(criterion);
		}
		int totalgrades = rubric.getStudentGrade().size();
		int average = (total/totalgrades);

		return average;
	}
	
	public int getMinMax(Rubric rubric,String criterion,int selection) 
	{
		 ArrayList<Integer>resultslist = new ArrayList<Integer>();
			int result=0;

			for(StudentGrade grade :rubric.getStudentGrade()) 
			{
				resultslist.add(grade.getGrade().get(criterion));
			}
			
			Collections.sort(resultslist); // I used collections sort as it is the easiest way to sort a list
			
			
			if(selection==0) 
			{
				result = resultslist.get(0);
			}
			else if(selection==1)
			{
				int max = resultslist.get(resultslist.size()-1);
				result = max;
			}
			return result;
	}
	public double getStandardDev(Rubric rubric,String criterion) //to calc standard dev workout out mean, each number subtract mean and square the result, 
																//the get mean of sqrd differences, then minus the sqr root
	{
		
		int average = getAverage( rubric, criterion);//mean
		double standarddev = 0.0;
		
		int result=0;
		for(int i=0; i<rubric.getStudentGrade().size();i++) 
		{
			standarddev += Math.pow(rubric.getStudentGrade().get(i).getGrade().get(criterion)-average, 2);
		}
		
	
		return Math.sqrt(standarddev/rubric.getStudentGrade().size());
	}
	
	

	
}
