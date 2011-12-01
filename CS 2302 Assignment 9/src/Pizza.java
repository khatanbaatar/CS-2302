public class Pizza extends MenuItem {

	private boolean sausage, pepperoni, onions, mushrooms;

	/**
	 * @param sausage - Adds sausage to the pizza
	 * @param pepperoni - Adds pepperoni to the pizza
	 * @param onions - Adds onions to the pizza
	 * @param mushrooms - Adds mushroom to the pizza
	 */
	public Pizza(boolean sausage, boolean pepperoni, boolean onions,
			boolean mushrooms) {
		super("pizza");
		this.sausage = sausage;
		this.pepperoni = pepperoni;
		this.onions = onions;
		this.mushrooms = mushrooms;
	}

	/**
	 * @param sausage Adds sausage to the pizza at a cost of $1
	 */
	public void setSausage(boolean sausage) {
		this.sausage = sausage;
	}

	/**
	 * @param pepperoni Adds pepperoni to the pizza at a cost of $1.50
	 */
	public void setPepperoni(boolean pepperoni) {
		this.pepperoni = pepperoni;
	}

	/**
	 * @param onions Adds onions to the pizza at a cost of $.75
	 */
	public void setOnions(boolean onions) {
		this.onions = onions;
	}

	/**
	 * @param mushrooms Adds onion to the pizza at a cost of $.90
	 */
	public void setMushrooms(boolean mushrooms) {
		this.mushrooms = mushrooms;
	}

	/* (non-Javadoc)
	 * @see MenuItem#getCost()
	 * @return - The cost of the pizza with it's current toppings
	 */
	@Override
	public double getCost() {
		double result = 5;
		if (sausage)
			result += 1;
		if (pepperoni)
			result += 1.5;
		if (onions)
			result += .75;
		if (mushrooms)
			result += .90;
		return result;
	}

	/* (non-Javadoc)
	 * @see MenuItem#getDescription()
	 * @return - The description of the pizza with its current toppings
	 */
	@Override
	public String getDescription() {
		String s = getName();
		if (sausage)
			s += " with sausage";
		if (pepperoni)
			s += " with pepperoni";
		if (onions)
			s += " with onions";
		if (mushrooms)
			s += " with mushrooms";
		return s;
	}

}
