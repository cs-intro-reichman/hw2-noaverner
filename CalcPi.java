// Computes an approximation of PI.
public class CalcPi {
	private static final int MULTIPLIER = 4;

	public static void main(String[] args) {
		int numberOfTerms = Integer.parseInt(args[0]);
		double sum = 0.0;

		for (int i = 0; i < numberOfTerms; i++) {
			double denominator = (2.0 * i) + 1.0;

			if (i % 2 == 0) {
				sum += (1.0 / denominator);
			} else {
				sum -= (1.0 / denominator);
			}
		}

		double piApproximation = sum * MULTIPLIER;

		System.out.println("pi according to Java: " + Math.PI);
		System.out.println("pi, approximated: " + piApproximation);
	}
}
