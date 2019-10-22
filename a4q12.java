import java.util.Scanner;
public class a4q12{
public static void main(String args[]){
		double a,b,c,d,e;
		System.out.println("\t\t\t\t     N"+" \t\t\t   "+ "NlogN"+" \t\t\t     "+ "N^2"+ " \t\t    "+" N^3"+ " \t\t\t\t\t        "+ "2^N");
		for(double N=16.0; N<=2048; N*=2)
		{
			a=Math.log(N);
			b=N*Math.log(N);
			c=Math.pow(N,2);
			d=Math.pow(N,3);
			e=Math.pow(2,N);
			System.out.println(a+" \t\t    "+N+" \t\t    "+b+" \t\t    "+c+" \t\t    "+d+" \t\t    "+" \t\t       "+e);
		}
	}
}