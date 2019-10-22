public class a4q11 {
public static void main(String[] args) {
		int sum1=0;
		int sum2=0;
		
	for(int a=1; a<=10; a++)
	{
		int p= (int)Math.pow(a,2);
		sum1+=p;
		sum2+=a;
		
	}
	System.out.println("sum of square of intrgers is "+sum1);
	System.out.println("squsre of sum is "+(int)Math.pow(sum2, 2));
	System.out.println("Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is "+((int)Math.pow(sum2, 2)-sum1));
	}

}
