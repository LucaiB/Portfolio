import javax.swing.event.ChangeEvent;

import org.junit.Test;


/**
 * @author Your Friendly CS professors. 
 *
 */
public class CalculatorTest {

	@Test
	public void testFutureAgeCaculation() {
		Calculator c = new Calculator(50, 7, 18, 0.07);
		c.setFutureAge();
		assert(c.futureAge == 25);
	}
	
	@Test
	public void testFutureAgeLabel() {
		Calculator c = new Calculator(50, 7, 18, 0.07);
		c.setFutureAge();
		assert(c.ageLabel.getText() == "Age");
		assert(c.futureAgeLabel.getText().equals("Future Age: 25"));
	}
	
	@Test
	public void testInvestmentValue() {
		Calculator c = new Calculator(50, 7, 18, 0.07);
		double value = 1500.01;
		c.setInvestmentValue(value);
		testInvestmentDisplays(c,1500.01);
		
	}

	private void testInvestmentDisplays(Calculator c, double value) {
		assert c.investmentDisplayValue.getText().equals("Investment: $"+ Math.round(value));
		assert(c.investmentValue == value);
	}
	
	@Test
	public void testGetMonthlySavings() {
		Calculator c = new Calculator(150, 7, 18, 0.07);
		assert(c.monthlySaveDisplayAmount.getText().equals("$"+150));
		assert(c.monthlySavings == 150);
	}
	
	@Test 
	public void testSetMonthlySavings() {
		Calculator c = new Calculator(150, 7, 18, 0.07);
		for(int i = 0; i < 650; i++) {
			c.setMonthlySavings(i);
			assert(c.monthlySaveDisplayAmount.getText().equals("$"+i));
			assert(c.monthlySavings == i);
		}
	}
	
	/*
	 * Testing the listeners
	 */
	@Test
	public void testAgeListener() {
		Calculator c = new Calculator(150, 7, 18, 0.07);
		c.ageSpinner.setValue(30);
		ChangeEvent e = new ChangeEvent(c.ageSpinner);
		c.new AgeListener().stateChanged(e);
		assert(c.getCurrentAge() == 30);
		assert(c.futureAge == 37);
		assert(c.futureAgeLabel.getText().equals("Future Age: 37"));
	}

	/*
	 * Testing the listeners
	 */
	@Test
	public void testMonthListener() {
		Calculator c = new Calculator(1, 7, 18, 0.07);
		c.monthlySaveSlider.setValue(500);
		ChangeEvent e = new ChangeEvent(c.monthlySaveSlider);
		c.new MonthSavingListener().stateChanged(e);
		assert(c.monthlySaveDisplayAmount.getText().equals("$"+500));
		assert(c.monthlySavings == 500);
		testInvestmentDisplays(c,54314.48737571583);   
	}
	
	@Test
	public void testYearListener() {
		Calculator c = new Calculator(1, 7, 18, 0.07);
		c.numYearsSlider.setValue(15);
		ChangeEvent e = new ChangeEvent(c.numYearsSlider);
		c.new NumYearsListener().stateChanged(e);
		assert(c.numberOfYearsLabel.getText().equals("Number of Years"));
		assert(c.getNumYears() == 15);
		assert(c.futureAge == 33);
		assert(c.futureAgeLabel.getText().equals("Future Age: 33"));
		testInvestmentDisplays(c,318.81124345219246);
	
	}
	
	@Test
	public void testMultipleListeners() {
		Calculator c = new Calculator(1, 7, 15, 0.07);
		c.ageSpinner.setValue(18);
		ChangeEvent e = new ChangeEvent(c.ageSpinner);
		c.new AgeListener().stateChanged(e);
		assert(c.getCurrentAge() == 18);
		assert(c.futureAge == 25);
		assert(c.futureAgeLabel.getText().equals("Future Age: 25"));
		c.monthlySaveSlider.setValue(500);
		e = new ChangeEvent(c.monthlySaveSlider);
		c.new MonthSavingListener().stateChanged(e);
		assert(c.monthlySaveDisplayAmount.getText().equals("$"+500));
		assert(c.monthlySavings == 500);
		c.numYearsSlider.setValue(15);
		e = new ChangeEvent(c.numYearsSlider);
		c.new NumYearsListener().stateChanged(e);
		assert(c.numYearsDisplay.getText().equals("15 years"));
		assert(c.getNumYears() == 15);
		assert(c.futureAge == 33);
		assert(c.futureAgeLabel.getText().equals("Future Age: 33"));
		System.out.println(c.investmentValue);
		testInvestmentDisplays(c,159405.62172609623);
		
	}
}