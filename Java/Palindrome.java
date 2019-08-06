class Palindrome
{
	public static void main(String args[])
	{
		//char ch[]=args[0].toCharArray();
		String s=args[0];
		int l=s.length(), f=1;
		for(int i=0;i<s.length()/2;i++)
		{
			if(s.charAt(i)!=s.charAt(l-i-1))
				f=0;
		}
		if(f==1)
			System.out.println("Palindrome!");
		else
			System.out.println("Not Palindrome!");
	}
}
//java Palindrome Amit madam
//args[]=["amit", "55"]