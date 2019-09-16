#include<iostream>
using namespace std;
void build_array(double arr[])
{
	for(int i=0;i<5;i++)
	{
		if(!cin)
			exit(0);
		else
			cin>>arr[i];
	}
}
void print_array(const double arr[])
{
	cout<<"Array: ";
	for(int i=0;i<5;i++)
		cout<<arr[i]<<" ";
	cout<<"\n";
}
double sum_array(const double arr[])
{
	double sum=0;
	for(int i=0;i<5;i++)
		sum+=arr[i];
	return sum;	
}
main()
{
	cout<<"Enter 5 numbers:\n";
	double arr[5];
	build_array(arr);
	print_array(arr);
	cout<<"Sum="<<sum_array(arr)<<"\n";
}
