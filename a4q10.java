import java.util.Scanner;
public class a4q10 {
public static void main(String[] args){
	System.out.println("Enter a no. for which you want to find the multiplication table:");
	Scanner sc=new Scanner(System.in);
	int a= sc.nextInt();
	
	for(int i=1; i<=10; i++)
	{
		System.out.println(a+"x"+i+"="+a*i);
	}
		// TODO Auto-generated method stub

	}

}
