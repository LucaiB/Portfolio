
/**
 * @author Lucas Banerji
 * 
 * HW6Tests JUnit Test: Testing Willow constructor, compareTo, and both compare methods
 */
import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;

public class HW6Tests {

	Willow h1 = new Willow("a", 4, true, 0.5, 4000); // initializing objects to be used in testing
	Willow h123 = new Willow("a", 4, true, 0.5, 3000);
	Willow h12 = new Willow("z", 0, true, 0.4, 4000);
	Willow h2 = new Willow("b", 3, false, 0.75, 3500);
	Willow h21 = new Willow("x", 0, false, 0.5, 3500);
	Willow h3 = new Willow("c", 5, false, 0.3, 5000);
	Willow h4 = new Willow("d", 3, true, 1, 3750);
	ArrayList<Willow> houseList = new ArrayList<Willow>(); // arraylist to put all objects in
	CmpByBedroomsAndGarage bg = new CmpByBedroomsAndGarage(); // to call compare
	CmpByNeighborhoodAndPrice np = new CmpByNeighborhoodAndPrice(); // to call compare

	@Test
	public void constructorTest1() { // check correctness of constructor by seeing if the toString result was as
										// expected
		Willow h5 = new Willow("e", 2, false, 2, 1000);
		String checkString = h5.toString();
		assertEquals("The constructor was not implemented properly", "[e|2|false|2.0|1000.0]", checkString);
	}

	@Test
	public void constructorTest2() { // check correctness of constructor by using get methods to see if constructor
										// set variables properly
		Willow h5 = new Willow("e", 2, false, 2, 1000);
		boolean flag = false;

		if (h5.getGarage() == false && h5.getBedrooms() == 2 && h5.getDistToCenter() == 2
				&& h5.getNeighborhood().equals("e") && h5.getPrice() == 1000)
			flag = true;

		assertEquals("The constructor was not implemented properly", true, flag);
	}

	@Test
	public void compareToTest() { // test compareTo method in Willow class
		int val1 = h1.compareTo(h12); // returns -1
		int val2 = h2.compareTo(h1); // returns 1
		int val3 = h21.compareTo(h2); // returns 1
		int val4 = h3.compareTo(h4); // returns -1

		assertEquals("The compareTo method was not properly implemented", 0, val1 + val2 + val3 + val4);
	}

	@Test
	public void sortByNaturalOrderingTest() { // test sortByNaturalOrdering method in Willow class
		houseList.add(h1);
		houseList.add(h2); // add Willow's to list
		houseList.add(h3);
		houseList.add(h4);
		houseList.add(h12);
		// houseList.sort(null);
		Willow.sortByNaturalOrdering(houseList);  //sort
		String results = "";
		for (Willow w : houseList)  //create string of sorted list
			results += w;
		assertEquals("The sortByNaturalOrdering method is not implemented correctly", // check if it matches expected string
				"[b|3|false|0.75|3500.0][d|3|true|1.0|3750.0][z|0|true|0.4|4000.0][a|4|true|0.5|4000.0][c|5|false|0.3|5000.0]",
				results);
	}

	@Test
	public void sortByNaturalOrderingTest2() { // test sortByNaturalOrdering method in Willow class
		houseList.add(h1);
		houseList.add(h2);
		houseList.add(h3); // add Willow's to list
		houseList.add(h4);
		houseList.add(h12);
		houseList.add(h123);
		houseList.add(h21);
		// houseList.sort(null);
		Willow.sortByNaturalOrdering(houseList); // sort
		String results = "";
		for (Willow w : houseList) //create a String of sorted list
			results += w;
		assertEquals("The sortByNaturalOrdering method is not implemented correctly", // // check if it matches expected string
				"[a|4|true|0.5|3000.0][x|0|false|0.5|3500.0][b|3|false|0.75|3500.0][d|3|true|1.0|3750.0][z|0|true|0.4|4000.0][a|4|true|0.5|4000.0][c|5|false|0.3|5000.0]",
				results);
	}

	@Test
	public void sortByBedroomsAndGarageTest() { //test sortByBedroomAndGarage method in CmpByBedroomsAndGarage class
		houseList.add(h1);
		houseList.add(h2);
		houseList.add(h3);
		houseList.add(h4);
		houseList.add(h12);
		// Collections.sort(houseList, new CmpByBedroomsAndGarage());
		Willow.sortByBedroomsAndGarage(houseList);
		String results = "";
		for (Willow w : houseList)
			results += w;
		assertEquals("The sortByBedroomsAndGarage method is not implemented correctly",
				"[c|5|false|0.3|5000.0][a|4|true|0.5|4000.0][d|3|true|1.0|3750.0][b|3|false|0.75|3500.0][z|0|true|0.4|4000.0]",
				results);
	}

	@Test
	public void sortByBedroomsAndGarageTest2() { //test sortByBedroomAndGarage method in CmpByBedroomsAndGarage class
		houseList.add(h1);
		houseList.add(h21);
		houseList.add(h2);
		houseList.add(h123);
		houseList.add(h4);
		houseList.add(h12);
		houseList.add(h3);
		// Collections.sort(houseList, new CmpByBedroomsAndGarage());
		Willow.sortByBedroomsAndGarage(houseList);
		String results = "";
		for (Willow w : houseList)
			results += w;
		assertEquals("The sortByBedroomsAndGarage method is not implemented correctly",
				"[c|5|false|0.3|5000.0][a|4|true|0.5|4000.0][a|4|true|0.5|3000.0][d|3|true|1.0|3750.0][b|3|false|0.75|3500.0][z|0|true|0.4|4000.0][x|0|false|0.5|3500.0]",
				results);
	}

	@Test
	public void CmpByBedroomsAndGarageTest() { //test compare method in CmpByBedroomsAndGarage class
		int val1 = bg.compare(h1, h2); // returns 1
		int val2 = bg.compare(h4, h3); // returns -1
		int val3 = bg.compare(h2, h4); // returns -1
		int val4 = bg.compare(h12, h21); // returns 1
		assertEquals("The CmpByBedroomsAndGarage compare method is not implemented correctly", 0,
				val1 + val2 + val3 + val4);
	}

	@Test
	public void sortByNeighborhoodAndPriceTest() { //test sortByNeighborhoodAndPrice method in CmpByBedroomsAndGarage class

		houseList.add(h1);
		houseList.add(h123);
		houseList.add(h2);
		houseList.add(h3);
		houseList.add(h4);
		houseList.add(h12);
		// Collections.sort(houseList, new CmpByNeighborhoodAndPrice());
		Willow.sortByNeighborhoodAndPrice(houseList);
		String results = "";
		for (Willow w : houseList)
			results += w;
		assertEquals("The sortByNeighborhoodAndPrice method is not implemented correctly",
				"[a|4|true|0.5|4000.0][a|4|true|0.5|3000.0][b|3|false|0.75|3500.0][c|5|false|0.3|5000.0][d|3|true|1.0|3750.0][z|0|true|0.4|4000.0]",
				results);
	}

	@Test
	public void sortByNeighborhoodAndPriceTest2() { //test sortByNeighborhoodAndPrice method in CmpByBedroomsAndGarage class
		houseList.add(h123);
		houseList.add(h21);
		houseList.add(h1);
		houseList.add(h2);
		houseList.add(h3);
		houseList.add(h4);
		houseList.add(h12);
		// Collections.sort(houseList, new CmpByNeighborhoodAndPrice());
		Willow.sortByNeighborhoodAndPrice(houseList);
		String results = "";
		for (Willow w : houseList)
			results += w;
		assertEquals("The sortByNeighborhoodAndPrice method is not implemented correctly",
				"[a|4|true|0.5|4000.0][a|4|true|0.5|3000.0][b|3|false|0.75|3500.0][c|5|false|0.3|5000.0][d|3|true|1.0|3750.0][x|0|false|0.5|3500.0][z|0|true|0.4|4000.0]",
				results);
	}

	@Test
	public void CmpByNeighborhoodAndPriceTest() { // //test compare method in CmpByBedroomsAndGarage class

		int val1 = np.compare(h1, h2); // returns 1
		int val2 = np.compare(h4, h3); // returns -1
		int val3 = np.compare(h1, h123); // returns -1
		int val4 = np.compare(h123, h1); // returns 1
		assertEquals("The CmpByBedroomsAndGarage compare method is not implemented correctly", 0,
				val1 + val2 + val3 + val4);
	}
}
