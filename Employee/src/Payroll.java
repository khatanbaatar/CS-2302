
public class Payroll {

		public static void createPayroll(Employee[] staff){
			
			for( int i = 0; i < staff.length; i++){
				System.out.println(staff[i].getName() + ": " + staff[i].pay());
			}
		}
}
