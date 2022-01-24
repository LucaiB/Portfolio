/*
 * @Author: Lucas Banerji
 * lcb5tz
 * cohort-s4-25
 * 10/29/2020
 */
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSlider;
import javax.swing.JSpinner;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Calculator extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * Instance variables for State of Calculator Don't change the variable names
	 * they are used by test case
	 */
	protected int monthlySavings;
	protected int numYears;
	protected int currentAge;
	protected double rateOfReturn;
	protected double investmentValue;
	protected int futureAge;

	/**
	 * This represents the elements that are displayed on screen. Don't change the
	 * name of these variables they ar used by the test cases.
	 */
	protected JLabel ageLabel;
	protected JSpinner ageSpinner;
	protected JLabel monthSaveLabel;
	protected JSlider monthlySaveSlider;
	protected JLabel monthlySaveDisplayAmount;
	protected JLabel numYearsDisplay;
	protected JLabel futureAgeLabel;
	protected JLabel investmentDisplayValue;
	protected JLabel rateOfReturnDisplay;
	protected JLabel numberOfYearsLabel;
	protected JSlider numYearsSlider;

	/**
	 * A getter for the monthlySaving instance variable
	 * 
	 * @return the monthSavings
	 */
	public int getMonthlySavings() {
		return monthlySavings;
	}

	public void setMonthlySavings(int ms) {
		monthlySavings = ms;
		monthlySaveDisplayAmount.setText("$" + ms); // when setting, also change label
	}

	public int getCurrentAge() {
		return currentAge;
	}

	public void setCurrentAge(int ca) {
		currentAge = ca;
	}

	public double calculateInvestmentValue() { // PMT � (((1 + r/n)^(nt) - 1) / (r/n)) � (1+r/n)
		return monthlySavings
				* ((Math.pow(1 + getRateOfReturn() / 12, 12 * getNumYears()) - 1) / (getRateOfReturn() / 12))
				* (1 + getRateOfReturn() / 12);
	}

	public void setFutureAge() {
		futureAge = currentAge + numYears;
		futureAgeLabel.setText("Future Age: " + futureAge); // when setting, also change label
	}

	public int getFutureAge() {
		return futureAge;
	}

	public String getFutureAgeDisplayText() {
		return futureAgeLabel.getText();
	}

	public void setInvestmentValue(double iv) {
		investmentValue = iv;
		investmentDisplayValue.setText("Investment: $" + Math.round(iv)); // when setting, also change label
	}

	public double getInvestmentValue() {
		return investmentValue;
	}

	public String getInvestmentValueDisplayText() {
		return investmentDisplayValue.getText();
	}

	public int getNumYears() {
		return numYears;
	}

	public void setNumYears(int ny) {
		numYears = ny;
		numYearsDisplay.setText(ny + "years"); // when setting, also change label
	}

	public double getRateOfReturn() {
		return rateOfReturn;
	}

	/**
	 * (
	 *
	 * Listener for age change events.
	 */

	protected class AgeListener implements ChangeListener {

		public void stateChanged(ChangeEvent e) {
			JSpinner source = (JSpinner) e.getSource();
			int value = (int) source.getValue();
			setCurrentAge(value);
			setFutureAge();
			futureAgeLabel.setText("Future Age: " + getFutureAge());
			// investmentDisplayValue.setText("Investment: $" +
			// Math.round(calculateInvestmentValue()));
		}
	}

	/**
	 * 
	 * Listener for month change events.
	 *
	 */
	protected class MonthSavingListener implements ChangeListener {

		public void stateChanged(ChangeEvent e) {
			JSlider source = (JSlider) e.getSource();
			int value = source.getValue();
			setMonthlySavings(value); // set value based on event change
			monthlySaveDisplayAmount.setText("$" + value); // sets label to value of slider
			setInvestmentValue(calculateInvestmentValue()); // change investment value based on change in monthly
															// savings
			investmentDisplayValue.setText("Investment: $" + Math.round(calculateInvestmentValue())); // change display
		}
	}

	/**
	 * Inner classes that implement the handler form listeners These classes
	 * implement the change listeners.
	 */
	protected class NumYearsListener implements ChangeListener {

		public void stateChanged(ChangeEvent e) {
			JSlider source = (JSlider) e.getSource();
			int value = source.getValue();
			setNumYears(value); // set value based on event change
			numYearsDisplay.setText(numYears + " years"); // sets label to new value
			setFutureAge(); // set new future age based on new numYears
			futureAgeLabel.setText("Future Age: " + getFutureAge()); // change label
			setInvestmentValue(calculateInvestmentValue()); // set new investment value based on new numYears
			investmentDisplayValue.setText("Investment: $" + Math.round(calculateInvestmentValue())); // change label
		}
	}

	/**
	 * Class represents the frame. That we will create
	 * 
	 * @param monthlySavings
	 * @param numYears
	 * @param currentAge
	 * @param rateOfReturn
	 */
	public Calculator(int monthlySavings, int numYears, int currentAge, double rateOfReturn) {
		super();
		/*
		 * Set up the default values
		 */
		this.monthlySavings = monthlySavings;
		this.numYears = numYears;
		this.currentAge = currentAge;
		this.rateOfReturn = rateOfReturn;
		/*
		 * Setup close window behavior
		 */
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 587, 363);
		getContentPane().setLayout(null);

		/*------------------------------------------------------------
		 * Logo Section Value Section.
		 * Doesn't show up in the designer.
		 *  You will need to run the program to see it.
		 * ------------------------------------------------------------
		 */
		ImageIcon iconLogo = new ImageIcon("Images/logo-uvacs.png");
		JLabel logoCS = new JLabel();
		logoCS.setIcon(iconLogo);
		logoCS.setBounds(350, 28, 165, 63);
		getContentPane().add(logoCS);

		/*------------------------------------------------------------
		 * monthly contribution section 
		 * ------------------------------------------------------------
		 */
		// Month Saving Title Label
		monthSaveLabel = new JLabel("Monthly Savings");
		monthSaveLabel.setBounds(31, 131, 118, 26);
		getContentPane().add(monthSaveLabel);
		// Month Saving Display Label
		monthlySaveDisplayAmount = new JLabel("$" + getMonthlySavings());
		monthlySaveDisplayAmount.setBounds(469, 137, 46, 14);
		getContentPane().add(monthlySaveDisplayAmount);

		// Slide for selecting Month Savings
		monthlySaveSlider = new JSlider();
		monthlySaveSlider.setSnapToTicks(true);
		// Sets the maximum value of the slide
		monthlySaveSlider.setMaximum(650);
		// Sets the sliders default value
		monthlySaveSlider.setValue(getMonthlySavings());
		// Set the location (x,y, .., ..) and the
		// width and height (..., ..., width, height)
		monthlySaveSlider.setBounds(169, 122, 266, 45);
		// Show the ruler style lines
		monthlySaveSlider.setPaintTicks(true);
		// Spacing between major Ticks
		monthlySaveSlider.setMajorTickSpacing(100);
		// Spacing between minor Ticks
		monthlySaveSlider.setMinorTickSpacing(20);
		// Show labels on Ticks
		monthlySaveSlider.setPaintLabels(true);
		// Add Change listener.
		monthlySaveSlider.addChangeListener(new MonthSavingListener());
		getContentPane().add(monthlySaveSlider);

		ageLabel = new JLabel("Age"); // label for ageSpinner
		ageLabel.setBounds(31, 65, 68, 26);
		getContentPane().add(ageLabel);

		ageSpinner = new JSpinner(); // to change currentAge
		ageSpinner.setValue(Integer.valueOf(currentAge));
		ageSpinner.setBounds(133, 68, 46, 23);
		ageSpinner.addChangeListener(new AgeListener());
		getContentPane().add(ageSpinner);

		numberOfYearsLabel = new JLabel("Number of Years"); // label for numYears
		numberOfYearsLabel.setBounds(31, 212, 106, 26);
		getContentPane().add(numberOfYearsLabel);

		futureAgeLabel = new JLabel("Future Age: " + (currentAge + numYears)); // label for futureAge
		futureAgeLabel.setBounds(10, 276, 116, 31);
		// futureAgeLabel.addComponentListener(new NumYearsListener());
		getContentPane().add(futureAgeLabel);

		rateOfReturnDisplay = new JLabel("Rate: " + getRateOfReturn()); // label for rateOfReturn
		rateOfReturnDisplay.setBounds(215, 276, 68, 31);
		getContentPane().add(rateOfReturnDisplay);

		numYearsSlider = new JSlider(); // JSlider to choose numYears of investment
		numYearsSlider.setSnapToTicks(true);
		numYearsSlider.setValue(numYears);
		numYearsSlider.setMaximum(100);
		numYearsSlider.setPaintTicks(true);
		numYearsSlider.setPaintLabels(true);
		numYearsSlider.setMinorTickSpacing(5);
		numYearsSlider.setMajorTickSpacing(20);
		numYearsSlider.setBounds(169, 212, 266, 53);
		numYearsSlider.addChangeListener(new NumYearsListener());
		getContentPane().add(numYearsSlider);

		numYearsDisplay = new JLabel(getNumYears() + " Years"); // label for numYears
		numYearsDisplay.setBounds(469, 240, 55, 23);
		getContentPane().add(numYearsDisplay);

		investmentDisplayValue = new JLabel("Investment: $" + Math.round(calculateInvestmentValue())); // label for
																										// investmentValue
		investmentDisplayValue.setBounds(330, 280, 165, 23);
		getContentPane().add(investmentDisplayValue);

	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator frame = new Calculator(1, 7, 18, 0.07);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
