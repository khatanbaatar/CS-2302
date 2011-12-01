import java.util.Random;
import java.util.Scanner;

public class NumberGuess {
	private int minNumber = 1;
	private int maxNumber = 100;
	private int pickedNumber;
	private int numGuesses = 0;
	private Random randomNumGen = new Random();

	/**
	 * Constructor that takes no parameters It uses the default min and max
	 */
	public NumberGuess() {
		int numValues = this.maxNumber - this.minNumber + 1;
		this.pickedNumber = this.randomNumGen.nextInt(numValues);
		this.pickedNumber += this.minNumber;
	}

	/**
	 * Constructor that takes a min and max It uses the passed min and max
	 * 
	 * @param min
	 *            the minimum number in the range
	 * @param max
	 *            the maximum number in the range
	 */
	public NumberGuess(int min, int max) {
		this.minNumber = min;
		this.maxNumber = max;
		int numValues = this.maxNumber - this.minNumber + 1;
		this.pickedNumber = this.randomNumGen.nextInt(numValues);
		this.pickedNumber += this.minNumber;
	}

	public void pickNumber() {
		int numValues = this.maxNumber - this.minNumber + 1;
		this.pickedNumber = this.randomNumGen.nextInt(numValues);
		this.pickedNumber += this.minNumber;
	}

	public void playGame() {
		boolean done = false;
		Scanner scan = new Scanner(System.in);

		// loop till guess is correct
		while (!done) {
			System.out.println("Please Guess A Number: ");
			int guess = scan.nextInt();
			// increment the number of guesses
			this.numGuesses++;

			// we need to check the guess by comparing it to pickedNumber
			if (guess == this.pickedNumber) {
				// tell the user she/he was right
				System.out.println("Congrats you were right!");
				// set done to true
				done = true;
			} else if (guess < this.pickedNumber) {
				// we need to tell the user too low
				System.out.println("To low! Guess higher!");
			} else {
				// tell the user the guess is too high
				System.out.println("To high! Guess lower!");
			}
		}
	}

}
