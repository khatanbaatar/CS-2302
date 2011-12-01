import java.util.ArrayList;


public class Zoo {
	
	/**
	 * Creates a empty ArrayList of animals
	 */
	private ArrayList<Animal> animal = new ArrayList<Animal>();
	
	/**
	 * @param newAnimal Adds this animal to the List of animals
	 */
	public void addAnimal (Animal newAnimal){
		animal.add(newAnimal);
	}
	
	/**
	 * @return all the characteristics of the animals in the Arraylist
	 */
	public String combinedCharacteristics(){
		String s = "";
		for(int x = 0; x < animal.size(); x++){
			s += animal.get(x).characteristics() + '\n';
		}
		return s;
		
	}
}
