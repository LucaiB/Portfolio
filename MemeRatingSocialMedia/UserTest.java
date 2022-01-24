import static org.junit.Assert.*;

import org.junit.Test;

public class UserTest {
	
	User def = new User();                        //creating objects to be used for testing
	User lucas = new User("lucas");
	User jonny = new User ("jonny");
	BackgroundImage bgi = new BackgroundImage("file", "Title", "desc");
	Rating jonrate = new Rating(jonny, 1);
	Meme meme = new Meme(bgi, "capt", lucas);
	Meme other = new Meme(bgi, "capt", jonny);
	Feed sc = new Feed();
	

	@Test  //testing createMeme method and getMemesCreated method
	public void createMemeTest() {
		lucas.getMemesCreated().add(meme);      //must work in order for test to run without error
		assertEquals("createMeme is not implemented correctly", meme.getCreator().getMemesCreated().get(0), lucas.createMeme(bgi, "capt"));
	}
	
	@Test  //testing deleteMeme method
	public void deleteMemeTest0()
	{
		lucas.getMemesCreated().add(meme);
		assertEquals("deleteMeme is not properly implemented", true, lucas.deleteMeme(meme));
	}
	
	@Test   //testing deleteMeme when the meme has been shared
	public void deleteMemeTest1()
	{
		lucas.getMemesCreated().add(meme);   
		lucas.shareMeme(meme, sc);                      
		assertEquals("deleteMeme is not properly implemented", false, lucas.deleteMeme(meme));   //should return false because you can not delete a meme that has been shared
	}
	
	@Test  //testing rateNextMeme
	public void rateNextMemeTest()
	{
		sc.getMemes().add(other);
		lucas.rateNextMeme(sc, 1 );         //sets score of first meme in sc to 1 
		assertEquals("rateNextMeme was not implemented properly",1,other.getRatings().get(0).getScore());	
	}
	
	@Test   //testing calculate reputation as well as some get/set methods
	public void calculateReputationTest()
	{
		lucas.getMemesCreated().add(meme);
		lucas.getMemesCreated().add(other);
		meme.getRatings().add(jonrate);                   //get/set methods must work in order for test to return the expected value
		meme.getRatings().add(new Rating(jonny, 1));
		other.getRatings().add(jonrate);                  //therefore this test is effective for all methods used in test
		jonny.setMemesCreated(lucas.getMemesCreated());
		assertEquals("calculateReputation is not implemented correctly", 3.0, jonny.calculateReputation(), 0.1);
	}
	
	@Test  //testing toString
	public void toStringTest()
	{
		assertEquals("toString is not implemented correctly", "lucas has rated (0) memes, (0.0)", lucas.toString());
	}
	
	@Test   //Test when two users are equal and the set/get username methods
	public void equalsTest0()
	{
		jonny.setUserName(lucas.getUserName());      //setUsername must work for test to run without error
		assertEquals("The equals method is not implemented correctly or the get/set username is inocorrectly implemented", true, jonny.equals(lucas));
	}
	
	@Test   //testing set/get memesViewed
	public void setMemesViewedTest()
	{
		jonny.getMemesViewed().add(meme);
		lucas.setMemesViewed(jonny.getMemesViewed());
		assertEquals("setMemesViewed is incorrectly implemented", meme, lucas.getMemesViewed().get(0));
	}
	
	
	

}
