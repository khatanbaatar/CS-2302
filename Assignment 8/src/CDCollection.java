import java.util.ArrayList;

import tester.Validation;

/**
 * @author AndresMobile
 *
 */
public class CDCollection {

	private ArrayList<CD> data;

	/**
	 * postcondition: CD collection is empty
	 */
	public CDCollection() {

		data = new ArrayList<CD>();
	}

	/**
	 * postcondition: e has been added to top of stack
	 * @param e - A CD object to add to the collection
	 */
	public void add(CD e) {
		data.add(e);
	}

	/**
	 * @return How many CD's you have in your collection
	 */
	public int numberOfCDs() {
		return data.size();
	}

	/**
	 * @return The total cost of all the cd's in your collection.
	 */
	public double totalCost() {
		double cost = 0;
		CD c;
		for (int i = 0; i < data.size(); i++) {
			c = data.get(i);
			cost += c.getCost();
		}
		return cost;

	}

	/**
	 * PreCondition - CD collection can't be empty
	 * @return The average price of all the CD's in your collection
	 */
	public double averageCost() {
		double cost = 0;
		CD c;
		double average = 0;
		if (data.isEmpty())
			Validation.reportError("empty collection");
		else {
			for (int i = 0; i < data.size(); i++) {
				c = data.get(i);
				cost += c.getCost();
			}
		}
		average = cost / data.size();
		return average;
		
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return data.toString();
	}
	
	
}
