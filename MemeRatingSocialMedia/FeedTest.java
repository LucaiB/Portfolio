import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;

public class FeedTest {
	
	Feed def = new Feed();       //creating objects to be used for testing
	Meme x = new Meme();
	Meme y = new Meme();
	User Lucas = new User("Lucas");
	

	@Test   // test when meme is available to be viewed
	public void getNewMemeTest() {
		def.getMemes().add(x);
		def.getMemes().add(y);
		
		assertEquals("getNewMeme was not implemented properly when there was an availbale meme", x, def.getNewMeme(Lucas));
	}
	
	@Test   //test when no memes should be viewed
	public void getNewMemeTest2()
	{
		x.setCreator(Lucas);
		y.setCreator(Lucas);    //no memes should be viewed because all of the memes are created by the author
		assertEquals("getNewMeme should not work when the author of all memes if using getNewMeme", null, def.getNewMeme(Lucas));
	}
	
	@Test //Testing set method and toString()
	public void toStringSetMemesTest()
	{
		ArrayList<Meme> newArr = new ArrayList<Meme>();
		newArr.add(x);
		newArr.add(y);
		y.setCreator(Lucas);          //if the set method does not work properly then the whole test will run false
		x.setCreator(Lucas);    //hence this test properly tests two methods at once
		def.setMemes(newArr);
		assertEquals("toString() or set method was not implemented correctly", " <> '' Lucas (0.0) 0.0 [(0) +1 (0) -1]\n <> '' Lucas (0.0) 0.0 [(0) +1 (0) -1]\n", def.toString());
	}

}
