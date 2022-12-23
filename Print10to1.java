public class Print10to1 {
	public static void print(int n)
	{
		if(n >= 1)
		{
			System.out.println(n);
			print(n-1);
		}
	}
	public static void main(String[] args)
	{
		print(10);
	}

	
}
