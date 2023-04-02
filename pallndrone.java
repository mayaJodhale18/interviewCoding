package CrackIt;

public class pallndrone {

	public static void main(String[] args) {
		int n=121;
		int sum=0;
		while(n>0)
		{
			int rem=n%10;
			n=n/10;
			sum=sum*10+rem;
		}
		System.out.println(sum);
	}

}
