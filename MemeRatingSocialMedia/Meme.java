/************************
 * 
 * @author Lucas Banerji
 * Stone-s4-25
 *
 ***********************/
import java.util.ArrayList;

public class Meme {
	private User creator;
	private BackgroundImage backgroundImage;
	private ArrayList<Rating> ratings;
	private String caption;
	private boolean shared;

	public Meme(BackgroundImage bgi, String cap, User user) {
		creator = user;
		backgroundImage = bgi;
		ratings = new ArrayList<Rating>();
		caption = cap;
		shared = false; 
	}

	public Meme() {    //default constructor
		backgroundImage = new BackgroundImage();
		creator = new User();
		ratings = new ArrayList<Rating>();
		caption = "";
		shared = false;
	}

	// return a double that is a sum of all rating scores for this Meme. If a Meme
	// has no ratings, 0.0 should be returned.
	public double calculateRating() {
		if (ratings.size() == 0)
			return 0;

		double sum = 0;
		for (Rating x : ratings)
			sum += x.getScore();

		return sum;

	}

	// returns "backgroundImage 'caption' author (reputation) meme calculated rating
	// [(number of +1 ratings) +1 (number of -1 ratings) -1]"
	public String toString() {
		int plusOne = 0;
		int negOne = 0;
		for (Rating r : ratings) {
			if (r.getScore() == 1)
				plusOne++;
			else if (r.getScore() == -1)
				negOne++;
		}

		return backgroundImage + " '" + caption + "' " + creator.getUserName() + " (" + creator.calculateReputation() + ")" + " " + calculateRating() + " [(" + plusOne + ") +1 (" + negOne + ") -1]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Meme other = (Meme) obj;
		if (backgroundImage == null) {
			if (other.backgroundImage != null)
				return false;
		} else if (!backgroundImage.equals(other.backgroundImage))
			return false;
		if (caption == null) {
			if (other.caption != null)
				return false;
		} else if (!caption.equals(other.caption))
			return false;
		if (creator == null) {
			if (other.creator != null)
				return false;
		} else if (!creator.equals(other.creator))
			return false;
		return true;
	}

	/**
	 * @return the creator
	 */
	public User getCreator() {
		return creator;
	}

	/**
	 * @param creator the creator to set
	 */
	public void setCreator(User creator) {
		this.creator = creator;
	}

	/**
	 * @return the backgroundImage
	 */
	public BackgroundImage getBackgroundImage() {
		return backgroundImage;
	}

	/**
	 * @param backgroundImage the backgroundImage to set
	 */
	public void setBackgroundImage(BackgroundImage backgroundImage) {
		this.backgroundImage = backgroundImage;
	}

	/**
	 * @return the ratings
	 */
	public ArrayList<Rating> getRatings() {
		return ratings;
	}

	/**
	 * @param ratings the ratings to set
	 */
	public void setRatings(ArrayList<Rating> ratings) {
		this.ratings = ratings;
	}

	/**
	 * @return the caption
	 */
	public String getCaption() {
		return caption;
	}

	/**
	 * @param caption the caption to set
	 */
	public void setCaption(String caption) {
		this.caption = caption;
	}

	/**
	 * @return the shared
	 */
	public boolean getShared() {
		return shared;
	}

	/**
	 * @param shared the shared to set
	 */
	public void setShared(boolean shared) {
		this.shared = shared;
	}
}
