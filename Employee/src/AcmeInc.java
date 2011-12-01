
public class AcmeInc {
	
	public static void main(String[] args){
		
		Employee[] staff = HR.generateStaff();
		Payroll.createPayroll(staff);
	}
}
