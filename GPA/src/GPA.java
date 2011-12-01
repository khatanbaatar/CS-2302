import java.util.Scanner;

public class GPA {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Grade Point Average
		double gPA;
		// Course Grade Conversion points
		double qP;
		final double a = 4;
		final double b = 3;
		final double c = 2;
		final double d = 1;
		final double f = 0;

		Scanner s = new Scanner(System.in);

		System.out
				.println("Use Course Grade Conversion for grades, A = 4, B = 3, C = 2, D = 1, F = 0");
		System.out
				.println("Enter your grades for the semester one at a time and Hours attempted, Grade1 : ");
		double grade1 = s.nextInt();
		System.out.println("Hours Worth: ");
		String hour1 = s.nextLine();
		double qP1 = (grade1 * hour1);

		System.out.println("Grade2 : ");
		double grade2 = s.nextInt();
		System.out.println("Hours Worth: ");
		double hour2 = s.nextDouble();
		double qP2 = (grade2 * hour2);
		

		System.out.println("Grade3 : ");
		double grade3 = s.nextInt();
		System.out.println("Hours Worth: ");
		double hour3 = s.nextDouble();
		double qP3 = (grade3 * hour3);

		System.out.println("Grade4 : ");
		double grade4 = s.nextInt();
		System.out.println("Hours Worth: ");
		double hour4 = s.nextDouble();
		double qP4 = (grade4 * hour4);

		System.out.println("Grade5 : ");
		double grade5 = s.nextInt();
		System.out.println("Hours Worth: ");
		double hour5 = s.nextDouble();
		double qP5 = (grade5 * hour5);

		qP = (qP1+ qP2 + qP3 + qP4 + qP5);
		double tHours = (hour1 + hour2 + hour3 + hour4 + hour5);
		

		gPA = ((qP/tHours));
		System.out.println("Your GPA for the semester will be: " + gPA);
	}

}
