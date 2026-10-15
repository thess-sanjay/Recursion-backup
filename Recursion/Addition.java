public class Addition
{
	public static int add(int n)
	{
		if(n==0) return 0;
		
		return n + add(n-1);
	}
	
	public static void main(String[] args) 
	{
		int res = add(12);
		System.out.println(res);
	}
}
