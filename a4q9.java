public class a4q9{
	public static void main(String [] args) {
		
		int sum=0;
		int i;
		for(i=0; i<1000; i++)
		{
			if(i%3==0 || i%5==0)
			{
				sum+=i;
			}
		}
		
		System.out.println("the sum of all number below "+i+" that is divisible by 3 and 5 is "+sum);
	}
}