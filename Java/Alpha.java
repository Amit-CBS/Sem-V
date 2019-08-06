//object.compareTo(Argument)
class Alpha
{
	public static void main(String args[])
	{
		String arr[]=args;
		int l=args.length;
		for(int i=0;i<l;i++)
		{
			for(int j=i+1;j<l;j++)
			{
				if(arr[i].compareToIgnoreCase(arr[j])>0)
				{
					String temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for(int i=0;i<l;i++)
			System.out.println(arr[i]);
	}
}