
/************************
 * 
 * @author Lucas Banerji
 * Stone-s4-25
 *
 ***********************/
import java.util.ArrayList;

public class User {

	private String userName;
	private ArrayList<Meme> memesCreated, memesViewed;

	public User(String userName) {
		this.userName = userName;
		memesCreated = new ArrayList<Meme>();
		memesViewed = new ArrayList<Meme>();
	}

	public User() {     //default constructor
		userName = "";
		memesCreated = new ArrayList<Meme>();
		memesViewed = new ArrayList<Meme>();
	}
	/*  Not used
	public void rateMeme(Meme meme, int rate) {

		if (rate > 0)
			rate = 1;
		else if (rate < 0)
			rate = -1;
		else
			rate = 0;
	}
	*/
	
	
	//creates a new Meme object using the supplied arguments (caption is a String) and with the current user set as the creator property. This method will add the resulting Meme 
	//to the list of createdMemes variable for the current user. 
	public Meme createMeme(BackgroundImage img, String capt) {
		Meme newMeme = new Meme(img, capt, this);
		getMemesCreated().add(newMeme);
		return newMeme;
	}

	/**
	 * @param meme
	 * @return
	 */
	public boolean deleteMeme(Meme meme) {
		if (meme.getShared())
			return false;

		if (getMemesCreated().contains(meme)) {
			getMemesCreated().remove(meme);
			return true;
		}

		return false;
	}

	/**
	 * 
	 * @param meme
	 * @param feed
	 */
	public void shareMeme(Meme meme, Feed feed) {

		meme.setShared(true);
		feed.getMemes().add(meme);             //sets shared to true and adds the meme to a feed
	}

	/**
	 * @param feed
	 * @param rating
	 */
	public void rateNextMeme(Feed feed, int rating) {
		Meme newMeme = feed.getNewMeme(this);
		if (newMeme == null) {
			System.out.println("There are no more memes to view");

		} else {

			getMemesViewed().add(newMeme);

			Rating ratingScore = new Rating(this, rating);
			newMeme.getRatings().add(ratingScore);

		}
	}

	/*
	 * int[] scores = {-1,0,1}; int index = (int) (Math.random() * 3); Rating
	 * ratingScore = new Rating(this, scores[index]);
	 * newMeme.getRatings().add(ratingScore); //newMeme.getRatings().add(new Rating
	 * (this, ratingScore));
	 */

	
	//returns a value calculated as a sum of all ratings (caclulateRating()) given to Memes created
	//by this User. If the user has not created any Memes or had any Memes rated, 0.0 should be 
	//returned.
	public double calculateReputation() {
		double rep = 0;

		for (Meme m : getMemesCreated()) {
			rep += m.calculateRating();
		}
		return rep;
	}

	// returns "username has rated (number of memes viewed) memes, (reputation)"
	public String toString() {
		return userName + " has rated (" + memesViewed.size() + ") memes, (" + calculateReputation() + ")";
	}

	@Override // true if usernames are equal
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (userName == null) {
			if (other.userName != null)
				return false;
		} else if (!userName.equals(other.userName))
			return false;
		return true;
	}

	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * @param userName the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 * @return the memesCreated
	 */
	public ArrayList<Meme> getMemesCreated() {
		return memesCreated;
	}

	/**
	 * @param memesCreated the memesCreated to set
	 */
	public void setMemesCreated(ArrayList<Meme> memesCreated) {
		this.memesCreated = memesCreated;
	}

	/**
	 * @return the memesViewed
	 */
	public ArrayList<Meme> getMemesViewed() {
		return memesViewed;
	}

	/**
	 * @param memesViewed the memesViewed to set
	 */
	public void setMemesViewed(ArrayList<Meme> memesViewed) {
		this.memesViewed = memesViewed;
	}
}
