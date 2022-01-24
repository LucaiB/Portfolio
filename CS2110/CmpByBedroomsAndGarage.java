
/**
 * @author Lucas Banerji
 * CmpByBedroomsAndGarage implements Comparator<Willow> to help sort Willows
 */
import java.util.Comparator;

public class CmpByBedroomsAndGarage implements Comparator<Willow> { // Sort first by the number of bedrooms, then by
																	// garage

	public int compare(Willow p1, Willow p2) {
		double retval = 0;

		retval = p1.getBedrooms() - p2.getBedrooms(); // sorting properties with more bedrooms before properties with
														// less bedrooms
		if (retval == 0) {
			if (p1.getGarage() && !(p2.getGarage())) // sorting properties that have a garage before properties that
														// don'thave a garage
				return -1;
			else if (p2.getGarage() && !(p1.getGarage()))
				return 1;
			else
				return 0;
		}

		if (retval == 0)
			return 0;
		else if (retval > 0)
			return -1;
		else
			return 1;
	}

}
