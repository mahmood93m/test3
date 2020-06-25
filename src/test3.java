public class test3
{
	public static void main(String[] args)
	{	final int NUM_FACTS = 300;
		for(int i = 0; i < NUM_FACTS; i++)
			System.out.println( i + "! iss " + factorial(i));
	}
	
	public static int factorial(int n)
	{	int result = 1;
		for(int i = 2; i <= n; i++)
			result *= i;
		return result;
	}
}
