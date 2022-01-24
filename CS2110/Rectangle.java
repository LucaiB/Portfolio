/************************
 * 
 * @author Lucas Banerji
 * Stone-s4-25
 *
 ***********************/
public class Rectangle {
	
	// fields
	private double length;
	private double width;
	
	// default constructor (takes no parameters)
	public Rectangle() {
		// length and width assigned default values (4 for length and 2 for width)
		this.length = 4;
		this.width = 2;
	}
	
	// constructor 
	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	
	public String toString()
	{
		return "Width: " + width + "   Length: " + length;
	}
	
	public static void main(String[] args) {
		// Reminder: don't write methods within other methods.
		// Test out toString() method and getters and setters here! (Main method testing) 
        
		Rectangle def = new Rectangle();
		Rectangle rect = new Rectangle(5,6);
		
		System.out.println(def);
		System.out.println(rect);
		
		System.out.println(def.getLength());
		System.out.println(rect.getWidth());
		
		def.setLength(10);
		rect.setWidth(2);
		
		System.out.println(def);
		System.out.println(rect);
	}

}

/*** Output
Width: 2.0   Length: 4.0
Width: 6.0   Length: 5.0
4.0
6.0
Width: 2.0   Length: 10.0
Width: 2.0   Length: 5.0
***/