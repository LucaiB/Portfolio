public class DVD extends AmazonProduct {

	final double taxRate = 0.03;

	public DVD(double price, String name, boolean prime) {
		super(price, name, CategoryOptions.ENTERTAINMENT, prime);
	}

	/**
	 * Calculate the tax on DVDs. The tax rate for Shirts is 7%
	 */
	@Override
	public double calcTax() {
		return this.getPrice() * taxRate;
	}

	@Override
	public boolean isCouponEligible() {
		return true;
	}

}
