package CrackIt;

public class AlternativePrimeNumber {


	public static void main(String[] args) {
		int a=2;
		int b=100;
		int temp=1;
		for(int i=a;i<=b;i++)
		{
			int cnt=0;
			int num=i;
			for(int j=2;j<num;j++)
			{
				if(num%j==0)
				{
					cnt++;	
				}
			}
			if(cnt==0)
			{
				temp++;
				if(temp%a==0)
					System.out.println(num);
			}
		}
	}

}
