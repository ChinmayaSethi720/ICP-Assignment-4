
public class a4q2 {
	public static void main(String[] args) {
		int a= Integer.parseInt(args[0]);

		System.out.println("enter the massage");
		
		
		int i=1;
		while(i<a)
		{
		if(i%10==1&&i%100!=11) {
			System.out.println(i+" st Hello");
		}else if(i%10==2&&i%100!=12) {
			System.out.println(i+" nd Hello");
		}else if(i%10==3&&i%100!=13) {
			System.out.println(i+" rd Hello");
		}else 
			System.out.println(i+ " th Hello");
		i++;

	}

}
}