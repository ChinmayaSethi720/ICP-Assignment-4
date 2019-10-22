import java.util.Scanner;
public class a4q14{
public static void main(String args[]){
	
 		Scanner sc= new Scanner(System.in);
 		System.out.print("Enter a number:");
 		int x=sc.nextInt();
 		int m=x;
 		int c=0;
 		double g=x%2;
 		if(g==0.0)
 		{
 			while(x>0)
 			{
 				if (x%2==0)
 					c=c+1;
 				x=x/2;
 			}
 		}
 		else
 		{
 			while(x>0)
 			{
 				if (x%2==0)
 					c=c+1;
 				x=x/2;
 			} 
 		}	
 		System.out.println("Largest power of 2:"+c);
 		double n=Math.pow(2,c);
 		int y=(int)(n);
 		System.out.println("Largest power of 2 which is less than or equal to "+y+" is:");
 	}
 }