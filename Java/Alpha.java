//object.compareTo(Argument)
class Alpha
{
	public static void main(String args[])
	{
		//String arr[]=args;
		int l=args.length;
		for(int i=0;i<l;i++)
			for(int j=i+1;j<l;j++)
				if(args[i].compareToIgnoreCase(args[j])>0)
				{
					String temp=args[i];
					args[i]=args[j];
					args[j]=temp;
				}
		for(int i=0;i<l;i++)
			System.out.println(args[i]);
	}
}