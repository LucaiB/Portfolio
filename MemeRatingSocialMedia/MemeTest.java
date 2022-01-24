import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;

public class MemeTest {
	
	BackgroundImage bgi = new BackgroundImage("file", "title", "desc");
	BackgroundImage other = new BackgroundImage();
	String cap = "cap";
	User lucas = new User("lucas");
	User jonny = new User("jonny");         //creating objects to be used for testing
	Meme def = new Meme();
	Meme test = new Meme(bgi, cap, lucas);
	
	

	@Test  //tests get rating,setRating, and calculateRating
	public void calculateRatingtest() {
		test.getRatings().add(new Rating());
		ArrayList<Rating> altRating = new ArrayList<Rating>();    //all methods in this test must work properly for the test to run without error
		altRating.add(new Rating(lucas,1));
		altRating.add(new Rating(lucas,1));                      //therefore it properly tests several methods at once
		altRating.add(test.getRatings().get(0));
		test.setRatings(altRating);
		assertEquals("Calculate rating is not implemented correctly or get/set Ratings is not correct", 2.0, test.calculateRating(), 0.1);
	}
	
	@Test  //calculateRating test when ratings size is 0
	public void calculateRatingtest2() {
		assertEquals("Calculate rating is not implemented correctly or get/set Ratings is not correct", 0.0, test.calculateRating(), 0.1);
	}
	
	@Test  //tests toString
	public void toStringTest() {
		ArrayList<Rating> ratings = new ArrayList<Rating>();
		ratings.add(new Rating(lucas,1));
		ratings.add(new Rating(lucas,-1));
		ratings.add(new Rating(lucas,1));
		test.setRatings(ratings);
		assertEquals("The toString method is implemented incorrectly", "title <desc> 'cap' lucas (0.0) 1.0 [(2) +1 (1) -1]", test.toString());
	}
	
	@Test //tests when equals should return true and tests several get/set methods
	public void equalsTest1()
	{
		def.setBackgroundImage(test.getBackgroundImage());
		def.setCreator(test.getCreator());
		def.setCaption(test.getCaption());    //get and set methods must work properly in order for the test to run without error
		def.setRatings(test.getRatings());    //hence it effectively tests several methods at once
		def.setShared(test.getShared());
		assertEquals("Either the equals method or the tested set/get methods are incorrectly implemented", true, test.equals(def));
	}
	
	@Test    //tests several equals method cases
	public void equalsTest2()
	{
		boolean finalFlag = false;
		boolean flagA = test.equals(test);
		boolean flagB = !(test.equals(null));
		boolean flagC = !(test.equals(lucas));    //assigning all equals cases to a boolean variable
		test.setBackgroundImage(null);            //if equals method is implemented correctly then
		def.setBackgroundImage(bgi);              //all variables should be set to true
		boolean flagE = !(test.equals(def));
		test.setBackgroundImage(other);
		boolean flagF = !(test.equals(def));
		test.setBackgroundImage(bgi);
		test.setCaption(null);
		boolean flagD = !(test.equals(def));
		test.setCaption(cap);
		boolean flagG = !(test.equals(def));
		def.setCaption(cap);
		test.setCreator(null);
		boolean flagH = !(test.equals(def));
		test.setCreator(lucas);
		boolean flagI = !(test.equals(def)); 
		
		if(flagA && flagB && flagC && flagD && flagE && flagF && flagG && flagH && flagI)  //if all are true
			finalFlag = true;
		
		assertEquals("Equals method is not implemented properly", true, finalFlag);  //test will run without error
		
		
	}
	
	

}
