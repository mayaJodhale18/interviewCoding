package CrackIt;

public class reverseString {

	public static void main(String[] args) {
		String s="maya jondhale";
		String sa[]=s.split("");
		loopi(0,s,sa);

	}

	private static void loopi(int i, String s, String[] sa) {
		if(i<sa.length)
		{
			String temp=sa[i];
			String s1="";
			int j=temp.length()-1;
			s1=loopj(i,j,sa,temp,s1);
			System.out.print(s1+" ");
			loopi(++i,s,sa);
		}
	}

	private static String  loopj(int i, int j, String[] sa, String temp, String s1) {
		{
			if(j>=0)
			{
				s1=s1+temp.charAt(j);
				loopj(i,--j,sa,temp,s1);
				
				
			}
			return s1;
		}		
	}

}
