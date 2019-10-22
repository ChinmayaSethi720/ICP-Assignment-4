import java.util.Scanner;
public class a4q13{
public static void main(String args[]){
	
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter a number:");
		int x=sc.nextInt();
		int m=x;
		int d;
		int sum=0;
		while(x>0)
		{
			d=x%10;
			sum=sum+d;
			x=x/10;
		}
		if(sum%9==0)
			System.out.println(m+" is divisible by 9");
		else System.out.println(m+" is not divisible by 9");
	}
}