package assignment1;
import java.util.Scanner;

public class total_prime {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("write prime numbers till");
		int prime=sc.nextInt();
		int i,j,p;
		for(prime=2;prime<=prime;prime++)
			
		{
			p=0;
			for(j=2;j<prime;j++)
			{
				if(prime%j==0)
					p=1;
					break;
			}
			if(p==0)
				System.out.prinln(+prime);
		}
	}

}
