// Demonstrates the Collatz conjecture.
public class Collatz {
	private static final String VERBOSE_MODE = "v";

	public static void main(String args[]) {
	    int n = Integer.parseInt(args[0]);
		String mode = args[1];
		if (mode.equals(VERBOSE_MODE))
		{
			int c = 1;
			for (c=1;c<n+1;c++)
			{
				int seed = c;
				int steps = 1;
				System.out.print(seed + " ");
				while(seed!=1 || steps==1)
				{
					if (seed%2==0)
					{
						seed = seed/2;
						System.out.print(seed + " ");
					}
					else
					{
						seed = (3*seed)+1;
						System.out.print(seed + " ");
					}
					steps = steps + 1;
				}
				System.out.print("(" + steps + ")");
				System.out.println();
			}
			System.out.println("Every one of the first " + n + " hailstone sequences reached 1.");
		}
		else
		{
			System.out.println("Every one of the first " + n + " hailstone sequences reached 1.");
		}
	}
}