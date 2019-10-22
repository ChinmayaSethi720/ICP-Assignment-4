import java.util.Scanner;
public class a4q3 {

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.print("Count to: ");
		
		int j=sc.nextInt();
		for(int i=0; i<=j; i++)
			System.out.print(i+" ");
	}

}