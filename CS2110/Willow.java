
/**
 * @author Lucas Banerji
 * 
 * Willow class: A real estate that initializes a Willow(apartment/house) with several fields
 * Implements comparable 
 */
import java.util.ArrayList;
import java.util.Collections;

public class Willow implements Comparable<Willow> {

	private String neighborhood;
	private int numBedrooms;
	private boolean garage;
	private double distToCenter, price;

	/**
	 * @param neighborhood
	 * @param numBedrooms
	 * @param garage
	 * @param distToCenter
	 * @param price
	 */
	public Willow(String neighborhood, int numBedrooms, boolean garage, double distToCenter, double price) { // constructor
		this.neighborhood = neighborhood;
		this.numBedrooms = numBedrooms;
		this.garage = garage;
		this.distToCenter = distToCenter;
		this.price = price;
	}

	@Override
	public int compareTo(Willow other) { // Compares by price and then by distance to center
		// TODO Auto-generated method stub
		double retval = 0;
		retval = this.getPrice() - other.getPrice(); // sorting cheaper properties before more expensive properties
		if (retval == 0) { // if equal
			retval = this.getDistToCenter() - other.getDistToCenter(); // sorting properties closer to the center of
																		// grounds before properties further away
		}

		if (retval == 0)
			return 0;
		else if (retval > 0)
			return 1;
		else
			return -1;
	}

	public static void sortByNaturalOrdering(ArrayList<Willow> pList) {
		pList.sort(null);
	}

	public static void sortByBedroomsAndGarage(ArrayList<Willow> pList) {
		Collections.sort(pList, new CmpByBedroomsAndGarage());
	}

	public static void sortByNeighborhoodAndPrice(ArrayList<Willow> pList) {
		Collections.sort(pList, new CmpByNeighborhoodAndPrice());
	}

	public String toString() { // copied from assignment details
		return "[" + this.neighborhood + "|" + this.numBedrooms + "|" + this.garage + "|" + this.distToCenter + "|"
				+ this.price + "]";
	}

	/**
	 * @return the neighborhood
	 */
	public String getNeighborhood() {
		return neighborhood;
	}

	/**
	 * @param neighborhood the neighborhood to set
	 */
	public void setNeighborhood(String neighborhood) {
		this.neighborhood = neighborhood;
	}

	/**
	 * @return the numBedrooms
	 */
	public int getBedrooms() {
		return numBedrooms;
	}

	/**
	 * @param numBedrooms the numBedrooms to set
	 */
	public void setBedrooms(int numBedrooms) {
		this.numBedrooms = numBedrooms;
	}

	/**
	 * @return the garage
	 */
	public boolean getGarage() {
		return garage;
	}

	/**
	 * @param garage the garage to set
	 */
	public void setGarage(boolean garage) {
		this.garage = garage;
	}

	/**
	 * @return the distToCenter
	 */
	public double getDistToCenter() {
		return distToCenter;
	}

	/**
	 * @param distToCenter the distToCenter to set
	 */
	public void setDistToCenter(double distToCenter) {
		this.distToCenter = distToCenter;
	}

	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}

	public static void main(String[] args) { // quick testing
		String a = "a";
		String A = "a";
		System.out.println(a.compareTo(A));
		// testing
	}
}
