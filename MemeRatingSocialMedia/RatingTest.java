import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RatingTest {
	
	User lucas = new User("lucas");          //creating objects to be used for testing
	User jonny = new User("jonny");
	Rating def = new Rating();
	Rating rat = new Rating(lucas,1);
	Rating other = new Rating(jonny, 0);
	
	@Test   //tests toString and get/set methods
	public void toStringsetRating() {
		rat.setRating(10);
		def.setScore(-10);     //expected string won't match produced string unless the set/get methods are correct
		def.setUser(rat.getUser());
		assertEquals("toString or used get/set methods are incorrectly implemented", "lucas rates 1lucas rates -10jonny rates 0", rat.toString()+def.toString()+other.toString());
	}
	
	@Test  //tests getting score above 0
	public void getScoreTest0()
	{
		assertEquals("getScore was not implemented properly", 1, rat.getScore());
	}
	
	@Test  //tests getting score lower than 0
	public void getScoreTest1()
	{
		rat.setRating(-1);
		assertEquals("getScore was not implemented properly", -1, rat.getScore());
	}
	
	@Test  //tests several equals method cases
	public void equalsTest()
	{
		boolean finalFlag = false;
		boolean flagA = rat.equals(rat);
		boolean flagB = !(rat.equals(null));     //all cases are assigned a boolean variable
		other.setUser(lucas);				     //if equals method is implemented properly
		other.setScore(1);                       //they should all be true
		boolean flagC = rat.equals(other);
		boolean flagD = !(rat.equals(lucas));
		other.setRating(0);
		boolean flagE = !(rat.equals(other));
		
		if(flagA && flagB && flagC && flagD && flagE)   //if all are true finalFlag is set to true
			finalFlag = true;
		
		assertEquals("Equals method is not implemented correctly", true, finalFlag);  //and test will run without error
	}

}
