public class a4q7 {
		public static void main(String[] args){
			
			double sum=0;
			double x=Double.parseDouble(args[0]);
			for(int j=1; j<=x; j++)
			{
				double y=x*(Math.random()*(x-1));
				sum=sum+y;
			}
			double avg=(double)(sum/x);
			System.out.println("Average="+avg);
		}
	}