import java.util.ArrayList;


/**
 * @author AndresMobile
 *
 */

public class Order {
	private ArrayList<MenuItem> menu;
	
	/**
	 *Constructor that makes and empty MenuItem List
	 */
	public Order() {
		menu = new ArrayList<MenuItem>();
	}

	/**
	 * @param item - A MenuItem item that will be added to the order
	 */
	public void add (MenuItem item){
		
		menu.add(item);
	}
	
	/**
	 * @return - a Description of all the Items in the order
	 */
	public String orderDescription(){
		String s = "";
		for(int x = 0; x < menu.size(); x++){
			s += menu.get(x).getDescription() + '\n';
		}
		return s;
		
	}
	
	/**
	 * @return - The total cost of all the items in the order
	 */
	public double orderCost(){
		double result = 0;
		for(int x = 0; x < menu.size(); x++){
			result += menu.get(x).getCost();
		}
		return result;
    }
}
