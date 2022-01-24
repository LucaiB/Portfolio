/************************
 * 
 * @author Lucas Banerji
 * Stone-s4-25
 *
 ***********************/
public class Rating {
	private int score;
	private User user;
	
	public Rating(User user, int score)
	{
		if(score >0)
			this.score = 1;
		else if(score < 0)
			this.score = -1;
		else
			this.score = 0;
		this.user = user;
	}
	
	public Rating()   //default constructor
	{
		score = 0;
		user = new User();
	}
	
	public void setRating(int x)    //sets rating to 1 if positive, -1 if negative, else 0
	{
		if(x == 0)
			score = 0;
		else if (x > 0)
			score = 1;
		else
			score = -1;
	}
	
	
    //returns "username rates score"
	public String toString()
	{
		return user.getUserName() + " rates " + score;
	}

	@Override   //returns true if score and user are equal
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Rating other = (Rating) obj;
		if (score != other.score)
			return false;
		if (user == null) {
			if (other.user != null)
				return false;
		} else if (!user.equals(other.user))
			return false;
		return true;
	}
	/**
	 * @return the score
	 */
	public int getScore() {
		if(score == 0)
			this.score = 0;
		else if (score > 0)
			this.score = 1;
		else
			this.score = -1;
		
		return score;
	}
	/**
	 * @param score the score to set
	 */
	public void setScore(int score) {
		this.score = score;
	}
	/**
	 * @return the user
	 */
	public User getUser() {
		return user;
	}
	/**
	 * @param user the user to set
	 */
	public void setUser(User user) {
		this.user = user;
	}
}
