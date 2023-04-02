package CrackIt;

public class StringPalindrone {

	public static void main(String[] args) {
		String s="mam";
		String tem="";
		System.out.println(s);
		for(int i=s.length()-1;i>=0;i--)
		{
			tem=tem+s.charAt(i);

		}
		System.out.println(tem);
		if(s.equals(tem))
			System.out.println("palindrone");
		else
			System.out.println("not palindron");

	}

}
