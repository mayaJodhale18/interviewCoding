package CrackIt;
import java.util.*;
public class primeNumber 
{
	public static void main(String[] args) 
	{
		int cnt=0;
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the no");
		int n=s.nextInt();
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
				cnt++;
		}
		if(cnt==0)
			System.out.println("prime");
		else
			System.out.println("not prime");
	}


}

