import java.util.Scanner;
public class a4q4{ 
	public static void main(String[] args){
		Scanner sc= new Scanner (System.in);
		
		System.out.print("Count from: ");
		int i=sc.nextInt();
		System.out.print("Count to: ");
		int j=sc.nextInt();
		System.out.print("Count by:");
		int k=sc.nextInt();
		
		for(int m=i; m<=j; m=m+k)
			System.out.print(m+" ");
		
	}

}