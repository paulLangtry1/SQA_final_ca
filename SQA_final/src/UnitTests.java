import java.util.ArrayList;

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

			Rubric rubric = caller.createRubric(criteria, "modules");//creating rubric for testing
			
			Assert.assertFalse(caller.getAllRubrics().isEmpty());
			Assert.assertTrue(rubric.getCriteria().equals(criteria));
			Assert.assertTrue(rubric.getTitle().equals("modules"));

		}


}
