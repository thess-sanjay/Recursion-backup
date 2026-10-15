
//fibonacci series using recursion

class FiboInRecursion 
{
	public static void fibo(int n, int a, int b)
	{
		if(n == 0 ) return;
		
		int c = a + b;
		System.out.print(c + " ");
		
		fibo(n-1, b, c);
	}
	
	public static void main(String[] args) 
	{
		int n = 7;
		int a = 0;
		int b = 1;
		
		System.out.print(a + " " + b + " ");
		fibo(n-2, a, b);
	}
}
