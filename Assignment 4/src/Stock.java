import tester.Validation;

/**
 * @author Andres Castro Assignment 4
 *
 */
public class Stock {
	private String name;
	private String symbol;
	private double CurrentPrice;
	private double ChangePercent;
	private double PreviousClosingPrice;

	/**
	 * @param s Name of the Stock
	 * @param n Symbol of the Stock
	 */
	Stock(String s, String n) {
		name = n;
		symbol = s;
	}

	/**
	 * @return The percent difference from the previous closing price to the current one
	 */
	public double getChangePercent() {
		if(CurrentPrice == PreviousClosingPrice){
			Validation.reportError("Current price can't equal preivous closing price");
		}
		else{
			ChangePercent = Math.abs((PreviousClosingPrice - CurrentPrice ) / PreviousClosingPrice );
		}
		return ChangePercent;
	}

	/**
	 * @return Current price of the stock
	 */
	public double getCurrentPrice() {
		return CurrentPrice;
	}

	/**
	 * @param currentPrice you want it to be. Can't be below 0
	 */
	public void setCurrentPrice(double currentPrice) {
		if(currentPrice < 0){
			Validation.reportError("Current price can't be below 0");
		}
		CurrentPrice = currentPrice;
	}

	/**
	 * @return The previous closing price
	 */
	public double getPreviousClosingPrice() {
		return PreviousClosingPrice;
	}

	/**
	 * @param previousClosingPrice you want to set thats not below zero
	 */
	public void setPreviousClosingPrice(double previousClosingPrice) {
		if(previousClosingPrice == 0){
			Validation.reportError("Previous Closing Price can't be ZERO");
		}
		PreviousClosingPrice = previousClosingPrice;
	}

	/**
	 * @return the symbol of the stock
	 */
	public String getSymbol() {
		return symbol;
	}

	/**
	 * @param symbol sets a symbol for the stock
	 */
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	/**
	 * @param name sets a name for the stock
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return gets the name for the stock
	 */
	public String getName() {
		return name;
	}

}
