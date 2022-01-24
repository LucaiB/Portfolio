/*Microwave UML
 *
 * Microwave
 * ------------
 * - isOn : boolean
 * - LOW : int
 * - MEDIUM : int
 * - HIGH : int
 * - modelName : string
 * - color : string
 * - manufactureDate : string
 * ------------
 * + defrost
 * + popcorn
 * + cook
 */

public class Microwave {

	private boolean isOn;
	private final int LOW = 1, MEDIUM = 2, HIGH = 3;
	private int heatLevel;
	private String model, colour, yearMade;
	private boolean isRunning;
	
	public void defrost(int seconds) {};	
	public void cook(int seconds){}; 
	public void autoPopcorn() {};
	
	
	
	// Auto generated accessors and modifiers
	public boolean isOn() {
		return isOn;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public String getYearMade() {
		return yearMade;
	}
	public void setYearMade(String yearMade) {
		this.yearMade = yearMade;
	}
	public void setOn(boolean isOn) {
		this.isOn = isOn;
	}
	public int getHeatLevel() {
		return heatLevel;
	}
	public void setHeatLevel(int heatLevel) {
		this.heatLevel = heatLevel;
	}
	public boolean isRunning() {
		return isRunning;
	}
	public void setRunning(boolean isRunning) {
		this.isRunning = isRunning;
	}
	public int getLOW() {
		return LOW;
	}
	public int getMEDIUM() {
		return MEDIUM;
	}
	public int getHIGH() {
		return HIGH;
	}
}
