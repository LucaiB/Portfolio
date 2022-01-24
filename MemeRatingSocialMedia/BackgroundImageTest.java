import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BackgroundImageTest {

	BackgroundImage def = new BackgroundImage();
	BackgroundImage tester = new BackgroundImage("filename", "Title", "Desc");      //creating objects to be used for testing
	User lucas = new User("lucas");

	@Test // test the toString method
	public void bgToStringTest() {
		assertEquals("The string was not properly printed", "Title <Desc>", tester.toString());
	}
	
	@Test 
	public void bgIsEqualTest() //testing equal backgroundImages
	{
		def.setDescription(tester.getDescription());
		def.setImageFileName(tester.getImageFileName());
		def.setTitle(tester.getTitle());
		assertEquals("The equals method or the getter/setter methods are not properly implemented", true, def.equals(tester));
	}

	@Test 
	public void bgIsNotEqualTest() //testing non-equal backgroundImages
	{
		def.setDescription(tester.getDescription());
		def.setImageFileName(tester.getImageFileName());
		def.setTitle("");
		assertEquals("The equals method or the getter/setter methods are not properly implemented", false, def.equals(tester));
	}
	
	@Test  //testing several equals method cases
	public void equalsTest3()
	{
		boolean flagA = tester.equals(tester);                 //assigning the results of all cases to a boolean variable
		boolean flagB = !(tester.equals(new Rating(lucas,1)));
		boolean flagC = !(tester.equals(null));
		def.setDescription("hello");
		tester.setDescription(null);
		boolean flagD = !(tester.equals(def));           //if equals method is implemented properly
		tester.setDescription("nothello");               //then they should all be true
		boolean flagE = !(tester.equals(def));
		tester.setDescription("hello");
		tester.setImageFileName(null);
		boolean flagF = !(tester.equals(def));
		tester.setImageFileName("file");
		boolean flagG = !(tester.equals(def));
		def.setImageFileName("file");
		tester.setTitle(null);
		boolean flagH = !(tester.equals(def));
		
		
		boolean finalFlag = false;
		if(flagA && flagB && flagC && flagD && flagE && flagF && flagG && flagH)  //if all variables(cases) are true
			finalFlag = true;
		assertEquals("The equals method is not properly implemented", true, finalFlag);   //finalFlag should be true as well indicating that the equals method works properly
	}

}
