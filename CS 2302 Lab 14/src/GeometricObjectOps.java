import java.util.ArrayList;


public class GeometricObjectOps {

	/**
	 * @param figures an List of Geometric Objects
	 * @return the area of all the objects in the List
	 */
	public static double sumAreas (ArrayList<GeometricObject> figures){
		double temp = 0;
		GeometricObject g;
		for (int i = 0; i < figures.size(); i++) {
			g = figures.get(i);
			temp += g.area();
		}
		return temp;
	}
	
	/**
	 * @param figures an List of Geometric Objects
	 * @return Perimeter of all the objects in the array added up
	 */
	public static double sumPerimeters (ArrayList<GeometricObject> figures){
		double temp = 0;
		GeometricObject g;
		for (int i = 0; i < figures.size(); i++) {
			g = figures.get(i);
			temp += g.perimeter();
		}
		return temp;
	}
	
	
}
