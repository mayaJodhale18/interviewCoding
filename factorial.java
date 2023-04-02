package CrackIt;
import java.util.*;
public class factorial {
	public static void main (String args[])
	{
		int fact=1;
		int i=1;
		Scanner sc=new Scanner (System.in);
		System.out.println("enter no");
	int n=sc.nextInt();
	fact=loopi(n);
	System.out.println(fact);
//		for(int i=2;i<=n;i++)
//		{
//			fact=fact*i;
//		}
//		System.out.println(fact);
//		
		
	}

	private static int loopi( int n) {
if(n==0)

	return 1;
else
	return (n*loopi(n-1));

	}

}