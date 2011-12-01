import java.util.ArrayList;

import tester.Testing;
import tester.Validation;


public class TestGeometricObject implements Testing
{

	public static void main(String[] args)
	{
		Validation.run(new TestGeometricObject());
	}

	@Override
	public void doTests()
	{
		Octagon oct = new Octagon (-2);
		Validation.shouldHaveReportedError();
		oct = new Octagon (0);
		Validation.shouldHaveReportedError();
		oct = new Octagon (2);
		Validation.shouldBeEqual(oct.getSide(), 2.0);
		Validation.shouldBeEqual(oct.perimeter(), 16.0);
		Validation.shouldBeEqual(oct.area(), 8 * (1 + Math.sqrt(2)));
		ArrayList<GeometricObject> l = new ArrayList<GeometricObject>();
		Validation.shouldBeEqual(GeometricObjectOps.sumAreas(l), 0.0);
		Validation.shouldBeEqual(GeometricObjectOps.sumPerimeters(l), 0.0);
		l.add(oct);
		l.add(new Circle (4));
		l.add(new Rectangle (3, 2));
		l.add(new Triangle (3, 4, 5));
		double sumAreas = GeometricObjectOps.sumAreas(l);
		Validation.shouldBeEqual(sumAreas, 20 + 16 * Math.PI + 8 * Math.sqrt(2));
		double sumPerimeters = GeometricObjectOps.sumPerimeters(l);
		Validation.shouldBeEqual(sumPerimeters, 38 + 8 * Math.PI);
	}

}
