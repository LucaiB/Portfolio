/************************************************************************
NAME:  Lucas Banerji    
PERIOD: 2
DUE DATE:  1/31/18 

PURPOSE: To create a Hand class that does several basic functions 
that card games may have a "hand" do.

WHAT I LEARNED: I furthered my understanding of ArrayLists by using them 
in a program that could apply to a real life situation.
            
CREDITS (BE SPECIFIC: FRIENDS, PEERS, ONLINE WEBSITE): 
None...
***************************************************************************/
import java.util.*;
public class Hand
{

   private ArrayList <Card> hand;
	
	/*Pre-condition: none
	 *Post-condition: ArrayList hand is set to null, so it is empty.
	*/
   public Hand()
   {
      hand = new ArrayList<Card> (0);
   }
	
	/*Pre-condition: an object of type Card is passed as a parameter to the non-default constructor
	 *Post-condition: Card is added to the ArrayList hand
	*/
   public Hand(Card c)
   {
   hand= new ArrayList<Card> (1);
      hand.add(0,c);
      hand.add(c);
   }
	
	/*Pre-condition: none
	 *Post-condition: The number of cards in Hand is returned
	*/
   public int numberOfCards()
   {
      return hand.size();
   }
	
	/*Pre-condition: the index of the card you want to get is >= 0
	 *and is < hand.size()
	 *Post-condition: the card specified by the index that meets the pre-condition
	 *is returned
	*/
   public Card getCard(int c)
   {
      return hand.get(c);
   }
	
	/*Pre-condition: the index of the card you want to remove from the hand
	 *is >= 0 and is < hand.size()
	 *Post-condition: the card of the index that meets the pre-condition is
	 *removed from the hand
	*/
   public void removeCard(int c)
   {
      hand.remove(c);
   }
	
	/*Pre-condition: the value passed into the method is >= 0 && <= 12
	 *Post-condition: true is returned if the hand contains one or more
	 *cards of the same value
	*/
   public boolean ifSameValue(int value)
   {
      boolean flag = false;
      for (int k = 0; k < hand.size(); k++)
      {
         if(hand.get(k).getValue()==value)
            flag = true;
      }
      return flag;
   }	
	
	/*Pre-condition: the suit value passed into the method is >= 0 && <= 3
	 *Post-condition: true is returned if the hand contains one or more
	 *cards of the same suit
	*/
   public boolean ifSameSuit(int suit)
   {
      boolean flag = false;
      for (int k = 0; k < hand.size(); k++)
      {
         if (hand.get(k).getSuit()==suit)
            flag = true;
      }
      return flag;
   }
	
	/*Pre-condition: none
	 *Post-condition: prints information about the Cards in the hand
	*/
   public String toString()
   {
      String list="";
      for(int k=0;k < hand.size();k++)
      {
         return hand.get(k).toString();
      }
      return "";
   }
	
		/*Pre-condition: v >= 0 && v <= 12 and a >= 0 && a <= 3 
		 *Post-condition: A new card will be added to the ArrayList hand if the card is
		 *not already present in the hand, but if there is already a similar card in the
		 *hand, nothing will happen.
		*/
   public void addCard(int v, int s)
   {
         
      Card temp=new Card(v,s);
      for(int k=0; k < hand.size(); k++)
      {
         if((hand.get(k).equals(temp)))
         {
            return;
         }
      }
      hand.add(temp);
      
   }
      
			   
} // class