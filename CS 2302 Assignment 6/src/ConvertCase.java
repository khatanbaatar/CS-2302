import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;


public class ConvertCase {
	public static void main(String[] args) throws Exception
	{
		if (args.length != 2)
		{
			System.out.println ("usage java Athens inputFile outputFile");
			System.exit(0);
		}
		File sourceFile = new File (args[0]);
		if (!sourceFile.exists())
		{
			System.out.println ("The file " + args[0] + " does not exist");
			System.exit(0);
		}
		File destFile = new File (args[1]);
		if (destFile.exists())
		{
			System.out.println ("The file " + args[1] + " already exists");
			System.exit(0);
		}
		Scanner input = new Scanner (sourceFile);
		PrintWriter output = new PrintWriter (destFile);
		Convert.translate(input, output);
	}
}
