import java.util.HashSet;
import java.util.TreeMap;

/**
 * 9/17/2020
 * 
 * @author Lucas Banerji 
 * Stone-s4-25
 * 
 * Testing HashSets and TreeMaps
 */
public class LabActivity11 {
	/**
	 * This method (names) takes in two sets: one of names already on cards and the
	 * other containing the top 100 names. The method returns a set of names for the
	 * new cards needed (in topNames but not in cards)
	 */
	public static HashSet<String> names(HashSet<String> cards, HashSet<String> topNames) {

		HashSet<String> newSet = new HashSet<String>();
		
		for(String str: topNames)
		{
			if(!(cards.contains(str)))
				newSet.add(str);
		}
		
		return newSet;
	}

	/**
	 * This method (reverseBook) takes a TreeMap representation of a phonebook
	 * (Key=Name, a String, and Value=Number, an Integer). The method returns the
	 * reverse phonebook (that is, you know the number and you're looking for the
	 * name)
	 */
	public static TreeMap<Integer, String> reverseBook(TreeMap<String, Integer> phoneBook) {

		TreeMap<Integer, String> reverse = new TreeMap<Integer, String>();
		
		for(String str: phoneBook.keySet())
		{
			reverse.put(phoneBook.get(str), str);
		}
		
		return reverse;
			
	}

	public static void main(String[] args) {

		HashSet<String> cards = new HashSet<String>();
		HashSet<String> topNames = new HashSet<String>();
		
		cards.add("Lucas");
		cards.add("Jason");
		cards.add("Jeff");
		cards.add("Lau");
		cards.add("Arjun");
		
		topNames.add("Lucas");
		topNames.add("Andy");    //part of newSet
		topNames.add("Bhatta");   //part of newSet
		topNames.add("Lau");
		topNames.add("Arjun");
		topNames.add("Alex");     //part of newSet
		topNames.add("Riley");    //part of newSet
		
		System.out.println(names(cards, topNames));   //testing names method
		
		TreeMap<String, Integer> reg = new TreeMap<String, Integer>();
		
		reg.put("Lucas", 571);
		reg.put("Andy", 703);
		reg.put("Jonny", 864);
		System.out.println(reg);
		
		TreeMap<Integer, String> rev = reverseBook(reg);   //testing reverseBook method
		System.out.println(rev);
	}
}
/*  Output
[Bhatta, Alex, Andy, Riley]
{Andy=703, Jonny=864, Lucas=571}
{571=Lucas, 703=Andy, 864=Jonny}
 */




