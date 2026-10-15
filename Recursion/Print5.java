class Print5
{
	public static void fibonacci(int n, int a, int b)
	{
		if(n == 0) return;
		
		int c = a + b;
		System.out.print(c + " ");
		
		fibonacci(n - 1, b, c);
	}
	
	public static void main(String[] args) 
	{
		int n = 10;
		int a = 0; 
		int b = 1;
		
		System.out.print(a + " " + b + " ");
		
		fibonacci(n-2, a, b);
		
		
	}
}


																																	