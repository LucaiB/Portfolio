/**
 * @author Lucas Banerji
 * CmpByNeighborhoodAndPrice implements Comparator<Willow> to help sort Willows
 */
import java.util.Comparator;

public class CmpByNeighborhoodAndPrice implements Comparator<Willow>{ // Sort first by neighborhood, then by price
	
	public int compare(Willow p1, Willow p2) 
	{
		double retval = p1.getNeighborhood().compareTo(p2.getNeighborhood()); // sorting by neighborhood in ascending order
		if(retval == 0)
		{
			retval = p2.getPrice()-p1.getPrice(); // sorting more expensive properties before less expensive properties
		}
		
		if(retval == 0)                     
			return 0;
		else if(retval > 0)   
			return 1;
		else
			return -1;	
	}
}
