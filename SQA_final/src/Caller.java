import java.util.ArrayList;

public class Caller 
{

	//this acts as the driver class to run my test
	
	ArrayList<Rubric> rubrics = new ArrayList<Rubric>();
	
	public Caller()
	{
		
	}
	
	public Rubric createRubric(ArrayList<String> criteria, String title)
	{
		Rubric rubric = new Rubric(title);
		rubric.setCriteria(criteria);
		rubrics.add(rubric);
		
		return rubric;
	}
	
	public ArrayList<Rubric> getAllRubrics() 
	{
		return rubrics;
	}

	public Rubric getSpecificRubric(String title) 
	{

		for (Rubric rubric : rubrics) {
			if (rubric.getTitle().equalsIgnoreCase(title)) {
				return rubric;
			}
		}
		return null;
	}
}
