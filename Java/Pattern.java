class Pattern
{
	public static void main(String args[])
	{
		int n=Integer.parseInt(args[0]);
		int arrN[][]=new int[n][];
		char arrC[][]=new char[n][];
		for(int i=0;i<n;i++)
		{
			arrN[i]=new int[i+1];
			arrC[i]=new char[i+1];
		}
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<=i;j++)
			{
				arrN[i][j]=Math.abs(j%2-1);
				System.out.print(arrN[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<=i;j++)
			{
				arrC[i][j]='*';
				System.out.print(arrC[i][j]+" ");
			}
			System.out.println();
		}
	}
}