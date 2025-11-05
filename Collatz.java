// Demonstrates the Collatz conjecture.
public class Collatz {
	private static final int TARGET = 1;
	private static final int EVEN_DIVISOR = 2;
	private static final int ODD_MULTIPLIER = 3;
	private static final int ODD_ADDEND = 1;
	private static final String VERBOSE_MODE = "v";

	public static void main(String[] args) {
		int N = Integer.parseInt(args[0]);
		String mode = args[1];

		for (int seed = 1; seed <= N; seed++) {
			long current = seed;
			int steps = 0;
			String sequence = "";

			if (mode.equals(VERBOSE_MODE)) {
				sequence += current;
			}

			while (current != TARGET) {
				if (current % EVEN_DIVISOR == 0) {
					current /= EVEN_DIVISOR;
				} else {
					current = (current * ODD_MULTIPLIER) + ODD_ADDEND;
				}

				steps++;

				if (mode.equals(VERBOSE_MODE)) {
					sequence += " " + current;
				}
			}

			if (mode.equals(VERBOSE_MODE)) {
				System.out.println(sequence + " (" + (steps + 1) + ")");
			}
		}

		System.out.println("Every one of the first " + N + " hailstone sequences reached 1.");
	}
}
