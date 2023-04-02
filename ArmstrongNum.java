package CrackIt;
import java.util.*;
public class ArmstrongNum {

	public static void main(String[] args) {
		int sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter no");
		int num=sc.nextInt();
		int n=num;
		//System.out.println("please enter no");
	
		while(n>0)
		{
			int rem=n%10;
			sum=sum+rem*rem*rem;
			num=n/10;
		}
		System.out.println(sum);
		if(num==sum)
			System.out.println("arm");
		else
			System.out.println("not");
	}

}
