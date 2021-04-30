#include<iostream>
using namespace std;
main()
{
    int *arr=new int[10];
    double sum;
    for (int i=0;i<10;i++)
    {
        arr[i]=i;
        sum+=arr[i];
    }
    cout<<"Reverse: ";
    for (int i=0;i<10;i++)
        cout<<arr[9-i]<<" ";
    cout<<"\nSum: "<<sum<<"\nAverage: "<<sum/10<<"\n";
    delete[] arr;
    cout<<arr[6]<<"\n";
}