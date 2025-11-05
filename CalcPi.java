// Computes an approximation of PI.
public class CalcPi {
	private static final int MULTIPLIER = 4;

	public static void main(String [] args) { 
	    int run_limit = Integer.parseInt(args[0]);
		double pi = Math.PI;
		double divider = 3.0;
		int count = 0;
		double new_pi4 = 0.0;
		while(count<run_limit)
		{	
			if (count==0)
			{
				new_pi4 = 1.0;
			}
			else
			{
				if (count%2==0)
				{
					new_pi4 = new_pi4 + (1.0/divider);
				}
				else
				{
					new_pi4 = new_pi4 - (1.0/divider);
				}
				divider = divider + 2.0;
			}
			count++;
		}
		double new_pi = new_pi4 * MULTIPLIER;
		System.out.println("pi according to Java: " + pi);
		System.out.println("pi, approximated:     " + new_pi);
	}
}