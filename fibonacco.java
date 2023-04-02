package CrackIt;
import java.util.*;
public class fibonacco {

	public static void main(String[] args) {
		int a=0;
		int b=1;
		int c=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter value of n");
		int n = s.nextInt();
		for(int i=2;i<n;i++)
		{
			c=a+b;
			System.out.println(c);
			a=b;
			b=c;
		}
	}

}
