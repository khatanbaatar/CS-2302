
public class HR {

	public static Employee[] generateStaff(){
		Employee[] staff = new Employee[5];
		Executive e1 = new Executive("bubba", "666-66-6666", 300000000);
		staff[0] = e1;
		e1.setBonus(60000000);
		HourlyWorker e2 = new HourlyWorker("billy Bob", "000-00-0000", 1);
		e2.addHours(38);
		staff[1] = e2;
		
		
		return staff;
	}
}
