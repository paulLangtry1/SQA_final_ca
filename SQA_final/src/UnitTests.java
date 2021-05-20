import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.HashMap;

import org.junit.Assert;
import org.junit.Test;

public class UnitTests 
{
	
	//this is where my unittests will be performed
	
	Caller caller;
	
	
		@Test
		public void createRubrictest() 
		{

			 caller = new Caller();

			ArrayList<String> criteria = new ArrayList<>();
			criteria.add(new String("SQA"));
			criteria.add(new String("OOSD"));
			criteria.add(new String("Accounting"));

			Rubric rubric = caller.createRubric(criteria, null, "modules");//creating rubric for testing
			
			Assert.assertFalse(caller.getAllRubrics().isEmpty());
			Assert.assertTrue(rubric.getCriteria().equals(criteria));
			Assert.assertTrue(rubric.getTitle().equals("modules"));

		}
		
		
		@Test
		public void getallRubricstest() 
		{

			ArrayList<Rubric>expectedresult= new ArrayList<Rubric>();
			 caller = new Caller();
			
			Rubric rubric = new Rubric("modules");
			ArrayList<String> criteria = new ArrayList<>();
			criteria.add(new String("SQA"));
			criteria.add(new String("OOSD"));
			criteria.add(new String("Accounting"));


			expectedresult.add(rubric);	//adding "expected" rubric results to compare against
			

			caller.createRubric(criteria, null, "modules");
	
			ArrayList<Rubric>actualresult = caller.getAllRubrics();//calling the getall from my caller class
			
			Assert.assertTrue(expectedresult.size()==actualresult.size());
			assertEquals(actualresult.get(0).getCriteria(),criteria);
			assertEquals(actualresult.get(0).getTitle(),"modules");
	
	
	
		
		}
		
		@Test
		public void getSpecificRubrictest() 
		{
		
			 caller = new Caller();//initialise caller class which acts as my drivers
			
			 Rubric rubric = new Rubric("modules");
			ArrayList<String> criteria = new ArrayList<>();
			criteria.add(new String("SQA"));
			criteria.add(new String("OOSD"));
			criteria.add(new String("Accounting"));

			Rubric rubricsport = new Rubric("Sport");
			ArrayList<String> sportcriteria = new ArrayList<>();
			sportcriteria.add(new String("GAA"));
			sportcriteria.add(new String("Soccer"));
			sportcriteria.add(new String("Tennis"));
			rubricsport.setCriteria(sportcriteria);

			caller.createRubric(criteria, null, "modules");
			caller.createRubric(sportcriteria, null, "Sport");

			Rubric specificRubric=caller.getSpecificRubric("Sport");
			assertEquals(specificRubric.getCriteria(),sportcriteria);
			assertEquals(specificRubric.getTitle(),"Sport");

	    }
		
		
		//Test StudentGrade creation
		@Test
		public void createStudentGradetest() 
		{
					
			caller = new Caller();
					
			HashMap<String,Integer>Studentresult = new HashMap();
			Studentresult.put("SQA",80 );
					
			StudentGrade studentGrade=caller.creategrade("John Doe", Studentresult); //create with student name and student result
					
			
			assertEquals("John Doe",studentGrade.getStudentName());
			assertEquals(Studentresult,studentGrade.getGrade());
					
		}
		
		@Test
		public void getGradebyRubrictest() 
		{
			
				caller = new Caller();
				String sqa = "SQA";
				String oosd = "OOSD";
				
	
				ArrayList<String> criteria = new ArrayList<>();
				criteria.add(sqa);
				criteria.add(oosd);
				
				//create multiple student scores
				HashMap<String,Integer> student1results= new HashMap();
				student1results.put(sqa, 50);
				student1results.put(oosd, 65);
				StudentGrade student1Grade= caller.creategrade("John Doe", student1results);
				
				HashMap<String,Integer>student2results= new HashMap();
				student2results.put(sqa, 80);
				student2results.put(oosd, 60);
				StudentGrade student2Grade= caller.creategrade("Catherine Doe", student2results);
				
				//create expected grades to compare against
				ArrayList<StudentGrade>expectedGrades = new ArrayList<StudentGrade>();
				expectedGrades.add(student1Grade);
				expectedGrades.add(student2Grade);

				
				caller.createRubric(criteria,expectedGrades,"modules");
				
				ArrayList<StudentGrade>actualGrades= caller.getAllStudentGradesBySpecificRubric("modules");
				
				assertEquals(expectedGrades,expectedGrades);
			
						
		}
		
		
		@Test
		public void getAverageTest() 
		{
			caller = new Caller();
			String sqa = "SQA";
			String oosd = "OOSD";
			

			ArrayList<String> criteria = new ArrayList<>();
			criteria.add(sqa);
			criteria.add(oosd);
			
			//create multiple student scores
			HashMap<String,Integer> student1results= new HashMap();
			student1results.put(sqa, 50);
			student1results.put(oosd, 65);
			StudentGrade student1Grade= caller.creategrade("John Doe", student1results);
			
			HashMap<String,Integer>student2results= new HashMap();
			student2results.put(sqa, 80);
			student2results.put(oosd, 60);
			StudentGrade student2Grade= caller.creategrade("Catherine Doe", student2results);
			
			//create expected grades to compare against
			ArrayList<StudentGrade>expectedGrades = new ArrayList<StudentGrade>();
			expectedGrades.add(student1Grade);
			expectedGrades.add(student2Grade);
			
			Rubric rbrc = caller.createRubric(criteria, expectedGrades, "modules");
			
			int actualAverage = caller.getAverage(rbrc, sqa);
			assertEquals(65,actualAverage);

			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		


}
