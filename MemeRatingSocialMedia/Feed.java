
/************************
 * 
 * @author Lucas Banerji
 * Stone-s4-25
 *
 ***********************/
import java.util.ArrayList;

public class Feed {
	private ArrayList<Meme> memes;

	public Feed() // default constructor
	{
		memes = new ArrayList<Meme>();
	}

	/**
	 * 
	 * @param user
	 * @return
	 */
	public Meme getNewMeme(User user) {
		for (Meme m : memes) // loops through each meme to see if its already been viewed or if it is made by
								// the author
		{
			if (user.getMemesViewed().contains(m) || user.getMemesCreated().contains(m))
				;
			else {
				return m; // if it is not, then the meme is returned
			}	
		
		}
		return null; 
	}
	//returns all the memes in the feed, each Meme on a new line
	public String toString() {
		String str = "";
		for (Meme mem : memes)
			str = str + mem + "\n";      //each meme is appended to the string and \n makes a new line

		return str;
	}

	/**
	 * @return the memes
	 */
	public ArrayList<Meme> getMemes() {
		return memes;
	}

	/**
	 * @param memes the memes to set
	 */
	public void setMemes(ArrayList<Meme> memes) {
		this.memes = memes;
	}

	/*
	public static void main(String[] args) { 
		
		Feed instagram = new Feed();

		User Lucas = new User("Lucas");
		User Jonny = new User("Jonny");
		User Andy = new User("Andy");

		BackgroundImage cryingDog = new BackgroundImage("Crydog", "Crying Dog", "A dog is crying funnily");
		BackgroundImage boredFace = new BackgroundImage("brdface", "Bored Face",
				"A face so bored its boring to look at");
		BackgroundImage explodingHouse = new BackgroundImage("houseExplode", "Exploding House", "An exploding house");

		Meme meme1 = Lucas.createMeme(explodingHouse, "Wow could not be me");
		Meme meme2 = Lucas.createMeme(boredFace, "Never me in CS 2110 hahahahah");
		Meme meme3 = Lucas.createMeme(cryingDog, "Me when I cry, isn't it cute");
		Lucas.shareMeme(meme1, instagram);
		Lucas.shareMeme(meme2, instagram);
		Lucas.shareMeme(meme3, instagram);
		/*
		 * Meme meme5 = Jonny.createMeme(explodingHouse, "I bet I could live in there");
		 * Meme meme6 = Jonny.createMeme(boredFace, "Me fishing"); Meme meme7 =
		 * Jonny.createMeme(cryingDog, "New dog be like"); Jonny.shareMeme(meme7,
		 * instagram); Jonny.shareMeme(meme6, instagram); Jonny.shareMeme(meme5,
		 * instagram); Meme meme8 = Andy.createMeme(explodingHouse,
		 * "It wasn't my fault tho"); Meme meme9 = Andy.createMeme(boredFace,
		 * "Me everyday"); Meme meme4 = Andy.createMeme(cryingDog,
		 * "After I heard the new season wasn't coming out"); Andy.shareMeme(meme4,
		 * instagram); Andy.shareMeme(meme9, instagram); Andy.shareMeme(meme8,
		 * instagram);
		 *//*

		for (int i = 0; i < instagram.getMemes().size(); i++) {
			// Lucas.rateNextMeme(instagram, 0);
			Jonny.rateNextMeme(instagram, 0);
			Andy.rateNextMeme(instagram, 0);
		}

		System.out.println(instagram.getMemes());
		System.out.println(Lucas);
		System.out.println(Jonny);
		System.out.println(Andy);

		System.out.println("\n" + instagram);
		}*/

		
		
}
